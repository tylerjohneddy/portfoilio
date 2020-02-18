package com.qa.find;

public class Find {
	public static boolean find(String sentence,int i,char charactor) {
		return sentence.charAt(i-1)==charactor;
	}
	public static boolean find1(String sentence,int i,char charactor) {
		return sentence.substring(i-1,i).equals(String.valueOf(charactor));
	}

	

}

