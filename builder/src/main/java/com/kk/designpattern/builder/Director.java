package com.kk.designpattern.builder;

public class Director {

	private Builder builder;

	public Director(Builder builder) {
		super();
		this.builder = builder;
	}
	
	public void construct() {
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
	}
	
}
