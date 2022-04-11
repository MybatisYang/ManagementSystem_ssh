package service;

import dao.UserDao;
import pojo.User;

import java.util.List;

public class UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> getList() {
        return userDao.getList();
    }

    public void register(User user) {//添加用户
        userDao.add(user);
    }

    public void add(User user) {//添加用户
        userDao.add(user);
    }

    public void update(User user) {
        userDao.update(user);
    }

    public void del(Integer id) throws Exception {
        userDao.del(id);
    }

    public User check(User user) {
        return userDao.check(user);
    }

    public User findUserById(Integer id) {
        return userDao.findUserById(id);
    }

}
