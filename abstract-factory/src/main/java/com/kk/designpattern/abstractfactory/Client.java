package com.kk.designpattern.abstractfactory;

public class Client {

	public static void main(String[] args) {
		User user = new User();
		
		IFactory factorty = new SqlServerFactory();
		
		IUser iu = factorty.createUser();
		
		iu.insert(user);
		
		iu.getUser(1);
	}
}
