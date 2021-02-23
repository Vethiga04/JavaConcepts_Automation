package log4jExample;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class XMLConfiguratorExample {

	static Logger logger=Logger.getLogger(XMLConfiguratorExample.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DOMConfigurator.configure("log4j.xml");
		
		logger.debug("It's debug");
		logger.info("It's info");
		logger.error("It's error");
		logger.fatal("It's fatal");
		logger.warn("It's warn");
	}

}
