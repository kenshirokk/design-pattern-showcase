package com.kk.designpattern.prototype;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrototypeTest {

	@Test
	public void test() {
		Prototype c1 = new ConcretePrototype1(1);
		Prototype c2 = c1.clone();
		
		assertEquals(c1.getId(), c2.getId());
	}

}
