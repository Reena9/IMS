package org.testing.utilities;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Logs {
	public static void takelogs(String classname, String message)
	{
		DOMConfigurator.configure("../IMS_Office/log.xml");
		Logger l=Logger.getLogger(classname);
		l.info(message);
	
}
}
