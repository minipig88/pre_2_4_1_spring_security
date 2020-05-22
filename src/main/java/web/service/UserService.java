package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    boolean save (User user);
    User findByUsername(String username);
    User getUserById(long id);
    List<User> getAllUser();
    void deleteUser(long id);
}
