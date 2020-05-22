package com.SpringBoot.SpringBootPart1.model;

@Entity
public class User {

    @Id
    public int userId;
    public String userName;
    public String userSurname;


    public User(int userId, String userName, String userSurname) {
        this.userId = userId;
        this.userName = userName;
        this.userSurname = userSurname;
    }

    public int getUserId() {

        return  userId;
    }

    public int setUserId(int userId) {

        this.userId = userId;
        return userId;
    }

    public  String getUserName() {

        return userName;
    }

    public void setUserName(String userName) {

        this.userName = userName;
    }

    public  String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {

        this.userSurname = userSurname;
    }
}

