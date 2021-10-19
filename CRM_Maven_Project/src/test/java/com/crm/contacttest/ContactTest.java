package com.crm.contacttest;

import org.testng.annotations.Test;

public class ContactTest {
	
	@Test
	public void createContactTest() {
		System.out.println("execute createContactTest");
		
		String URL = System.getProperty("url");
		System.out.println("============URL====="+URL);
		String BROWSER = System.getProperty("browser");
		System.out.println("============BROWSER====="+BROWSER);
	}
	
	
	@Test
	public void editContactTest() {
		System.out.println("execute editContactTest");
	}

}
