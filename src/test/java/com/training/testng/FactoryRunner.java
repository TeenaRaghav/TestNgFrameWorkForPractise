package com.training.testng;

import org.testng.annotations.Factory;

public class FactoryRunner {
	@Factory
	public Object[] factoryGenerator() {
		Object[] obj = {new FactoryDemoForDataDrivenTesting("user1","pass1"),
						new FactoryDemoForDataDrivenTesting("user2","pass2"),
						new FactoryDemoForDataDrivenTesting("user3","pass3")
						}; 
		return obj;
	}
}
