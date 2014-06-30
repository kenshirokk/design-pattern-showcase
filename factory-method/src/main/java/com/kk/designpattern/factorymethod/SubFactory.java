package com.kk.designpattern.factorymethod;

public class SubFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationSub();
	}

}
