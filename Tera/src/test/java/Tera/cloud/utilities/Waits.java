package Tera.cloud.utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Waits {

public static void implicitwait(ChromeDriver driver, int timeInSeconds)
	
	{
		
		driver.manage().timeouts().implicitlyWait(timeInSeconds, TimeUnit.SECONDS);
	}

}

