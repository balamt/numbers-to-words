package com.number.words.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import com.number.words.NumberToWordsClient;
import com.number.words.exceptions.NegativeNumberException;
import com.number.words.util.NumberToWordsConstant;

@RunWith(MockitoJUnitRunner.class)
public class NumberToWordsTest {

	@InjectMocks
	NumberToWordsClient numberToWordsClient;

	@Test
	public void testToConvertNumberToWords() throws NegativeNumberException {

		int inputNumber = 1598269;
		String expectedWord = "one million five hundred ninety eight thousand two hundred sixty nine";
		assertEquals(expectedWord, numberToWordsClient.convertDigits(inputNumber));
	}

	@Test
	public void testConvertZeroNumberToWordsResultsZero() throws NegativeNumberException {
		int inputNumber = 0;
		String expectedWord = NumberToWordsConstant.ZERO;
		assertEquals(expectedWord, numberToWordsClient.convertDigits(inputNumber));
	}

	@Test
	public void testConvertNumberTenToWordsResultsTen() throws NegativeNumberException {
		int inputNumber = 10;
		String expectedWord = "ten";
		assertEquals(expectedWord, numberToWordsClient.convertDigits(inputNumber));
	}

	@Test(expected = NegativeNumberException.class)
	public void testConvertNegativeNumberToWordsResultsError() throws NegativeNumberException {
		int inputNumber = -1269;
		numberToWordsClient.convertDigits(inputNumber);
	}
}
