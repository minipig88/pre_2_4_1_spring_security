package web.DAO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import web.models.Role;

public class RoleDAOImpl implements RoleDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Role getUserRole() {
      return sessionFactory.getCurrentSession().get(Role.class, 2);
    }

    @Override
    public Role getAdminRole() {
        return sessionFactory.getCurrentSession().get(Role.class, 1);
    }
}
