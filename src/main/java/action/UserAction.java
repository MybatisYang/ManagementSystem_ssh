package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import pojo.User;
import service.UserService;

public class UserAction extends ActionSupport implements ModelDriven<User> {
    public User user = new User();
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public String login() {
        User result = userService.check(user);
        if (result == null) return "login";
        ActionContext.getContext().getSession().put("user", result);
        ActionContext.getContext().getSession().put("users", userService.getList());
        return "login_success";
    }

    public String register() {
        userService.register(user);
        ActionContext.getContext().getSession().put("users", userService.getList());
        return "register_success";
    }

    public String add() {
        userService.add(user);
        ActionContext.getContext().getSession().put("users", userService.getList());
        return "add_success";
    }

    public String update() throws Exception {
        System.out.println(user);
        userService.update(user);
        ActionContext.getContext().getSession().put("users", userService.getList());
        return "update_success";
    }

    public String del() throws Exception {
        userService.del(user.getId());
        ActionContext.getContext().getSession().put("users", userService.getList());
        return "del_success";
    }

    public String toUpdate() {
        ActionContext.getContext().getSession().put("user", userService.findUserById(user.getId()));
        System.out.println(userService.findUserById(user.getId()));
        return "toUpdate";
    }

    @Override
    public User getModel() {
        return user;
    }

}
