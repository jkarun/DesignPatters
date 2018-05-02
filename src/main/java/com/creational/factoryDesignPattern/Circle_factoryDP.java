package com.creational.factoryDesignPattern;

public class Circle_factoryDP implements Shape_factoryDP{

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
