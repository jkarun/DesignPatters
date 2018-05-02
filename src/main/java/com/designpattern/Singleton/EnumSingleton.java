package com.designpattern.Singleton;

public enum EnumSingleton {

	/*
	 * To overcome issue raised by reflection, enums are used because java ensures
	 * internally that enum value is instantiated only once. Since java Enums are
	 * globally accessible, they can be used for singletons. Its only drawback is
	 * that it is not flexible i.e it does not allow lazy initialization.
	 */

	INSTANCE;

	int value;

	public int getValue() {

		return value;

	}

	public void setValue(int value) {

		this.value = value;

	}

}
