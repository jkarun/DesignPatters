package com.designpattern.factoryDesignPattern;

public class Rectangle_factoryDP implements Shape_factoryDP{

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}