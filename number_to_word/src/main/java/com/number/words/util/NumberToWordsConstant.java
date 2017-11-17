                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          package com.number.words.util;

public final class NumberToWordsConstant {

	private NumberToWordsConstant() {
		throw new NumberFormatException("Constant class");
	}

	public static final String BLANK_SPACE = " ";
	public static final String ZERO = "zero";
	public static final String ONE = "one";
	public static final String TWO = "two";
	public static final String THREE = "three";
	public static final String FOUR = "four";
	public static final String FIVE = "five";
	public static final String SIX = "six";
	public static final String SEVEN = "seven";
	public static final String EIGHT = "eight";
	public static final String NINE = "nine";

	public static final String TEEN = "teen";
	public static final String TEN = "ten";
	public static final String ELEVEN = "eleven";
	public static final String TWELVE = "twelve";
	public static final String THIRTEEN = "thirteen";
	public static final String FOURTEEN = FOUR + TEEN;
	public static final String FIFTEEN = "fifteen";
	public static final String SIXTEEN = SIX + TEEN;
	public static final String SEVENTEEN = SEVEN + TEEN;
	public static final String EIGHTEEN = "eighteen";
	public static final String NINETEEN = NINE + TEEN;
	
	public static final String TY = "ty";
	public static final String TWENTY = "twenty";
	public static final String THIRTY = "thirty";
	public static final String FOURTY = FOUR + TY;
	public static final String FIFTY = "fifty";
	public static final String SIXTY = SIX + TY;
	public static final String SEVENTY = "seventy";
	public static final String EIGHTY = "eighty";
	public static final String NINETY = NINE + TY;

	public static final String WORD_MILLION = BLANK_SPACE + "million" + BLANK_SPACE;
	public static final String WORD_THOUSAND = BLANK_SPACE + "thousand" + BLANK_SPACE;
	public static final String WORD_HUNDRED = BLANK_SPACE + "hundred" + BLANK_SPACE;

	public static final String NEGATIVE_NUMBER_EXCEPTION_FOUND = "Negative Number Found!";

}
