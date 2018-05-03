package com.creational.Singleton;

import java.io.Serializable;

/*
 * Best approach to create singleton in multithread environment is use enum singleton concept
 */

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

	private static volatile SingletonClass singletonClass;
	private String msg = "Hello from SingleTonClass...";

	private SingletonClass() {
	}

	// Double check lazy initialization which can be used for high performance
	// Multi-threaded applications.
	// Do not use 'synchronized' this method
	public static SingletonClass getInstance() {
		if (singletonClass == null) { // $1
			synchronized (SingletonClass.class) {
				if (singletonClass == null) { // $2
					singletonClass = new SingletonClass();
				}
			}
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

/*
 * $1. If an instance was already created, don't do anything - avoid locking
 * threads
 * 
 * $2. The first thread that has acquired the lock checks and sees that there is
 * no such object and creates it. It releases the lock and the second one can do
 * the same - it has to check if the object exists because the first one may
 * have created it.
 * 
 * So basically the outer if is used to prevent redundant locks - it lets all
 * thread know that there is already an object and they don't need to lock/do
 * anything. And the inner if is used to let a concurrent thread know whether
 * another has already created the object or not.
 * 
 * The Double checked pattern is used to avoid obtaining the lock every time the
 * code is executed, if the call are not happening together then the first
 * condition will fail and the code execution will not execute the locking thus
 * saving resources.
 */