package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3 {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I m Before Suite");
		
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("I ll execute before every test of day3/CarLoan");
	}
	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("I ll execute After every test of day3/CarLoan");
	}
	@Test(groups=("Smoke"))
	public void ApiCarLoan() {
		System.out.println("ApiCarLoan");
	}
	
	@Test
	public void WebCarLoan() {
		System.out.println("WebCarLoan");
		
	}
	@Test
	public void MobileCarLoan() {
		System.out.println("MobileCarLoan");
	}
	@org.testng.annotations.AfterSuite
	public void AfterSuite() {
		System.out.println("I m After Suite");
	}
}
