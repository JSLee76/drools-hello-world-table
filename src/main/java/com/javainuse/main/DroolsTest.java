package com.javainuse.main;

import java.sql.Connection;

import org.drools.decisiontable.InputType;
import org.drools.decisiontable.SpreadsheetCompiler;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;
import org.kie.internal.io.ResourceFactory;

import com.javainuse.model.Product;

public class DroolsTest {

	public static final void main(String[] args) {
		try {
			
	    	//SpreadsheetCompiler sc = new SpreadsheetCompiler();
			//String drlstr = sc.compile(ResourceFactory.newFileResource("D:\\_Projects\\eclipse-workspace\\drools-hello-world-table\\drools-hello-world-table\\src\\main\\resources\\rules\\rules.xls"), InputType.XLS);
			//System.out.println(drlstr);
			
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rule");

			Product product = new Product();
			product.setType("gold");
			
			Product product2 = new Product();
			product2.setType("diamond");

			Connection conn = MySQLConn.connectAutoditProtoDB();
			
			kSession.insert(product);
			kSession.insert(product2);
			kSession.insert(conn);
			
			kSession.fireAllRules();
			
			
			System.out.println("The discount for the jewellery product "
					+ product.getType() + " is " + product.getDiscount());
			System.out.println("The discount for the jewellery product "
					+ product2.getType() + " is " + product2.getDiscount());

		} catch (Throwable t) {
			t.printStackTrace();
		}
	}

}
