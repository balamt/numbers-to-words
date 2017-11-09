/**
 * 
 */
package com.number.words.exceptions;

/**
 * @author training
 *
 */
public class NegativeNumberException extends NumberToWordException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7358353487974838954L;

	/**
	 * @param message
	 */
	public NegativeNumberException(String message) {
		super(message);
	}

}
