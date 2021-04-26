package Tera.cloud.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Tera.cloud.utilities.Waits;

public class Login {
	public ChromeDriver driver;
	public Properties pr;
	public Properties pr1;

	
	public Login(ChromeDriver driver, Properties pr) 
	
	{

		this.driver=driver;
		this.pr=pr;
	}
public void loginfunctionality(ChromeDriver driver, Properties pr1)
{
	WebElement email=driver.findElement(By.xpath(pr.getProperty("email")));
	email.sendKeys(pr1.getProperty("email"));
	
     Waits.implicitwait(driver, 30);
	WebElement password= driver.findElement(By.xpath(pr.getProperty("password")));
	password.sendKeys(pr1.getProperty("password"));
	
	
	WebElement login= driver.findElement(By.xpath(pr.getProperty("login")));
	login.click();
	
}

}
