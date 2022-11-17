package com.mohs10.reuse;
	import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.mohs10.base.StartBrowser;
	import com.mohs10.ActionDriver.Action;
	import com.mohs10.or.HomeTest_PageObjects;

	public class CommonFuns {
		
		public Action aDriver;
		public static WebDriver driver;
		
		public CommonFuns()
		{
			aDriver = new Action();
			driver = StartBrowser.driver;
		}
		
		//Login process-SS
		public void logIn(String email, String pwd) throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Login to application");
			aDriver.navigateToApplication("https://doctor.growayu.com/growayuassist/index.php");
			aDriver.type(HomeTest_PageObjects.txtusername, email, "Username text box");
			aDriver.type(HomeTest_PageObjects.txtpwd, pwd, "password text box");
			aDriver.click(HomeTest_PageObjects.btnlogin, "Login button");
			//aDriver.click(HomeTest_PageObjects.lnkLogout, "Logout link");
		}
		//GOto dashboard
		public void DashBoard() throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Go to Dashboard");
			//aDriver.navigateToApplication("https://doctor.growayu.com/growayuassist/index.php");
			aDriver.click(HomeTest_PageObjects.lnkDashboard, "Dashboard page");
		}	
		//Go to Dashboard -SS
		public String ValidateTitle() throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Goto DB & validate title, Goto instructions");
			String dashboardName =aDriver.getText(HomeTest_PageObjects.textTitle, "Name of the Title");
			aDriver.click(HomeTest_PageObjects.lnkInstructions, "Instructions tab");
			//aDriver.click(HomeTest_PageObjects.lnkSlide1, "slide1");
			return dashboardName;
		}
		
		//Goto PhcUser-SS
		public void PhcUser() throws Exception
		{
			StartBrowser.childTest = StartBrowser.parentTest.createNode("Go to Phc User");
			aDriver.click(HomeTest_PageObjects.lnkPhcUser, "PhcUser page");
		}	
		//Goto list health seeker-SS
				public void Listhealthseeker() throws Exception
				{
					StartBrowser.childTest = StartBrowser.parentTest.createNode("Go to list health seeker");
					aDriver.click(HomeTest_PageObjects.lnk_ListHealthSeeker, "PhcUser page");
				}	
		//Goto Preg mother page-SS
			public void preg_mother_info(String Name, String age,String contact, String Id, String city, String PartnersName) throws Exception
			{
				StartBrowser.childTest = StartBrowser.parentTest.createNode("Goto preg mother page and fill details");
				aDriver.click(HomeTest_PageObjects.lnk_Preg_Mother, "click on preg_mother link");
				aDriver.click(HomeTest_PageObjects.dd_loc, "select program location from dropdown");
				aDriver.type(HomeTest_PageObjects.txtName, Name, "Enter name");
				aDriver.type(HomeTest_PageObjects.txtAge, age, "Enter age");
				aDriver.type(HomeTest_PageObjects.txtContact, contact, "Enter contact num");
				aDriver.type(HomeTest_PageObjects.txtId, Id, "Enter id");
				aDriver.type(HomeTest_PageObjects.txtCity, city, "Enter city name");
				aDriver.click(HomeTest_PageObjects.ddState, "select state from dropdown");
				aDriver.click(HomeTest_PageObjects.ddDistrict, "select District from dropdown");
				aDriver.click(HomeTest_PageObjects.ddSupportedBy, "select supportedBy from dropdown");
				aDriver.type(HomeTest_PageObjects.txtPartnersName, PartnersName, "Enter Partnersname");
				aDriver.click(HomeTest_PageObjects.btnSave, "click on button save");
			}
		
		
/*		//News button
		  public void Pagedown() throws Exception
		  
		  { 
		  StartBrowser.childTest =StartBrowser.parentTest.createNode("Page down");
		  aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
		  Actions a=new Actions(driver);
		  a.sendKeys(Keys.PAGE_DOWN).perform();
		  a.sendKeys(Keys.PAGE_DOWN).perform();
		  }
		 
		  public void Newsbtn() throws Exception
		  {
			StartBrowser.childTest = StartBrowser.parentTest.createNode("News button");
			aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
			aDriver.click(HomeTest_PageObjects.btnNews, "Performed click operation on News button");
		  }
		  
		  //Blog Link
		  public void Blogbtn() throws Exception
			{
				StartBrowser.childTest = StartBrowser.parentTest.createNode("Blog buttton");
				aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
				aDriver.click(HomeTest_PageObjects.btnBlog, "Performed click operation on Blog button");
			}
			
		  //Categories
		  public void Categories() throws Exception 
		  {
			  	StartBrowser.childTest = StartBrowser.parentTest.createNode("Category links");
				aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
				aDriver.click(HomeTest_PageObjects.lnkBooks, "Performed click operation on books link");
				aDriver.click(HomeTest_PageObjects.lnkComputer,"Performed click operation on Computer Link");
				aDriver.click(HomeTest_PageObjects.lnkElectronics,"Performed click operation on Electronics Link");
				aDriver.click(HomeTest_PageObjects.lnkApparelandShoes,"Performed click operation on Apparel and Shoes Link");
				aDriver.click(HomeTest_PageObjects.lnkDigitaldownloads,"Performed click operation on Digital Downloads Link");
				aDriver.click(HomeTest_PageObjects.lnkJewelry,"Performed click operation on Jewelry Link");
				aDriver.click(HomeTest_PageObjects.lnkGiftCards,"Performed click operation on Gift Cards Link");
		  }
		  
		  //AutoIT Reuse functions
		  public void uploadWordFile() throws Exception
			{
				try {
				
				StartBrowser.childTest = StartBrowser.parentTest.createNode("Automation using Autoit tool");
				aDriver.navigateToApplication("https://www.ilovepdf.com/word_to_pdf");
				aDriver.click(HomeTest_PageObjects.selectwordfile, "Wordtopdf convert btn");
				
				Runtime.getRuntime().exec("Fileupload.exe");
				
				aDriver.click(HomeTest_PageObjects.Converttopdf, "Convert btn");
				
				Thread.sleep(3000);
				aDriver.click(HomeTest_PageObjects.downloadbtn, "Download the converted file");	
				 
				}
				catch (StaleElementReferenceException e) {
					
				}
				finally {
					Runtime.getRuntime().exec("Filedownload.exe");
				}
				  
				Thread.sleep(5000);
			}
		  
		  //Verify the website title
		  public void VerifyingWebsiteTitle() 
		  {
			  StartBrowser.childTest = StartBrowser.parentTest.createNode("Verifying the Title of the Application");
			  aDriver.navigateToApplication("http://demowebshop.tricentis.com/");
			  
			  String actualTitle = driver.getTitle();
			  String expTitle = "Demo Web Shop";
			  
			  if(actualTitle.equalsIgnoreCase(expTitle)) 
			  {
				
				System.out.println("Verified Title : Test Passed   "+actualTitle); 
			  }
				else {
					System.out.println("Title Not Matched : Test Failed"+expTitle); 
			  }
		}
	*/
}

