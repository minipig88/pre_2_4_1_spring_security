package web.DAO;

import org.springframework.stereotype.Repository;
import web.models.User;

import java.util.List;

public interface UserDAO {
    User findByUsername (String username);
    User findUserById(long id);
    void save(User user);
    List<User> getAllUsers();
    void deleteUser(User user);
}
