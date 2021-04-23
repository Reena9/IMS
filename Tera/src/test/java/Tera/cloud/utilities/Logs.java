package Tera.cloud.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logs {
	public static void takelogs(String classname, String message)
	{
		DOMConfigurator.configure("../Tera/layout.xml");
		Logger l=Logger.getLogger(classname);
		l.info(message);

}
}



