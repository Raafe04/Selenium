package com.tawuniya.objectrepository.vve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Visitvisapaymentpage {
	
	WebDriver driver;

	public Visitvisapaymentpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//div[@id='paymentQDIV']/form/div/div/label/span[1]")
	WebElement checkone;
	
	
	@FindBy(xpath = "//div[@id='paymentQDIV']/form/div[3]/div/label/span[1] ")
	WebElement checktwo;
	
	
	@FindBy(id = "sadaddivId")
	WebElement sadad;
	
	@FindBy(id = "creditCarddivId")
	WebElement ccpayment;
	
   public WebElement checkone() {
		
		return checkone;
	}
    
   public WebElement checktwo() {
		
		return checktwo;
	}
   public WebElement sadadpayment() {
		
		return sadad;
	}
   public WebElement ccpayment() {
		
		return ccpayment;
	}
	
   
 
}
