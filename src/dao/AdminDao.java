package dao;

import factory.admin.DepartmentAFactory;
import factory.admin.DepartmentBFactory;
import model.admin.Admin;

import java.util.ArrayList;
import java.util.List;

public class AdminDao {

    private List<Admin> adminList = new ArrayList<>();

    private static AdminDao instance = new AdminDao();

    private AdminDao() {
        adminList.add(new DepartmentAFactory().getAdmin());
        adminList.add(new DepartmentBFactory().getAdmin());
    }

    public static AdminDao getInstance() {
        return instance;
    }

    public Admin getAdmin(String userId, String password) {
        for (Admin admin: adminList) {
            if (admin.getUserid().equals(userId) && admin.getPassword().equals(password)) {
                return admin;
            }
        }
        return null;
    }

    public boolean isAdmin(String userId) {
        for (Admin admin: adminList) {
            if (admin.getUserid().equals(userId)) {
                return true;
            }
        }
        return false;
    }

    public void showAllAdmin() {
        System.out.println("userId\tpassword");
        for (Admin admin: adminList) {
            System.out.println(admin.getUserid() + "\t" + admin.getPassword());
        }
        System.out.println("(Hint: departA has all permissions, while departB can only edit literature info)");
    }
}
