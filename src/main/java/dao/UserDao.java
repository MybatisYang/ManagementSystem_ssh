package dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import pojo.User;

import java.util.List;

public class UserDao extends HibernateDaoSupport {
    public List<User> getList() {
        Session session = getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        String sql = "select * from user";
        Query query = session.createSQLQuery(sql).addEntity(User.class);
        List<User> result = (List<User>) query.list();
        transaction.commit();
        session.close();
        return result;
    }

    public User findUserById(Integer id) {
        Session session = getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        User user = session.get(User.class, id);
        transaction.commit();
        session.close();
        return user;
    }

    public void register(User user) {//注册用户
        Session session = getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    public void add(User user) {//添加用户
        Session session = getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(user);
        transaction.commit();
        session.close();
    }

    public void update(User user) {//修改用户
        Session session = getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(user);
        transaction.commit();
        session.close();
    }

    public void del(Integer id) {//删除用户
        Session session = getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(session.get(User.class, id));
        transaction.commit();
        session.close();
    }

    public User check(User user) {
        Session session = getSessionFactory().openSession();
        String hql = "FROM User WHERE userid=:userid and password=:password";
        Query query = session.createQuery(hql);
        query.setParameter("userid", user.getUserid());
        query.setParameter("password", user.getPassword());
        List results = query.list();
        if (results != null && results.size() > 0) return (User) results.get(0);
        else return null;
    }

}
