package dao;

import factory.user.GraduateFactory;
import factory.user.TeacherFactory;
import factory.user.UndergraduateFactory;
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
        System.out.println("userId\tusername\tpassword");
        for (User user: userList) {
            System.out.println(user.getUserid() + "\t" + user.getUsername() + "\t" + user.getPassword());
        }
        System.out.println("(Hint: user1 can borrow 1 book, user2 can borrow 2 and user3 can borrow 3)");
    }
}
