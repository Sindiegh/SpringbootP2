package com.SpringBoot.SpringBootPart1.service;

import com.SpringBoot.SpringBootPart1.Doa.FakeRepo;
import com.SpringBoot.SpringBootPart1.Doa.FakeRepoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImplementation implements FakeRepoInterface {


    @Autowired
    FakeRepoInterface fakeRepoInterface ;

    public UserServiceImplementation(FakeRepo repo) {

    }

    @Override
    public String insertUser(int userId, String userName, String userSurname) throws NoSuchMethodException {
        return fakeRepoInterface.insertUser(userId,userName,userSurname);
    }

    @Override
    public String findUserById(int userId) {
        return fakeRepoInterface.findUserById(userId);
    }

    @Override
    public String deleteUser(int userId) {
        return fakeRepoInterface.deleteUser(userId);
    }

    @Override
    public String User(int userId) {
        return fakeRepoInterface.User(userId);
    }
}
