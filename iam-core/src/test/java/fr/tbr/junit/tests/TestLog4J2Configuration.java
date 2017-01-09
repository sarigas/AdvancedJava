/**
 * 
 */
package fr.tbr.junit.tests;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author tbrou
 *
 */
public class TestLog4J2Configuration {
	private static final Logger logger = LogManager.getLogger(TestLog4J2Configuration.class);
	
	
	
	@BeforeClass
	public static void globalSetup(){
		logger.info("globalSetup");
	}
	
	@Before
	public void setUp(){
		logger.info("setup");
	}
	
	@Test
	public void testInit(){
		logger.info("init1");
		
	}

	@Test
	public void testInit2(){
		logger.info("init2");
		
	}
	
	@Test
	public void testInit3(){
		logger.info("init3");
		
	}
	@After
	public void tearDown(){
		logger.info("tearDown");
	}
	
	
	@AfterClass
	public static void globalTearDown(){
		logger.info("globalTearDown");
	}
	

}
