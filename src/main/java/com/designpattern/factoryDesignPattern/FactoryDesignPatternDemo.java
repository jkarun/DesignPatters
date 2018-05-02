package com.designpattern.factoryDesignPattern;

public class FactoryDesignPatternDemo {

	public static void main(String[] args) {
		FactoryClass factoryClass = new FactoryClass();
		
		Shape_factoryDP circle = factoryClass.getShape("CIRCLE");
		circle.draw();
		
		Shape_factoryDP rectangle = factoryClass.getShape("RECTANGLE");
		rectangle.draw();
		
		Shape_factoryDP triangle = factoryClass.getShape("TRIANGLE");
		triangle.draw();
	}

}
