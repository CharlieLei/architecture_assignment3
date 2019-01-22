package model.admin;

/**
 * Administrator's permission of user information management
 */
public class Permission {

    public boolean canEditLiteratureInfo() {
        return true;
    }

    public boolean canShowBorrowRecords() {
        return true;
    }

    public boolean canShowOverduePenalty() {
        return true;
    }
}
