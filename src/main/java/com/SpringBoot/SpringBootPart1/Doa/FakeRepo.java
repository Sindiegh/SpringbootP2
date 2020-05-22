package com.SpringBoot.SpringBootPart1.Doa;

import com.SpringBoot.SpringBootPart1.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public  class FakeRepo implements FakeRepoInterface{
    private static ArrayList<User> usr = new ArrayList<>();

    @Override
    public String insertUser(int userId, String userName, String userSurname) {
        User user = new User(userId,userName,userSurname);
        usr.add(user);
        return userName + " entered";
    }

    @Override
    public String findUserById(int userId) {
        for (User userArray: usr ) {
            if (userArray.getUserId() == userId){
                return userArray.getUserName() + "";
            }
        }
        try
        {
            System.out.println("Going to sleep for 5 Secs.. to simulate backend call.");
            Thread.sleep(1000*5);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public String deleteUser(int userId) {
        for (User userArray : usr) {
            if (userArray.getUserId() == userId){
                usr.remove(userId);
                return userId + " removed";
            }
        }
        return null;
    }

    @Override
    public String User(int userId) {
        for (User userArray : usr) {
            if (userArray.getUserId() == userId){
                usr.remove(userId);
                return "Hello " + userId;
            }
        }
        return null;
    }
}
