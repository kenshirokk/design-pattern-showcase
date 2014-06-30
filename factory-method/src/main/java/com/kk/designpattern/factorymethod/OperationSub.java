package com.kk.designpattern.factorymethod;

public class OperationSub extends Operation {

	@Override
	public double getResult() {
		return this.numberA - this.numberB;
	}

}
