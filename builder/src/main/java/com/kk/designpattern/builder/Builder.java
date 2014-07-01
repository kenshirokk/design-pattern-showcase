package com.kk.designpattern.builder;

public interface Builder {

	void buildPartA();
	void buildPartB();
	void buildPartC();
	
	Product getResult();
}
