package model.user;

import Info.UserInfo;
import strategy.BorrowStrategy;

public class Graduate extends User {
    public Graduate(BorrowStrategy borrowStrategy, UserInfo userInfo) {
        super(borrowStrategy,userInfo);
    }
}
