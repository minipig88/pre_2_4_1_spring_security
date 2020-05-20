package web.DAO;

import org.springframework.stereotype.Repository;
import web.models.User;

@Repository
public interface UserDAO {
    User findByUsername (String username);
    void save(User user);
}
