package com.kk.designpattern.factorymethod;

public class Client {

	public static void main(String[] args) {
		IFactory factory = new AddFactory();
		
		Operation operation = factory.createOperation();
		
		operation.numberA = 5;
		
		operation.numberB = 3;
		
		double result = operation.getResult();
		
		System.out.println(result);
	}
}
