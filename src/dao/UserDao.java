package dao;

import factory.GraduateFactory;
import factory.TeacherFactory;
import factory.UndergraduateFactory;
import model.user.User;

import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private List<User> userList = new ArrayList<>();
    private static UserDao instance = new UserDao();

    private UserDao() {
        userList.add(new UndergraduateFactory().getUser());
        userList.add(new GraduateFactory().getUser());
        userList.add(new TeacherFactory().getUser());
    }

    public static UserDao getInstance() {
        return instance;
    }

    public User getUser(String userId, String password) {
        for (User user: userList) {
            if (user.getUserid().equals(userId) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }


    public boolean isUser(String userId) {
        for (User user: userList) {
            if (user.getUserid().equals(userId)) {
                return true;
            }
        }
        return false;
    }

    public void showAllUser() {
        for (User user: userList) {
            System.out.print("userid: ");
            System.out.println(user.getUserid());
            System.out.print("username: ");
            System.out.println(user.getUsername());
            System.out.print("password: ");
            System.out.println(user.getPassword());
        }
    }
}
