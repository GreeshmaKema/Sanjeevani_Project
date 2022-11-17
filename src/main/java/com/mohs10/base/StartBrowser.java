package com.mohs10.base;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StartBrowser 
{
	public static WebDriver driver;
	 //set up report
	 public static ExtentReports extent;
	 public static ExtentTest parentTest;
	 public static ExtentTest childTest;
	 ExtentSparkReporter sparkReporter;
	 
	 @BeforeTest
	 public void generateReport()
	 {
		// Create an object of Extent Reports
		 extent = new ExtentReports();
		 extent.attachReporter(sparkReporter);
		 
		 sparkReporter = new ExtentSparkReporter("Test-Reports/SanjeevaniProjectReport.html");
		 extent.attachReporter(sparkReporter);
		 //String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		 extent.setSystemInfo("Host Name", "Mohs10 Technologies");
         extent.setSystemInfo("Environment", "Automation Testing Report");
         extent.setSystemInfo("User Name", "Deepika");
         sparkReporter.config().setDocumentTitle("Automation Report ");
                // Name of the report
         sparkReporter.config().setReportName("Automated TestCases HTML Report ");
                // Dark Theme
         sparkReporter.config().setTheme(Theme.STANDARD);
	 }
	 
	 @BeforeMethod
	 public void methodName(Method method)
	 {
		parentTest = extent.createTest(method.getName()); 
	 }
	  @BeforeClass
	  public void beforeClass() {
		 
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
		  //driver.get("http://demowebshop.tricentis.com/"); 
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.quit();
		  extent.flush();
	  }


}
