package com.creational.factoryDesignPattern;

public class PlanFactory {
	public Plan getPlan(String planType) {
		if (planType == null || planType.isEmpty())
			return null;

		if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		} else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
			return new CommercialPlan();
		} else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new InstitutionalPlan();
		}
		
		return null;
	}
}
