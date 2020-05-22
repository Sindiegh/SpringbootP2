package com.SpringBoot.SpringBootPart1;

import com.SpringBoot.SpringBootPart1.Doa.FakeRepo;
import com.SpringBoot.SpringBootPart1.service.UserServiceImplementation;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class SpringBootPart1ApplicationTests {

	@Test
	void contextLoads() {
	}

	UserServiceImplementation userService = new UserServiceImplementation(new FakeRepo());

	@Test
	public void insertUserTest() throws NoSuchMethodException {
		userService.insertUser(1,"Sindiswa", "Khama");
	}
	@Test
	public void deleteUserTest(){
		userService.deleteUser(1);



	}
	@Test
	public void getUserTest() throws NoSuchMethodException {
		userService.findUserById(2);


	}

	@Autowired
	private TestRestTemplate template;

	TestRestTemplate response = template.withBasicAuth("Sindiegh","hiThere");

}
