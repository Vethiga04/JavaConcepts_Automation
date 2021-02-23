package log4jExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyConfiguratorExample {

	static Logger logger=Logger.getLogger(PropertyConfiguratorExample.class);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PropertyConfigurator.configure("log4j.properties");
		
		logger.debug("It's debug");
		logger.info("It's info");
		logger.error("It's error");
		logger.fatal("It's fatal");
		logger.warn("It's warn");
		
		
	}

}
