


package org.teting.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base 
{
 public ChromeDriver driver;
 public Properties pr;
 
 @BeforeMethod
 
 public void BrowserLaunch() throws IOException
 {
	 File f=new File("../IMS_Office/ele.properties");
	 FileInputStream fi=new FileInputStream(f);
	 pr=new Properties();
	 pr.load(fi);
 
	  System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
	  ChromeOptions option1= new ChromeOptions();
	  option1.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
	  ChromeOptions option=new ChromeOptions();
	  option.addArguments("disable-notifications");
	  driver=new ChromeDriver(option);
	  driver.get("http://test.ims.abbieit.in");
	  driver.manage().window().maximize();
	
  }
  @AfterMethod
  
  public void browserclose()
  {
	  driver.quit();
  }
  
  
}
