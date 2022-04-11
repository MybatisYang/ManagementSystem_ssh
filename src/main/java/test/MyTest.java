package test;

import com.opensymphony.xwork2.ActionContext;
import dao.UserDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.User;

public class MyTest {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext resource = new ClassPathXmlApplicationContext("applicationContext.xml");
        ;
        UserDao userDao = (UserDao) resource.getBean("userDao");
//        UserDao userDao = new UserDao();
//        userDao.add(new User("1","1","1","1",'1'));
//        userDao.del(5);
//        System.out.println(userDao.findUserById(10).toString());
//        userDao.update(new User(10,"1", "2", "2", "2",'N'));
        System.out.println(userDao.findUserById(2));
    }
}
