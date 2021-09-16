package com.tawuniya.objectrepository.vve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VisitvisaMembinfopage {
	
	WebDriver driver;

	public VisitvisaMembinfopage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "mobile")
	WebElement mobile;
	
	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "city")
	WebElement city;
	
	@FindBy(id = "address")
	WebElement address;
	
	@FindBy(id = "zipCode")
	WebElement zipcode;
	
	@FindBy(id = "poBox")
	WebElement poBox;
	
	@FindBy(xpath = " //div[@id='personalDetails_buttons_div']/div/a[2]")
	WebElement personaldetailsnextbutton;
	
	//passportNext
	
	@FindBy(id = "verify-button")
	WebElement verifyotp;
	

	public WebElement mobilenumb() {
		
		return mobile;
	}
	
    public WebElement email() {
		
		return email;
	}
	
    public WebElement city() {
		
		return city;
	}
	
   public WebElement address() {
		
		return address;
	}

   public WebElement zipcode() {
		
		return zipcode;
	}
   
   public WebElement pobox() {
		
		return poBox;
	}
   
   public WebElement personaldetailsnextbutton() {
		
		return personaldetailsnextbutton;
	}
   
   
   public WebElement verifyotp() {
		
		return verifyotp;
	}


   
   
 
}
