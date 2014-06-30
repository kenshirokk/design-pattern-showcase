package com.kk.designpattern.abstractfactory;

import org.junit.Test;

public class AbstractFactoryTest {

	@Test
	public void test1() {
		User user = new User();

		IFactory factorty = new SqlServerFactory();

		IUser iu = factorty.createUser();

		iu.insert(user);

		iu.getUser(1);
	}
	
	@Test
	public void test2() {
		User user = new User();

		IFactory factorty = new AccessFactory();

		IUser iu = factorty.createUser();

		iu.insert(user);

		iu.getUser(1);
	}

}
