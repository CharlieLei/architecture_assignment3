package model.user;

import Info.UserInfo;
import strategy.BorrowStrategy;

public class Undergraduate extends User {
    public Undergraduate(BorrowStrategy borrowStrategy,UserInfo userInfo) {
        super(borrowStrategy,userInfo);
    }
}
