package com.designpattern.PrototypeDesignPattern;

import java.util.Hashtable;

public class ShapeCache {

	private static Hashtable<String, Shape_PrototypeDS> shapeMap = new Hashtable<String, Shape_PrototypeDS>();

	public static Shape_PrototypeDS getShape(String id) {
		Shape_PrototypeDS shape = shapeMap.get(id);
		return (Shape_PrototypeDS) shape.clone();
	}
	
	public static void loadCache(){
		Circle_PrototypeDS circle = new Circle_PrototypeDS();
		circle.setId("1");
		shapeMap.put(circle.getId(), circle);
		
		Rectangle_PrototypeDS rectangle = new Rectangle_PrototypeDS();
		rectangle.setId("2");
		shapeMap.put(rectangle.getId(), rectangle);
		
		Triangle_PrototypeDS triangle = new Triangle_PrototypeDS();
		triangle.setId("3");
		shapeMap.put(triangle.getId(), triangle);
	}

}
