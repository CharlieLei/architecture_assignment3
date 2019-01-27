package model;

public class Book {
    private String bookId;
    private String bookName;
    private String fileType;

    public Book(String bookId, String bookName, String fileType) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.fileType = fileType;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}
