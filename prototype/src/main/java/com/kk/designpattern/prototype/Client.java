package com.kk.designpattern.prototype;

public class Client {

	public static void main(String[] args) {
		Prototype c1 = new ConcretePrototype1(1);
		Prototype c2 = c1.clone();
		
		System.out.println(c1.getId() == c2.getId());
	}
}
