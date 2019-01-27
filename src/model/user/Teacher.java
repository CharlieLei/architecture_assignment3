package model.user;

import Info.UserInfo;
import strategy.BorrowStrategy;

public class Teacher extends User {
    public Teacher(BorrowStrategy borrowStrategy, UserInfo userInfo) {
        super(borrowStrategy,userInfo);
    }
}
