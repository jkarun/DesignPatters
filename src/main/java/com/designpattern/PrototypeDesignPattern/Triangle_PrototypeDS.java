package com.designpattern.PrototypeDesignPattern;

public class Triangle_PrototypeDS extends Shape_PrototypeDS{

	public Triangle_PrototypeDS(){
		type = "Rectangle";
	}
	
	@Override
	void draw() {
		System.out.println("Inside Triangle_PrototypeDS::draw() method.");	
	}

}
