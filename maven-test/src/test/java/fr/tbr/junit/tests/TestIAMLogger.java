/**
 * 
 */
package fr.tbr.junit.tests;

import org.junit.Test;

import fr.tbr.iam.log.IAMLogger;

/**
 * @author tbrou
 *
 */
public class TestIAMLogger {
	
	private static final IAMLogger logger = fr.tbr.iam.log.IAMLogManager.getIAMLogger(TestIAMLogger.class);
	
	
	@Test
	public void testIamLogger(){
		logger.info("test");
	}

}
