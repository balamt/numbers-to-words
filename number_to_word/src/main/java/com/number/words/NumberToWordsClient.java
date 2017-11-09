/**
 * 
 */
package com.number.words;

import com.number.words.exceptions.NegativeNumberException;

/**
 * @author training
 *
 */
public class NumberToWordsClient extends NumberToWordsServiceImpl {

	@Override
	public String convertDigits(int digits) throws NegativeNumberException {
		String words = "";
		words = super.convertDigits(digits);
		return words;
	}

}
