//Simple testcase trigger from @test and testng
package test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterTest;

import org.testng.annotations.Test;

public class day1 {
	@AfterTest
	public void prerequisite(){
			System.out.println("After Test");
		
	}

	@Test(groups=("Smoke"))
	public void demo1() {
		System.out.println("HelloDay1");
	}
	@Test
	public void demo() {
		System.out.println("ByeDay1");
		Assert.assertTrue(false);
	}
	
}
