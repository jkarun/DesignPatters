package com.designpattern.Singleton;

import java.io.Serializable;

public class SingletonClass implements Serializable, Cloneable {

	/*
	 * Visit for more type of singleton concepts in
	 * https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-
	 * examples
	 * 
	 * https://www.geeksforgeeks.org/prevent-singleton-pattern-reflection-
	 * serialization-cloning/
	 */

	private static final long serialVersionUID = 866188711438551357L;

	private static SingletonClass singletonClass;
	private String msg = "Hello from SingleTonClass...";

	private SingletonClass() {
	}

	// lazy initialization
	public static synchronized SingletonClass getInstance() {
		if (singletonClass == null) {
			singletonClass = new SingletonClass();
		}
		return singletonClass;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// use if you want to return error when cloning
		// throw new CloneNotSupportedException();
		return singletonClass;
	}

	public Object readResolve() {
		// this method solves Problems With Serialization and Deserialization
		return singletonClass;
	}

	public void setMsg(String str) {
		this.msg = str;
	}

	public String getMsg() {
		return msg;
	}
}
