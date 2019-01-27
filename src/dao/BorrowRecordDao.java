package dao;

import model.BorrowRecordItem;

import java.util.ArrayList;
import java.util.List;

public class BorrowRecordDao {
    private List<BorrowRecordItem> borrowRecord = new ArrayList<>();
    private static BorrowRecordDao instance = new BorrowRecordDao();

    private BorrowRecordDao() {

    }

    public static BorrowRecordDao getInstance() {
        return instance;
    }

    public List<BorrowRecordItem> getBorrowRecord() {
        return borrowRecord;
    }

    public void addBorrowRecordItem(BorrowRecordItem borrowRecordItem) {
        borrowRecord.add(borrowRecordItem);
    }

    public void showBorrowRecord() {
        System.out.println("###################borrow records###################");
        System.out.println("userId\tbookId\tdate");
        for (BorrowRecordItem recordItem: borrowRecord) {
            System.out.println(recordItem.getUserId() + "\t" + recordItem.getBookId() + "\t" + recordItem.getTimestamp());
        }
    }

}
