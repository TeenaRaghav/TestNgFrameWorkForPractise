package com.training.testng;

import org.testng.annotations.Test;

public class FactoryDemoForDataDrivenTesting {
	String username;
	String password;
	public FactoryDemoForDataDrivenTesting(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	@Test
	public void sampleTest() {
		System.out.println(username+" - "+password);
	}
}
