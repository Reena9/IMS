package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	public ChromeDriver driver;
	public Properties pr;
	
	
	public  Login(ChromeDriver driver, Properties pr)
	{
	
		this.driver=driver;
		this.pr=pr;
	}

	public void Signin() throws InterruptedException {
		
		WebElement username=driver.findElement(By.name(pr.getProperty("username")));
		username.sendKeys("Reena");
		
		WebElement password=driver.findElement(By.name(pr.getProperty("password")));
		
		password.sendKeys("123");
		
		Thread.sleep(1000);
		
		WebElement signin=driver.findElement(By.xpath(pr.getProperty("signin")));
		signin.click();
		
		Thread.sleep(1000);
	}
}
