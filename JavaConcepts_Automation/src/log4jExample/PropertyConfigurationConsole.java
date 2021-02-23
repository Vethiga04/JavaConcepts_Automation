package log4jExample;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PropertyConfigurationConsole {

	static Logger logger=Logger.getLogger(PropertyConfigurationConsole.class);
	
	public static void main(String[] args) {
	
		PropertyConfigurator.configure("log4jconsole.properties");
		

		logger.debug("It's debug");
		logger.info("It's info");
		logger.error("It's error");
		logger.fatal("It's fatal");
		logger.warn("It's warn");
	
	}
}
