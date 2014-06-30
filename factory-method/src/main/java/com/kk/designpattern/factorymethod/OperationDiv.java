package com.kk.designpattern.factorymethod;

public class OperationDiv extends Operation {

	@Override
	public double getResult() {
		return this.numberA / this.numberB;
	}

}
