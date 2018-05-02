package com.designpattern.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonDpTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		// shows error to change visibility of constructor
		// SingletonClass obj = new SingletonClass();
		SingletonClass obj1 = SingletonClass.getInstance();
		System.out.println(obj1.getMsg());

		SingletonClass obj2 = (SingletonClass) obj1.clone();
		obj2.setMsg("test msg");
		System.out.println(obj2.getMsg());
		System.out.println(obj1.getMsg());

		System.out.println("hashcodes:::");
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		System.out.println("\n\nTo test singleton serilization issue, comment 'readResolve' method in SingletonClass and the program\n ");
		testSerilizatin();

	}

	private static void testSerilizatin() {
		SingletonClass singleton = SingletonClass.getInstance();
		singleton.setMsg("serialization msg");

		// Serialize
		try {

			FileOutputStream fileOut = new FileOutputStream("out.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(singleton);
			out.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		singleton.setMsg("msg");

		// Deserialize
		SingletonClass singleton2 = null;
		try {
			FileInputStream fileIn = new FileInputStream("out.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			singleton2 = (SingletonClass) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			System.out.println("singletons.SingletonEnum class not found");
			c.printStackTrace();
		}
		
		if (singleton == singleton2) {
			System.out.println("Two objects are same");
		} else {
			System.out.println("Two objects are not same");
		}

		System.out.println("After serilization and deserialization");
		System.out.println(singleton.getMsg());
		System.out.println(singleton2.getMsg());
	}

}
