package com.designpattern.PrototypeDesignPattern;

public class ProtoTypeDemo {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape_PrototypeDS a = ShapeCache.getShape("1");
		System.out.println("Shape : " + a.getType());
		
		Shape_PrototypeDS b = ShapeCache.getShape("2");
		System.out.println("Shape : " + b.getType());
		
		Shape_PrototypeDS c = ShapeCache.getShape("3");
		System.out.println("Shape : " + c.getType());
	}

}
