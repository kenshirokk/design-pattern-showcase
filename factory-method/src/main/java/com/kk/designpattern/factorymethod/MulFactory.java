package com.kk.designpattern.factorymethod;

public class MulFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}

}
