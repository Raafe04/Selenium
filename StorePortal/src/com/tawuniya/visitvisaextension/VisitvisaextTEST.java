package com.tawuniya.visitvisaextension;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.tawuniya.helper.PropertyHelper;
import com.tawuniya.objectrepository.vve.VisitvisaLaunchpage;
import com.tawuniya.objectrepository.vve.VisitvisaMembinfopage;
import com.tawuniya.objectrepository.vve.Visitvisapaymentpage;
import com.tawuniya.objectrepository.vve.VisivisaPolicyinfopage;

public class VisitvisaextTEST {
	
	
	

@Test
public void vvesadadpayment() throws InterruptedException {
	
	String url = PropertyHelper.getPropertyValue("url");
	String webdrv = PropertyHelper.getPropertyValue("webdriver");
	String drvpath = PropertyHelper.getPropertyValue("driverpath");
	System.setProperty(webdrv,drvpath);
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.manage().window().maximize();
    driver.get(url);
    VisitvisaLaunchpage vlp = new VisitvisaLaunchpage(driver);
    vlp.visanumber().sendKeys("6059031432");
    vlp.passportnumber().sendKeys("N4235859");
    vlp.bordernumber().sendKeys("4123336666");
    vlp.visaexpdate().sendKeys("20/12/2019");
    Select sd = new Select(vlp.insuranceduration());
    sd.selectByIndex(1);
    vlp.checkbox().click();
    vlp.nextbutton().click();
    VisivisaPolicyinfopage vip = new VisivisaPolicyinfopage(driver);
    vip.savepolicybutton().click();
    VisitvisaMembinfopage vmp = new VisitvisaMembinfopage(driver);
    vmp.mobilenumb().clear();
    vmp.mobilenumb().sendKeys("966541309592");
    vmp.email().clear();
    vmp.email().sendKeys("raafe04@gmail.com");
    vmp.city().clear();
    vmp.city().sendKeys("Riyadh");
    vmp.address().clear();
    vmp.address().sendKeys("riyadh tawuniya");
    vmp.zipcode().sendKeys("41235");
    vmp.pobox().sendKeys("118632");
    JavascriptExecutor executor = (JavascriptExecutor)driver;
    executor.executeScript("arguments[0].click();",vmp.personaldetailsnextbutton());
    Thread.sleep(5000); 
    //vmp.verifyotp().click();
   // WebDriverWait wait=new WebDriverWait(driver,30);
   // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='paymentQDIV']/form/div/div/label/span[1]")));
    Visitvisapaymentpage vpay = new Visitvisapaymentpage(driver);
    vpay.checkone().click();
    vpay.checktwo().click();
    //vpay.sadadpayment().click();
    
}


}
