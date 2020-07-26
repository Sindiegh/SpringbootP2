package com.SpringBoot.SpringBootPart1;

import java.util.Collections;
import java.util.Scanner;

import com.SpringBoot.SpringBootPart1.Doa.FakeRepo;
import com.SpringBoot.SpringBootPart1.service.UserServiceImplementation;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
class Application {
	public static void main(String[] args) {



		SpringApplication application = new SpringApplication(Application.class);
		application.setDefaultProperties(Collections.singletonMap("server.port", "8888"));
		application.run(args);
		try {
			FakeRepo fakeRepo = new FakeRepo();

			UserServiceImplementation userServiceImplementation = new UserServiceImplementation(fakeRepo);
			System.out.println(userServiceImplementation.addUser(54,"Til","Slip"));
			System.out.println(userServiceImplementation.removeUser(54));
			System.out.println(userServiceImplementation.getUserById(54));

			System.out.println(new WebSecurityConfigurer());

		}
		catch (IndexOutOfBoundsException | NoSuchMethodException iobe)
		{
			iobe.getMessage();
		}
	}
}
