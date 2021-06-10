package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day4 {
	@org.testng.annotations.BeforeClass
	public void BeforeClass() {
		System.out.println("I ll execute Before any test of Home Loan Class");
	}
	
	@org.testng.annotations.AfterClass
	public void AfterClass() {
		System.out.println("I ll execute After any test of Home Loan Class");
	}
	
	@Test(groups=("Smoke"))
	public void ApiHomeLoan() {
		System.out.println("ApiHomeLoan");
	}
	@Test
	public void WebHomeLoan() {
		System.out.println("WebHomeLoan");
	}
	@Test(dataProvider="data")
	public void MobileHomeLoan(String user, String pass) {
		System.out.println("MobileHomeLoan"+user+pass);
	}
@DataProvider
public Object[][] data() {
	Object[][]data=new Object[2][2];
	data[0][0]="me";
	data[0][1]="12";
	data[1][0]="you";
	data[1][1]="123";
	
	return data;
}

}
