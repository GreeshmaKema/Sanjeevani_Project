package com.mohs10.or;

import org.openqa.selenium.By;

public class HomeTest_PageObjects {
	
	//To login-SS 
		public static By txtusername = By.xpath("//input[@placeholder='User Name']");
		public static By txtpwd = By.xpath("//input[@placeholder='Password']");
		public static By btnlogin = By.xpath("//input[@name='submit']");
		//public static By lnkLogout = By.xpath("//a[@class='text-danger']");
			
	//Dashboard-SS
		public static By lnkDashboard = By.xpath("//a[normalize-space()='Dashboard']");	
		public static By textTitle = By.xpath("//div[@class='bob']");
		public static By lnkInstructions = By.xpath("//div[@id='instructions']");
		//public static By lnkSlide1 =By.xpath("dashboardName");
	//goto phc user
		public static By lnkPhcUser =By.xpath("//a[normalize-space()='Phc User']");
	//goto list health seeker 
		public static By lnk_ListHealthSeeker =By.xpath("//a[normalize-space()='List Health Seeker']");
	//goto Preg mother page
		public static By lnk_Preg_Mother = By.xpath("//a[normalize-space()='Pregnant Mother']");
		public static By dd_loc =By.xpath("//select[@id='pgm_location']/option[@value='525']");
		public static By txtName = By.xpath("//input[@id='name']");
		public static By txtAge = By.xpath("//input[@id='age']");
		public static By txtContact = By.xpath("//input[@id='contact']");
		public static By txtId = By.xpath("//input[@id='govt_id']");
		public static By txtCity = By.xpath("//input[@id='city']");
		public static By ddState = By.xpath("//select[@id='state']/option[@value='CHHATTISGARH']");
		public static By ddDistrict = By.xpath("//select[@name='district']/option[@value='RAIPUR']");
		public static By ddSupportedBy = By.xpath("//select[@name='supported_by']/option[@value='Trust']");
		public static By txtPartnersName = By.xpath("//input[@id='partnerName']");
		public static By btnSave = By.xpath("//input[@name='submit']");
/*	//Categories
	public static By lnkComputer = By.xpath("//li[@class='inactive']//a[normalize-space()='Computers']");
	public static By lnkDigitaldownloads = By.xpath("//li[@class='inactive']//a[normalize-space()='Digital downloads']");
	public static By lnkElectronics = By.xpath("//li[@class='inactive']//a[normalize-space()='Electronics']");
	public static By lnkApparelandShoes = By.xpath("//li[@class='inactive']//a[normalize-space()='Apparel & Shoes']");
	public static By lnkJewelry = By.xpath("//li[@class='inactive']//a[normalize-space()='Jewelry']");
	public static By lnkBooks = By.xpath("//li[@class='inactive']//a[normalize-space()='Books']");
	public static By lnkGiftCards =By.xpath("//li[@class='inactive']//a[normalize-space()='Gift Cards']");
	
	//To Register
	public static By lnkRegister = By.xpath("//a[@href=\"/register\"]");
	public static By rbGender = By.id("gender-female");
	public static By txtFirstname = By.id("FirstName");
	public static By txtLastname = By.id("LastName");
	public static By txtEmail = By.id("Email");
	public static By txtPassword = By.id("Password");
	public static By txtConfirmpassword = By.id("ConfirmPassword");
	public static By btnRegister = By.id("register-button");
	public static By btnContinue = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input");
	
	
	
	//Customer Service
	public static By btnNews = By.xpath("//a[@href=\"/news\"]");
	public static By btnBlog = By.xpath("//a[@href=\"/blog\"]");
	public static By btnComparelist = By.xpath("//a[@href=\"/compareproducts\"]");
	public static By btnRecentlyviewed = By.xpath("//a[@href=\"/recentlyviewedproducts\"]");
	
	//To subscribe
	public static By lnkYoutube = By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]");
	public static By btnSubscribe = By.xpath("//a[@href=\"http://www.youtube.com/user/nopCommerce\"]");
    
	//To goto sitemap
	public static By lnkSitemap = By.xpath("//a[normalize-space()='Sitemap']");
	public static By lnkSearch = By.xpath("//div[@class='entity-body']//a[normalize-space()='Search']");
	public static By txtSearchKeyword = By.xpath("//input[@id='Q']");
	public static By btnsearch = By.xpath("//input[@class='button-1 search-button']");
	
	//to goto shipping&returns
	public static By lnkShippingandReturns = By.xpath("//a[normalize-space()='Shipping & Returns']");
	public static By lnkShpng = By.xpath("//h1[normalize-space()='Shipping & Returns']");
	
	//Goto Contactus
	public static By lnkContactUs = By.xpath("//a[normalize-space()='Contact us']");
	public static By txtName = By.xpath("//input[@id='FullName']");
	public static By txtEmaill = By.xpath("//input[@id='Email']");
	public static By txtEnquiry = By.xpath("//textarea[@id='Enquiry']");
	public static By btnSubmit = By.xpath("//input[@name='send-email']");
	public static By txtcontactus = By.xpath("//div[@class='result']");
	
	//goto new products
	public static By lnkNewProducts = By.xpath("//a[normalize-space()='New products']");
	public static By txtphCvr = By.xpath("//h1[@itemprop='name']");
	
	//go to shpng cart
	public static By lnkShoppingCart = By.xpath("//span[normalize-space()='Shopping cart']");
	public static By txtemptyshpngcart = By.xpath("//div[@class='order-summary-content']");
	
	//-------login and order--------
	public static By lnkApparelAndShoes = By.xpath("//a[@href=\"/apparel-shoes\"]");
	public static By imgBelt = By.xpath("//img[@src=\"http://demowebshop.tricentis.com/content/images/thumbs/0000217_casual-golf-belt_125.jpeg\"]");
	public static By btnAddtoCart = By.xpath("//input[@id='add-to-cart-button-40']");
	public static By chkAgree = By.xpath("//input[@id='termsofservice']");
	public static By btnCheckout = By.xpath("//button[@id='checkout']");
	public static By btnCntnue = By.xpath("//input[@onclick='Billing.save()']");
	public static By btnBillingContinue = By.xpath("//input[@onclick='Billing.save()']");
	public static By btnShippingContinue = By.xpath("//input[@onclick='Shipping.save()']");
	public static By btnShpngMthdContinue = By.xpath("//input[@class='button-1 shipping-method-next-step-button']");
	public static By btnPaymentMthdContinue = By.xpath("//input[@class='button-1 payment-method-next-step-button']");
	public static By btnPaymentInfoContinue = By.xpath("//input[@class='button-1 payment-info-next-step-button']");
	public static By btnConfirm = By.xpath("//input[@value='Confirm']");
	
	//public static By lnkOrderDetails = By.xpath("//a[normalize-space()='Click here for order details.']");
	public static By classOrderconfrmtn = By.xpath("//strong[normalize-space()='Your order has been successfully processed!']");
	
	//AutoIT: Locators of ilovepdf website
	public static By selectwordfile = By.xpath("//span[normalize-space()='Select WORD files']");
	public static By Converttopdf = By.xpath("//span[@id='processTaskTextBtn']");
	public static By downloadbtn = By.xpath("//a[@id='pickfiles']");

	*/
}
