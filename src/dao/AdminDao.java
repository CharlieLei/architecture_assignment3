package dao;

import factory.DepartmentAFactory;
import factory.DepartmentBFactory;
import model.admin.Admin;

public class AdminDao {
    public Admin getAdmin(String userId, String password) {
        if (userId.equals("departA")){
            return new DepartmentAFactory().getAdmin();
        }else if (userId.equals("departB")){
            return new DepartmentBFactory().getAdmin();
        }else {
            return null;
        }
    }

    public boolean isAdmin(String userId) {
        return userId.equals("departA") || userId.equals("departB");
    }
}
