package web.DAO;

import org.springframework.stereotype.Repository;
import web.models.Role;

@Repository
public interface RoleDAO {
    Role getUserRole();
    Role getAdminRole();
}
