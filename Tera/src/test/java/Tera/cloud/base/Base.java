package Tera.cloud.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import Tera.cloud.utilities.Waits;

public class Base {

	 public ChromeDriver driver;
	 public Properties pr;
	 public Properties pr1;
	 
	 @BeforeTest
	 
	 public void BrowserLaunch() throws IOException
	 
	 {
		 File f=new File("../Tera/or.properties");
		 FileInputStream fi=new FileInputStream(f);
		 pr=new Properties();
		 pr.load(fi);
	 
		 File f1=new File("../Tera/data.properties");
		 FileInputStream f2=new FileInputStream(f1);
		 pr1=new Properties();
		 pr1.load(f2);
	 
		  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Chromedriver\\chromedriver.exe");
		  ChromeOptions option=new ChromeOptions();
		  option.addArguments("disable-notifications");
		  
		  driver=new ChromeDriver();
		  driver.get("https://app.qa.tera.cloud/#/system/login?source=main_portal");
		  driver.manage().window().maximize();
		  Waits.implicitwait(driver, 10);
	 }
	 
@AfterTest
	  
public void browserclose()
	 {
		  driver.quit();
	  }

}
