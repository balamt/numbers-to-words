package com.number.words.util;

public final class NumberToWordsConstant {
	
	private NumberToWordsConstant() {
	    throw new NumberFormatException("Constant class");
	  }

	public static final String BLANK_SPACE = " ";
	public static final String ZERO = "zero";
	public static final String WORD_MILLION = BLANK_SPACE + "million" + BLANK_SPACE;
	public static final String WORD_THOUSAND = BLANK_SPACE + "thousand" + BLANK_SPACE;
	public static final String WORD_HUNDRED = BLANK_SPACE + "hundred" + BLANK_SPACE;

	public static final String NEGATIVE_NUMBER_EXCEPTION_FOUND = "Negative Number Found!";

}
