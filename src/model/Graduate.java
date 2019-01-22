package model;

import strategy.BorrowStrategy;

public class Graduate extends User {
    public Graduate(BorrowStrategy borrowStrategy) {
        super(borrowStrategy);
    }
}
