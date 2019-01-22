package model;

import strategy.BorrowStrategy;

public class Teacher extends User {
    public Teacher(BorrowStrategy borrowStrategy) {
        super(borrowStrategy);
    }
}
