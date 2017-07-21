package com.test.testcases;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testclass {
	
	@Test				
	public void testEasy() {	
		int i=1;
		System.out.println("value of i: " +i);
	}	
	@BeforeTest
	public void beforeTest() {	
		/*
		 * Do something
		 */
	}		
	@AfterTest
	public void afterTest() {	
		/*
		 * Do something
		 */
	}

}
