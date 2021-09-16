package com.tawuniya.objectrepository.vve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VisitvisaLaunchpage {
	
	WebDriver driver;

	public VisitvisaLaunchpage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "visaNo")
	WebElement visanumber;
	
	@FindBy(id = "passNo")
	WebElement passportnumber;
	
	@FindBy(id = "borderNo")
	WebElement bordernumber;
	
	@FindBy(id = "visitExpiryDate")
	WebElement visaexpdate;
	
	@FindBy(id = "insuranceDurationId")
	WebElement insuranceduration;
	
	@FindBy(id = "myCheck")
	WebElement checkbox;
	
	@FindBy(id = "passportNext")
	WebElement nextbutton;
	
	//passportNext
	@FindBy(className = "field-validation-error")
	WebElement error;
	
	@FindBy(xpath = "//span[@class='error-message']")
	WebElement validationerror;
	
	@FindBy(xpath = "//span[@class='validation-error']")
	WebElement verror;

	public WebElement visanumber() {
		
		return visanumber;
	}
	
    public WebElement passportnumber() {
		
		return passportnumber;
	}
	
    public WebElement bordernumber() {
		
		return bordernumber;
	}
	
   public WebElement visaexpdate() {
		
		return visaexpdate;
	}

   public WebElement insuranceduration() {
		
		return insuranceduration;
	}
   
   public WebElement checkbox() {
		
		return checkbox;
	}
   
   public WebElement nextbutton() {
		
		return nextbutton;
	}
   
   public WebElement errormsg() {
		
		return error;
	}
 
  public WebElement fielderror() {
		
		return validationerror;
	}
  public WebElement verror() {
		
		return verror;
	}
 
}
