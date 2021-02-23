package log4jExample;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class BasicConfiguratorExample {

	static Logger logger=Logger.getLogger(BasicConfiguratorExample.class); //It's factory design pattern

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicConfigurator.configure();
		
		
		logger.debug("This is debug related log message");
		logger.info("This is info related log message");
		logger.warn("This is warn related log message");
		logger.error("This is error related log message");
		logger.fatal("This is ftal related log message");
		
		
		
	}

}
