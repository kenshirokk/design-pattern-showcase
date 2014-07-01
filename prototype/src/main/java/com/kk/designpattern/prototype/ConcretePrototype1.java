package com.kk.designpattern.prototype;

public class ConcretePrototype1 extends Prototype {

	public ConcretePrototype1(int id) {
		super(id);
	}

	@Override
	public Prototype clone() {
		Prototype prototype = new ConcretePrototype1(getId());
		return prototype;
	}

}
