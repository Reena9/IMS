package Tera.cloud.testcripts;



import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;     

import Tera.cloud.base.Base;
import Tera.cloud.pages.Login;
import Tera.cloud.utilities.Screenshots;
import Tera.cloud.utilities.Waits;

public class TC1_User extends Base
{
@Test
	public void userform() throws IOException
	{
		try {
			
		
		Login l=new Login(driver,pr);
		l.loginfunctionality(driver, pr1);
		Waits.implicitwait(driver, 30);
		
		
		WebElement spend=driver.findElement(By.xpath(pr.getProperty("spend")));
		spend.click();
		WebElement purchase=driver.findElement(By.xpath(pr.getProperty("purchase")));
		purchase.click();
		WebElement newreq=driver.findElement(By.xpath(pr.getProperty("newrequest")));
		newreq.click();
		WebElement reference=driver.findElement(By.xpath(pr.getProperty("reference")));
		reference.sendKeys(pr1.getProperty("reference"));
		
		WebElement notes=driver.findElement(By.xpath(pr.getProperty("notes")));
		notes.sendKeys(pr1.getProperty("notes"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 1000)");
		
		
		
		WebElement list=driver.findElement(By.xpath(pr.getProperty("list")));
		list.click();
		
		List <WebElement> items=list.findElements(By.xpath(pr.getProperty("selection")));
		for(WebElement item:items)
		{
			if("Service".equals(item.getText()))
				item.click();
			Waits.implicitwait(driver, 15);
		}
		
	
		
		WebElement submit=driver.findElement(By.xpath(pr.getProperty("submit")));
		submit.click();
		
		  
		
		} catch (Exception e)
		
		{

			 Screenshots.takescreenshots(driver, "E:\\Reena\\TC1_User failed.png"); 
			 
			 
		}{
	}

		
		
		
	}}   


