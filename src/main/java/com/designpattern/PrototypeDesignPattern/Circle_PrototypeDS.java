package com.designpattern.PrototypeDesignPattern;

public class Circle_PrototypeDS extends Shape_PrototypeDS{

	public Circle_PrototypeDS(){
		type = "Circle";
	}
	
	@Override
	void draw() {
		System.out.println("Inside Circle_PrototypeDS::draw() method.");		
	}

}
