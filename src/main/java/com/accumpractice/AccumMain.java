package com.accumpractice;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class AccumMain {
	public static void main(String[] args) {
		KieServices ks = KieServices.Factory.get();
		KieContainer kContainer = ks.getKieClasspathContainer();
		KieSession kSession = kContainer.newKieSession("accum-rule");
		
		Customer c1 = new Customer(10, "VIP", 5, 0);
		Customer c2 = new Customer(10, "VIP", 10, 0);
		Customer c3 = new Customer(10, "VIP", 17, 0);
		Customer c9 = new Customer(10, "VIP", 23, 0);
		Customer c10 = new Customer(10, "VIP", 24, 0);
		
		
		Customer c4 = new Customer(15, "Normal", 22, 0);
		Customer c5 = new Customer(15, "Normal", 3, 0);
		Customer c6 = new Customer(15, "Normal", 6, 0);
		Customer c7 = new Customer(15, "Normal", 8, 0);
		Customer c8 = new Customer(15, "Normal", 2, 0);
		
		/*Customer2 c10 = new Customer2(20, "Normal", 4, 0);
		Customer2 c11 = new Customer2(20, "Normal", 2, 0);
		Customer2 c12 = new Customer2(20, "Normal", 10, 0);*/
		// github에서 
		kSession.insert(c1);
		kSession.insert(c2);
		kSession.insert(c3);
		kSession.insert(c4);
		kSession.insert(c5);
		kSession.insert(c6);
		kSession.insert(c7);
		kSession.insert(c8);
		kSession.insert(c9);
		kSession.insert(c10);
		/*kSession.insert(c10);
		kSession.insert(c11);
		kSession.insert(c12);*/
		// pull test 
		kSession.fireAllRules();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println(c5.toString());
		System.out.println(c6.toString());
		System.out.println(c7.toString());
		System.out.println(c8.toString());
		System.out.println(c9.toString());
		System.out.println(c10.toString());
		// Hello
		/*System.out.println(c10.toString());
		System.out.println(c11.toString());
		System.out.println(c12.toString());*/
		
		
	}
}
