package pl.edu.wroc.pwr.ds;

import org.apache.log4j.Logger;

public class Hello{

	final static Logger logger = Logger.getLogger(Hello.class);
	
	public Hello(){
		logger.info("Hello handler created");
	}

	public void hello(String whom){
		logger.info(String.format("Hello %s", whom));
	}

}