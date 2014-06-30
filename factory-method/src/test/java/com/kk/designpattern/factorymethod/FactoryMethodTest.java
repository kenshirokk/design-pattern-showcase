package com.kk.designpattern.factorymethod;

import static org.junit.Assert.*;

import org.junit.Test;

public class FactoryMethodTest {

	@Test
	public void testAdd() {
		IFactory factory = new AddFactory();

		Operation operation = factory.createOperation();

		operation.numberA = 5;

		operation.numberB = 3;

		double result = operation.getResult();

		assertTrue(result == 8.0);
	}

	@Test
	public void testSub() {
		IFactory factory = new SubFactory();

		Operation operation = factory.createOperation();

		operation.numberA = 5;

		operation.numberB = 3;

		double result = operation.getResult();

		assertTrue(result == 2.0);
	}

	@Test
	public void testMul() {
		IFactory factory = new MulFactory();

		Operation operation = factory.createOperation();

		operation.numberA = 5;

		operation.numberB = 3;

		double result = operation.getResult();

		assertTrue(result == 15.0);
	}

	@Test
	public void testDiv() {
		IFactory factory = new DivFactory();

		Operation operation = factory.createOperation();

		operation.numberA = 6;

		operation.numberB = 3;
		
		double result = operation.getResult();

		assertTrue(result == 2.0);
	}
}
