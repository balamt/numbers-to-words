/**
 * 
 */
package com.number.words;

import static com.number.words.util.NumberToWordsConstant.BLANK_SPACE;
import static com.number.words.util.NumberToWordsConstant.NEGATIVE_NUMBER_EXCEPTION_FOUND;
import static com.number.words.util.NumberToWordsConstant.WORD_HUNDRED;
import static com.number.words.util.NumberToWordsConstant.WORD_MILLION;
import static com.number.words.util.NumberToWordsConstant.WORD_THOUSAND;
import static com.number.words.util.NumberToWordsConstant.ZERO;
import static com.number.words.util.NumberToWordsUtil.appendWords;
import static com.number.words.util.NumberToWordsUtil.doCalculate;

import com.number.words.exceptions.NegativeNumberException;
import com.number.words.util.MathOperation;

/**
 * @author training
 *
 */
public abstract class NumberToWordsServiceImpl implements NumberToWordsService {

	public String convertDigits(int digits) throws NegativeNumberException {

		String words = "";
		
		int inputNumber = digits;

		int zero = 0;
		int ten = 10;
		int twenty = 20;
		int hundred = 100;
		int million = hundred * hundred * hundred;
		int thousand = hundred * ten;

		final String[] units = { ZERO, "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
				"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
				"nineteen" };

		final String[] tens = { ZERO, "ten", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
				"ninety" };

		if (inputNumber == zero) {
			return ZERO;
		}

		if (inputNumber < zero) {
			throw new NegativeNumberException(NEGATIVE_NUMBER_EXCEPTION_FOUND);
		}

		int millionDivide = doCalculate(inputNumber, million, MathOperation.DIVIDE);

		if (millionDivide > 0) {
			words += appendWords(convertDigits(millionDivide), WORD_MILLION);
			inputNumber %= million;
		}

		int thousandDivide = doCalculate(inputNumber, thousand, MathOperation.DIVIDE);

		if (thousandDivide > 0) {
			words += appendWords(convertDigits(thousandDivide), WORD_THOUSAND);
			inputNumber %= thousand;
		}

		int hundredDivide = doCalculate(inputNumber, hundred, MathOperation.DIVIDE);

		if (hundredDivide > 0) {
			words += appendWords(convertDigits(hundredDivide), WORD_HUNDRED);
			inputNumber %= hundred;
		}

		if (inputNumber > 0) {
			if (inputNumber < twenty)
				words += units[inputNumber];
			else {
				words += tens[inputNumber / 10];
				if ((inputNumber % ten) > 0)
					words += BLANK_SPACE + units[inputNumber % 10];
			}
		}

		return words;
	}

}
