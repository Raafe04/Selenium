package com.tawuniya.objectrepository.vve;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VisivisaPolicyinfopage {
	
	WebDriver driver;

	public VisivisaPolicyinfopage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id = "SavePolicy")
	WebElement SavePolicybutton;
	
	
	
   public WebElement savepolicybutton() {
		
		return SavePolicybutton;
	}
   
   
   
 
}
