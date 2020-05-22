package com.SpringBoot.SpringBootPart1;

import java.util.Collections;
import java.util.Scanner;

import com.SpringBoot.SpringBootPart1.Doa.FakeRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
class Application {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		SpringApplication application = new SpringApplication(Application.class);
		application.setDefaultProperties(Collections.singletonMap("server.port", "8888"));
		application.run(args);
		FakeRepo fakeRepo = new FakeRepo();
		System.out.println(fakeRepo.User(1));
		System.out.println(fakeRepo.insertUser(1,"Sindi","K"));
		System.out.println(fakeRepo.findUserById(1));
		System.out.println(fakeRepo.deleteUser(1));
	}
}
