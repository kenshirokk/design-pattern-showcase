package com.kk.designpattern.abstractfactory;

public class SqlServerUser implements IUser {

	@Override
	public void insert(User user) {
		System.out.println("在SQL Server里给User表增加一条记录");
	}

	@Override
	public User getUser(int id) {
		System.out.println("在SQL Server里根据ID得到User表里的一条记录");
		return null;
	}

}
