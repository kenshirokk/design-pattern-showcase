package com.kk.designpattern.prototype;

public abstract class Prototype {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Prototype(int id) {
		this.id = id;
	}

	public abstract Prototype clone();
	
}
