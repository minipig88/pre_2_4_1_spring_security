package web.DAO;

import web.models.Role;

public interface RoleDAO {
    Role getUserRole();
    Role getAdminRole();
}
