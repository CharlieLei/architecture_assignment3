package factory;

import model.user.Graduate;
import model.user.User;
import strategy.GraduateBorrowStrategy;

public class GraduateFactory implements UserFactory {
    @Override
    public User getUser() {
        return new Graduate(new GraduateBorrowStrategy());
    }
}
