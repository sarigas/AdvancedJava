/**
 * 
 */
package fr.tbr.iam.log;

import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.core.LoggerContext;
import org.apache.logging.log4j.message.MessageFactory;

import fr.tbr.iam.log.IAMLogger;

/**
 * @author tbrou
 *
 */
public class IAMLoggerLog4j2Impl extends Logger implements IAMLogger {

	/**
	 * @param context
	 * @param name
	 * @param messageFactory
	 */
	protected IAMLoggerLog4j2Impl(LoggerContext context, String name, MessageFactory messageFactory) {
		super(context, name, messageFactory);
	}

}
