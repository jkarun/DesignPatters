package com.designpattern.factoryDesignPattern;

public class FactoryClass {

	public Shape_factoryDP getShape(String type) {

		if (type == null)
			return null;

		if (type.equalsIgnoreCase("CIRCLE")) {
			return new Circle_factoryDP();
		} else if (type.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle_factoryDP();
		} else if (type.equalsIgnoreCase("TRIANGLE")) {
			return new Triabgle_factoryDP();
		}

		return null;
	}

}
