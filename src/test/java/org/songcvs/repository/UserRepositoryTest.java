package org.songcvs.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.songcvs.Application;
import org.songcvs.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserRepositoryTest {

	@Autowired
	UserRepository repository;

	@Test
	public void testFindByID() {
		User user = repository.findOne(1);
		org.junit.Assert.assertNotNull(user);
	}
}
