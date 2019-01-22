package dao;

import factory.GraduateFactory;
import factory.TeacherFactory;
import factory.UndergraduateFactory;
import model.user.User;

public class UserDao {
    public User getUser(String userId, String password) {
        if (userId.equals("teacher")) {
            return new TeacherFactory().getUser();
        }else if (userId.equals("graduate")) {
            return new GraduateFactory().getUser();
        }else if (userId.equals("undergraduate")) {
            return new UndergraduateFactory().getUser();
        }else {
            return null;
        }
    }

    public boolean isUser(String userId) {
        return userId.equals("teacher") || userId.equals("graduate") || userId.equals("undergraduate");
    }
}
