package com.training.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {
	@Test(dataProvider = "dataprovider1")
	public void sampleTest(String username, String password) {
		System.out.println(username+" - "+password);
	}
	
	@DataProvider(name = "dataprovider1")
	public Object[][] dataSupplier() {
		Object[][] obj = {{"user1","pass1"},{"user2","pass2"},{"user3","pass3"}};
		return obj;
	}
}
