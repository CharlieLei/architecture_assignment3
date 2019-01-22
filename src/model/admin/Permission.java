package model.admin;

import java.util.ArrayList;
import java.util.List;

/**
 * Administrator's permission of user information management
 */
public class Permission {

    private List<Boolean> permissionList;
    public Permission() {
        permissionList = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            permissionList.add(false);
        }
    }

    public boolean canEditLiteratureInfo() {
        return permissionList.get(0);
    }
    public void setEditLiteratureInfoPermission(boolean permission) {
        permissionList.set(0, permission);
    }

    public boolean canShowBorrowRecords() {
        return permissionList.get(1);
    }
    public void setShowBorrowRecordsPermission(boolean permission) {
        permissionList.set(1, permission);
    }

    public boolean canShowOverduePenalty() {
        return permissionList.get(2);
    }
    public void setShowOverduePenaltyPermission(boolean permission) {
        permissionList.set(2, permission);
    }
}
