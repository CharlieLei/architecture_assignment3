package factory;

import model.user.Undergraduate;
import model.user.User;
import strategy.UndergraduateBorrowStrategy;

public class UndergraduateFactory implements UserFactory {
    @Override
    public User getUser() {
        return new Undergraduate(new UndergraduateBorrowStrategy());
    }
}
