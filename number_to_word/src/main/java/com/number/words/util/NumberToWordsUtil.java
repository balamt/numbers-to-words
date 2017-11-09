/**
 * 
 */
package com.number.words.util;

import com.number.words.util.MathOperation;

public final class NumberToWordsUtil {

	private NumberToWordsUtil() {
	}

	public static int doCalculate(int firstDigits, int secondeDigit, MathOperation operation) {
		return (operation == MathOperation.DIVIDE) ? (firstDigits / secondeDigit) : (firstDigits % secondeDigit);
	}

	public static String appendWords(String numbers, String words) {
		StringBuilder appendBuilder = new StringBuilder();
		appendBuilder.append(numbers);
		appendBuilder.append(words);
		return appendBuilder.toString();
	}
}
