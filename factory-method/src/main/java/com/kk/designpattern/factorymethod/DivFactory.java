package com.kk.designpattern.factorymethod;

public class DivFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}

}
