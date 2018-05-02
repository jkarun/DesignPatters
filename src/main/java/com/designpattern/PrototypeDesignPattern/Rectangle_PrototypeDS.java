package com.designpattern.PrototypeDesignPattern;

public class Rectangle_PrototypeDS extends Shape_PrototypeDS {

	public Rectangle_PrototypeDS(){
		type = "Rectangle";
	}

	@Override
	void draw() {
		System.out.println("Inside Rectangle_PrototypeDS::draw() method.");
	}

}
