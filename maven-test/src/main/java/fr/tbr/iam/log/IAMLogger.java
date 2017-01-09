/**
 * 
 */
package fr.tbr.iam.log;

import org.apache.logging.log4j.Level;

/**
 * @author tbrou
 *
 */
public interface IAMLogger {
	
	 /**
     * Logs a message CharSequence with the {@link Level#DEBUG DEBUG} level.
     *
     * @param message the message object to log.
     */
    void debug(CharSequence message);

    /**
     * Logs a CharSequence at the {@link Level#DEBUG DEBUG} level including the stack trace of the {@link Throwable}
     * <code>t</code> passed as parameter.
     *
     * @param message the message CharSequence to log.
     * @param t the exception to log, including its stack trace.
     */
    void debug(CharSequence message, Throwable t);
    
    
    /**
     * Logs a message object with the {@link Level#INFO INFO} level.
     *
     * @param message the message string to log.
     */
    void info(String message);

    /**
     * Logs a message with parameters at the {@link Level#INFO INFO} level.
     *
     * @param message the message to log; the format depends on the message factory.
     * @param params parameters to the message.
     * @see #getMessageFactory()
     */
    void info(String message, Object... params);


    
    
}
