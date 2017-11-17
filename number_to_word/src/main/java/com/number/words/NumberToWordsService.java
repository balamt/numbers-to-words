/**
 * 
 */
package com.number.words;

import com.number.words.exceptions.NegativeNumberException;

/**
 * @author training
 *
 */
public interface NumberToWordsService {
	
	/**
	 * convertDigits - converting the input number to word
	 * @param digits - Input number
	 * @throws NegativeNumberException
	 * 
	 */
	String convertDigits(int digits) throws NegativeNumberException;

}
