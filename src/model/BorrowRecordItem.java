package model;

import java.sql.Timestamp;

public class BorrowRecordItem {
    private String userId;
    private String bookId;
    private Timestamp timestamp;

    public BorrowRecordItem(String userId, String bookId, Timestamp timestamp) {
        this.userId = userId;
        this.bookId = bookId;
        this.timestamp = timestamp;
    }

    public String getUserId() {
        return userId;
    }

    public String getBookId() {
        return bookId;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }
}
