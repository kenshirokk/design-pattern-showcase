package com.kk.designpattern.builder;

public class Client {

	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.construct();
		Product result = builder.getResult();
		System.out.println(result);
	}
}
