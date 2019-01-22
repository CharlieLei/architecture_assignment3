package factory;

import model.user.Teacher;
import model.user.User;
import strategy.TeacherBorrowStrategy;

public class TeacherFactory implements UserFactory{
    @Override
    public User getUser() {
        return new Teacher(new TeacherBorrowStrategy());
    }
}
