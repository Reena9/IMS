package Tera.cloud.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {
	public static void dropdown(WebElement ele, int Index)
	{
		Select s=new Select(ele);
		s.selectByIndex(Index);
	}
	public static void dropdown(WebElement ele, String value)
	{
		Select s=new Select(ele);
		s.selectByValue(value);
	}

}
