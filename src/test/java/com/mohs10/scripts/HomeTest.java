package com.mohs10.scripts;

import org.testng.annotations.Test;

import com.mohs10.ActionDriver.SSreuseclass;
import com.mohs10.base.PDFReport;
import com.mohs10.base.StartBrowser;
import com.mohs10.reuse.CommonFuns;

	public class HomeTest extends StartBrowser
	{
		
		//Testing with Valid login inputs 
		@Test(priority = 0)
			  public void LoginPageTestCase() throws Exception {
			CommonFuns hm2 = new CommonFuns();
			 SSreuseclass.SSReusablemethod(driver, "Login");
				  hm2.logIn("Mamatva", "growayu");
				  Thread.sleep(5000);
			  }		
		
		
			//Goes to dashboard, clicks on instruction
	@Test(priority = 1)
	public void GotoDashboard() throws Exception 
	{
		CommonFuns ver = new CommonFuns();
		ver.DashBoard();
		String dashboardName= ver.ValidateTitle();
		
		//capturing the screen shot
		SSreuseclass.SSReusablemethod(driver, "VerifyingappTitle");
		Thread.sleep(2000);
	}
	
	//Goes to Phc User page
			@Test(priority = 2)
				  public void PhcUser_TestCase() throws Exception {
				CommonFuns cfs = new CommonFuns();
				 SSreuseclass.SSReusablemethod(driver, "PhcUser");
					 cfs.PhcUser();
					  Thread.sleep(5000);
				  }		
	//Goes to list health seeker
			@Test(priority = 3)
				  public void ListHealthSeeker_TestCase() throws Exception {
				CommonFuns cfs = new CommonFuns();
				 SSreuseclass.SSReusablemethod(driver, "list health seeker");
					 cfs.Listhealthseeker();
					  Thread.sleep(5000);
				  }		
	
	//Go to preg_mother page & fill details
			@Test(priority = 4)
			  public void Preg_mother_TestCase() throws Exception {
			CommonFuns cfs = new CommonFuns();
			 SSreuseclass.SSReusablemethod(driver, "Enter details");
				  //hm2.logIn("Mamatva", "growayu");
			 cfs.preg_mother_info("Test", "28", "123456789", "01", "Raipur", "Testing");
				  Thread.sleep(5000);
			  }		
			
			
	/*	
	//Clicking on Categories links 
	@Test(priority = 5)
	public void CategoriesTest() throws Exception {
		 SSreuseclass.SSReusablemethod(driver, "Categories");
		CommonFuns cat = new CommonFuns();
	    cat.Categories();
		Thread.sleep(5000);
	}
	
	//Clicking on news link 
	@Test(priority = 4)
	public void NewsbtnTestCase() throws Exception {
		CommonFuns News = new CommonFuns();
	    News.Pagedown();
	    Thread.sleep(2000);
	    News.Newsbtn();
	    SSreuseclass.SSReusablemethod(driver, "News ");
		Thread.sleep(5000);
	}
	//blog Link 
	@Test(priority = 3)
	public void BlogbtnTestCase() throws Exception {
		CommonFuns blog = new CommonFuns();
	    blog.Pagedown();
	    Thread.sleep(2000);
	    blog.Blogbtn();
	    SSreuseclass.SSReusablemethod(driver, "Blog ");
		Thread.sleep(5000);
	}
		
	//Registration of new user 
	@Test(priority = 0)
	public void RegisterPageTestCase() throws Exception {
		CommonFuns hm = new CommonFuns();
		SSreuseclass.SSReusablemethod(driver, "Registeration screen");
			  hm.Register("GKD", "GKDMohs10", "GKD1239@gmail.com", "Test@444", "Test@444");
			 
			  Thread.sleep(5000);
		  }
	
	//Testing with invalid inputs 
	@Test(priority = 2)
	public void InvalidLogInTestCase() throws Exception {
		CommonFuns hm1 = new CommonFuns();
			  hm1.invalidLogIn("Invalidlogininputs@gmail.com", "Test@1114");
			  SSreuseclass.SSReusablemethod(driver, "Login");
			  Thread.sleep(5000);
	
}

*/
	
/*	//pdf calling
	@Test(priority = 1)
	public void PDftestcase() 
	{
		PDFReport pdf = new PDFReport();
		System.out.println("pdf generated"); 
	}
	*/
	
	
	
	
		  }
