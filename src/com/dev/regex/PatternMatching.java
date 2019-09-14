package com.dev.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

	public static void main(String[] args) {

		// \d used to match the single digit[0-9] 
		Pattern pat=Pattern.compile("\\d");
		Matcher mat=pat.matcher("1");
		boolean b=mat.matches();

		System.out.println(b);
		// suffix + for multiple pattern
		// \d+ used to match the Multiple digit[0-9] 
		pat=Pattern.compile("\\d+");
		mat=pat.matcher("1234");
		b=mat.matches();
		System.out.println(b);

		// \D used to match the single non-digit ie. chars
		pat=Pattern.compile("\\D");
		mat=pat.matcher("a");
		b=mat.matches();
		System.out.println(b);

		// \D+ used to match the multiple non-digit ie. chars
		pat=Pattern.compile("\\D+");
		mat=pat.matcher("abc");
		b=mat.matches();
		System.out.println(b);

		// \w used to match the single chars(incl digits) except spcl chars
		pat=Pattern.compile("\\w");
		mat=pat.matcher("");
		b=mat.matches();
		System.out.println(b);

		// \W used to match the non-chars ie. spcl chars
		pat=Pattern.compile("\\W");
		mat=pat.matcher("@");
		b=mat.matches();
		System.out.println(b);

		// \s used to match the single blank space
		pat=Pattern.compile("\\s");
		mat=pat.matcher(" ");
		b=mat.matches();
		System.out.println(b);

		// \S used to match the non blank space
		pat=Pattern.compile("\\S");
		mat=pat.matcher("z");
		b=mat.matches();
		System.out.println(b);

		// \s used to match the blank space
		pat=Pattern.compile("\\w+\\");
		mat=pat.matcher(" ");
		b=mat.matches();
		System.out.println(b);







	}

}
