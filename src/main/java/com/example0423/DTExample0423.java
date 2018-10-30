package com.example0423;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import com.example0423.*;
import com.example0423.Customer.CustomerType;

public class DTExample0423 {
	public static final void main(String[] args) {
		try {
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("shoppingcart-rule");

			
			Customer cust1 = new Customer(CustomerType.INDIVIDUAL, 5);
			Customer cust2 = new Customer(CustomerType.INDIVIDUAL, 2);
			Customer cust3 = new Customer(CustomerType.BUSINESS, 1);
			Customer cust4 = new Customer(CustomerType.BUSINESS, 10);
			
			
			kSession.insert(cust1);
			kSession.insert(cust2);
			kSession.insert(cust3);
			kSession.insert(cust4);
			
			kSession.fireAllRules();
			
			System.out.println(cust1.getDiscount());
			System.out.println(cust2.getDiscount());
			System.out.println(cust3.getDiscount());
			System.out.println(cust4.getDiscount());
			/*
			Product product = new Product();
			product.setType("gold");

			FactHandle fact1;

			fact1 = kSession.insert(product);
			kSession.fireAllRules();

			System.out.println("The discount for the jewellery product "
					+ product.getType() + " is " + product.getDiscount());
			*/		

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}