package model.user;

import strategy.BorrowStrategy;

public class Undergraduate extends User {
    public Undergraduate(BorrowStrategy borrowStrategy) {
        super(borrowStrategy);
    }
}
