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
	
	String convertDigits(int digits) throws NegativeNumberException;

}
