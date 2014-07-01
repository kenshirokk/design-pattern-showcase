package com.kk.designpattern.builder;

public class ConcreteBuilder implements Builder {

	@Override
	public void buildPartA() {
		System.out.println("build part a");
	}

	@Override
	public void buildPartB() {
		System.out.println("build part b");
	}

	@Override
	public void buildPartC() {
		System.out.println("build part c");
	}

	@Override
	public Product getResult() {
		return null;
	}

}
