package com.tawuniya.visitvisaextension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.tawuniya.helper.PropertyHelper;
import com.tawuniya.objectrepository.vve.VisitvisaLaunchpage;

public class VisitvisavalidationTEST {
	
	String url = PropertyHelper.getPropertyValue("url");
	String webdrv = PropertyHelper.getPropertyValue("webdriver");
	String drvpath = PropertyHelper.getPropertyValue("driverpath");
	String webdrvIE = PropertyHelper.getPropertyValue("webdriverIE");
	String drvpathIE = PropertyHelper.getPropertyValue("driverpathIE");
	
	
@Test
	public void vveemptyvaluesvalidation() {
		
		System.setProperty(webdrv, drvpath);
		WebDriver driver = new ChromeDriver();
	    driver.get(url);
	    VisitvisaLaunchpage vlp = new VisitvisaLaunchpage(driver);
	    vlp.nextbutton().click();
	    Assert.assertEquals(vlp.errormsg().getText(),"There are some information missing or not correctly written. Please refer to the icon");
	    driver.close();
}
	
	@Test
	public void visanumberemptyvalidation() throws InterruptedException {
		
		System.setProperty(webdrv, drvpath);
		WebDriver driver = new ChromeDriver();
	    driver.get(url);
	    VisitvisaLaunchpage vlp = new VisitvisaLaunchpage(driver);
	    vlp.nextbutton().click();
	    vlp.verror().click();
	    Assert.assertEquals(vlp.fielderror().getText(),"Field required.");
	    driver.close();

}
	

	@Test
	public void vveemptyvaluesvalidationIE() {
		
		System.setProperty(webdrvIE, drvpathIE);
		WebDriver driver = new InternetExplorerDriver();
	    driver.get(url);
	    VisitvisaLaunchpage vlp = new VisitvisaLaunchpage(driver);
	    vlp.nextbutton().click();
	    Assert.assertEquals(vlp.errormsg().getText(),"There are some information missing or not correctly written. Please refer to the icon");
}
	
	@Test
	public void visanumberemptyvalidationIE() throws InterruptedException {
		
		System.setProperty(webdrvIE, drvpathIE);
		WebDriver driver = new InternetExplorerDriver();
	    driver.get(url);
	    VisitvisaLaunchpage vlp = new VisitvisaLaunchpage(driver);
	    vlp.nextbutton().click();
	    vlp.verror().click();
	    Assert.assertEquals(vlp.fielderror().getText(),"Field required.");

}		
	
	
		
	
}