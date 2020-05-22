package web.DAO;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.models.Role;

@Repository
public class RoleDAOImpl implements RoleDAO{
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Role getUserRole() {
      return sessionFactory.getCurrentSession().get(Role.class, 2L);
    }

    @Override
    public Role getAdminRole() {
        return sessionFactory.getCurrentSession().get(Role.class, 1L);
    }
}
