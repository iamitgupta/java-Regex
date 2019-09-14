package com.dev.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameMatching {

	public static void main(String[] args) {

		// pattern for fist name and last name
		Pattern pat=Pattern.compile("\\w+\\s\\w+");
		Matcher mat=pat.matcher("Amit Gupta");
		boolean b=mat.matches();
		System.out.println(b);

		// pattern for fName,mName and lName
		pat=Pattern.compile("\\w+\\s\\w+\\s\\w+");
		mat=pat.matcher("Amit R Gupta");
		b=mat.matches();
		System.out.println(b);

		// for email id's.
		pat = Pattern.compile("\\w+.\\w+\\@\\w+\\.\\w+"); 
		mat = pat.matcher("amit.gupta@gmail.com");
		System.out.println("email "+mat.matches());


		//for names with limited chars
		pat = Pattern.compile("[A-Za-z]{1,25}\\s[A-Za-z]{0,25}"); 	
		mat = pat.matcher("Amit gupta");
		System.out.println(mat.matches());


		//for alphanumeric passwords
		pat = Pattern.compile("\\w+\\W+\\w+"); 
		mat = pat.matcher("45#ddd");
		System.out.println(mat.matches());

		//for digits
		pat = Pattern.compile("\\d{0,2}"); 	
		mat = pat.matcher("933");
		System.out.println(mat.matches());

		//for digits
		pat = Pattern.compile("[A-K]\\-{0,2}"); 	
		mat = pat.matcher("A-");
		System.out.println(mat.matches());

	}

}
