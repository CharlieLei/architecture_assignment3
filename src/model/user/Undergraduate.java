package model;

import strategy.BorrowStrategy;

public class Undergraduate extends User {
    public Undergraduate(BorrowStrategy borrowStrategy) {
        super(borrowStrategy);
    }
}
