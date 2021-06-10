package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day2 {

	@Test(enabled=true)
	public void demo3() {
		System.out.println("HelloDay2");
	}
	/*@Parameters({"url","user"})
	@Test
	public void parameter(String url,String user) {
		System.out.println("parameter"+url+user);
	}
	*/
	@BeforeTest
	public void prerequisite(){
			System.out.println("Pre-Requisite BeforeTest");
		
	}
}
