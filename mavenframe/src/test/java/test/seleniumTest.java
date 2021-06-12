package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class seleniumTest {
	public static WebDriver driver;
	public static ExtentReports extent;
	@BeforeClass
	public void extentreport(){
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter= new ExtentSparkReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "SP");
				
	}
	@BeforeTest
	public void selenium1(){
		System.out.println("selenium1");
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver =new ChromeDriver();
		System.out.println("Driver Open");
		driver.manage().window().maximize();
	}
	@Test
	public void selenium2(){
		ExtentTest test1=extent.createTest("Title Verification");
		System.out.println("selenium2");
		driver.get("https://mvnrepository.com/artifact/com.aventstack/extentreports/5.0.8");
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(),"Maven Repository: com.aventstack » extentreports » 5.0.8");
//extent.flush();
//driver.quit();
	}
	@Test
	public void selenium3(){
		ExtentTest test2=extent.createTest("Title Verification2");
		System.out.println("selenium3");
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		//Assert.assertTrue(false);
		test2.fail("Matching Status");
	}

	@AfterClass
	public void after() {
		extent.flush();
		driver.quit();

	}
}
