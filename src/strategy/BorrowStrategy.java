package strategy;

import model.Book;

public interface BorrowStrategy {
    public void borrow(String bookId);
}
