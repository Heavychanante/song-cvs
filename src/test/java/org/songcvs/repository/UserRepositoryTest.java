package org.songcvs.repository;

import java.util.List;

import org.junit.Assert;
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
	public void testFindAll() {
		List<User> userList = (List<User>) repository.findAll();
		Assert.assertTrue(!userList.isEmpty());
	}
}
