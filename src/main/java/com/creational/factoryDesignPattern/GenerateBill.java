package com.creational.factoryDesignPattern;

public class GenerateBill {

	private static PlanFactory planFactory;

	public static void main(String[] args) {
		planFactory = new PlanFactory();

		System.out.println("Domestic plan bill:");
		generateBill("DOMESTICPLAN", 10);

		System.out.println("Commercial plan bill:");
		generateBill("COMMERCIALPLAN", 50);

		System.out.println("Institutional plan bill:");
		generateBill("INSTITUTIONALPLAN", 4);
	}

	private static void generateBill(String planType, int units) {
		Plan p = planFactory.getPlan(planType);
		System.out.print("Bill amount for " + planType + " of  " + units + " units is: ");
		p.getRate();
		p.calculateBill(units);

	}

}
