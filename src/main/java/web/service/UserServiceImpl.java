package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.DAO.RoleDAO;
import web.DAO.UserDAO;
import web.models.User;

import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private RoleDAO roleDAO;
    @Autowired
    private PasswordEncoder passwordEncoder;

    @Transactional
    @Override
    public boolean save(User user) {
        User userFromDB = userDAO.findByUsername(user.getUsername());

        if (userFromDB != null) {
            return false;
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRoles(Collections.singleton(roleDAO.getUserRole()));
        userDAO.save(user);
        return true;
    }

    @Transactional(readOnly = true)
    @Override
    public User findByUsername(String username) throws UsernameNotFoundException {
        User user = userDAO.findByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found");
        }
        return user;
    }

    @Transactional(readOnly = true)
    @Override
    public User getUserById(long id) {
        return userDAO.findUserById(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> getAllUser() {
        return userDAO.getAllUsers();
    }

    @Transactional
    @Override
    public void deleteUser(long id) {
        User user = userDAO.findUserById(id);
        userDAO.deleteUser(user);
    }
}
