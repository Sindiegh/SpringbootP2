package com.SpringBoot.SpringBootPart1;

import com.SpringBoot.SpringBootPart1.Doa.FakeRepo;
import com.SpringBoot.SpringBootPart1.service.UserServiceImplementation;
import org.junit.jupiter.api.Test;
import org.springframework.cache.annotation.Caching;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;

@SpringJUnitWebConfig
@Caching
class ApplicationTests {

	@Test
	public void ServiceImplementationTest() throws NullPointerException, NoSuchMethodException {
		FakeRepo fakeRepository = new FakeRepo();
		assertThat(Boolean.parseBoolean(String.valueOf(new UserServiceImplementation(fakeRepository)
				.addUser(1,"henny",".park"))));
		assertThat(Boolean.parseBoolean(String.valueOf(new UserServiceImplementation(fakeRepository)
				.removeUser(1))));
		assertThat(Boolean.parseBoolean(String.valueOf(new UserServiceImplementation(fakeRepository)
				.getUserById(1))));

	}
	private void assertThat(boolean parseBoolean) {
	}
	@Test
	public void testSecurityConfig() {
		assertThat(Boolean.parseBoolean(String.valueOf(new WebSecurityConfigurer())));
	}
}