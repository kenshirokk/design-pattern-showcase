package com.kk.designpattern.factorymethod;

public class OperationAdd extends Operation {

	@Override
	public double getResult() {
		return this.numberA + this.numberB;
	}

}
