package com.structural.AdapterPattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//This is Client class
public class AdapterPatternTest {

	// Must read Adapter_README.txt to under stand the pattern

	public static void main(String[] args) throws IOException {

		CreditCard targetInterface = new BankCustomer();
		targetInterface.giveBankDetails();
		System.out.print(targetInterface.getCreditCard());

		// another inbuild java world example

		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// System.err.print("Enter String: ");
		// String s = br.readLine();
		// System.out.print("Entered input: " + s);

	}

}
