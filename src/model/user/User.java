package model.user;

import Info.UserInfo;
import model.Book;
import strategy.BorrowStrategy;


public abstract class User {
    private BorrowStrategy borrowStrategy;
    private UserInfo userInfo;

    public User(BorrowStrategy borrowStrategy,UserInfo userInfo) {
        this.borrowStrategy = borrowStrategy;
        this.userInfo = userInfo;
    }

    public void borrow(Book book) {
        this.borrowStrategy.borrow(book);
    }
    public void setUsernameAndPassword(String userid,String username,String password){userInfo.setUsernameAndPassword(userid,username,password);}
    public void setUsername(String userid,String username){userInfo.setUsername(userid,username);}
    public void setPassword(String userid,String password){userInfo.setPassword(userid,password);}

    public String getUserid() {
        return userInfo.getUserid();
    }

    public String getUsername() {
        return userInfo.getUsername();
    }

    public String getPassword() {
        return userInfo.getPassword();
    }
}
