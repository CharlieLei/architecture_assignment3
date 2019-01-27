package factory.user;

import Info.TeacherInfo;
import model.user.Teacher;
import model.user.User;
import strategy.TeacherBorrowStrategy;

public class TeacherFactory implements UserFactory{
    @Override
    public User getUser() {
        return new Teacher(
                new TeacherBorrowStrategy(),
                new TeacherInfo("user3", "teacher", "123456"));
    }
}
