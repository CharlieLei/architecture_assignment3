package factory.user;

import Info.GraduateInfo;
import model.user.Graduate;
import model.user.User;
import strategy.GraduateBorrowStrategy;

public class GraduateFactory implements UserFactory {
    @Override
    public User getUser() {
        return new Graduate(
                new GraduateBorrowStrategy(),
                new GraduateInfo("user2", "graduate", "123456"));
    }
}
