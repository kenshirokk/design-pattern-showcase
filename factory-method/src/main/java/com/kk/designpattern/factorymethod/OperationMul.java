package com.kk.designpattern.factorymethod;

public class OperationMul extends Operation {

	@Override
	public double getResult() {
		return this.numberA * this.numberB;
	}

}
