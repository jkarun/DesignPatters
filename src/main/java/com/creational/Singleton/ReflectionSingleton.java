package com.creational.Singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionSingleton {

	/*
	 * Using Reflection to destroy Singleton Pattern
	 * To overcome the reflection breaking issue use Enum
	 */

	public static void main(String[] args)
			throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		SingletonClass obj1 = SingletonClass.getInstance();
		SingletonClass obj2 = null;

		Constructor[] constructors = SingletonClass.class.getDeclaredConstructors();
		for (Constructor con : constructors) {
			con.setAccessible(true);
			obj2 = (SingletonClass) con.newInstance();
			break;
		}
		
		System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
	}

}
