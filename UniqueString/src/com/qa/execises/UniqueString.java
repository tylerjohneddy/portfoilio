package com.qa.execises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueString {

	public static void main(String[] args) {
		System.out.println(unique2("hello world"));
		System.out.println(unique1("hello world"));
	}

	public static String unique(String s) {
		StringBuilder stringBuilder = new StringBuilder();
		for(int i= 0;i<s.length();i++) {
		s.contains(stringBuilder);
		}
		
		return s;

	}
	public static String unique1(String s) {
		Set<Character> uniqueString = new LinkedHashSet<Character>();
		String out = "";
		for (int i = 0;i<s.length();i++) {
			uniqueString.add(s.charAt(i));
		}
		for(char c : uniqueString) {
			out = out + c;
		}
	return out;
	}
	public static String unique2(String s) {
		return Arrays.asList(s.split("")).stream().distinct().collect(Collectors.joining(""));
		
	}
}
