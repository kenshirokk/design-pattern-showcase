package com.kk.designpattern.builder;

import static org.junit.Assert.*;

import org.junit.Test;

public class BuilderTest {

	@Test
	public void test() {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		director.construct();
		Product result = builder.getResult();
		assertNull(result);
	}

}
