package model;

import strategy.BorrowStrategy;

public abstract class User {
    private BorrowStrategy borrowStrategy;

    public User(BorrowStrategy borrowStrategy) {
        this.borrowStrategy = borrowStrategy;
    }

    public void borrow(Book book) {
        this.borrowStrategy.borrow(book);
    }
}
