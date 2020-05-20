package web.service;

import org.springframework.stereotype.Service;
import web.models.User;

@Service
public interface UserService {
    void save (User user);
    User findByUsername(String username);
}
