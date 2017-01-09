/**
 * 
 */
package fr.tbr.junit.tests;

import org.junit.Test;

import fr.tbr.iam.log.IAMLogger;
import fr.tbr.iam.log.impl.IAMLogManager;

/**
 * @author tbrou
 *
 */
public class TestIAMLogger {
	
	private static final IAMLogger logger = IAMLogManager.getIAMLogger(TestIAMLogger.class);
	
	
	@Test
	public void testIamLogger(){
		logger.info("test");
	}

}
