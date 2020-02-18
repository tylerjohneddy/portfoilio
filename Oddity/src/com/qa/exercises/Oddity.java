package com.qa.exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Oddity {
	public static List<Integer> oddity(int[] nums) {
		List<Integer> out = new ArrayList<>();
		for (int i : nums) {
			if (1 % 2 != 0) {
				out.add(i);
			}
		}
		return out;

	}

	public static List<Integer> oddity1(int[] nums) {
		return Arrays.stream(nums).boxed().filter(num ->num%2==1).collect(Collectors.toList());

	}
}
