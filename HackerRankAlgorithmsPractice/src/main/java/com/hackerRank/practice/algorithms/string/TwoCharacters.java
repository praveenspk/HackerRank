package com.hackerRank.practice.algorithms.string;

import java.util.HashSet;
import java.util.Set;

public class TwoCharacters {

	static int alternate(String s) {

		Set<Character> char_set = new HashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			char_set.add(s.charAt(i));
		}

		Character[] char_arr = char_set.toArray(new Character[char_set.size()]);
		int max = 0;

		for (int j = 0; j < char_arr.length - 1; j++) {
			for (int k = j + 1; k < char_arr.length; k++) {
				String pattern = "([^" + char_arr[j] + char_arr[k] + "])";
				String trimmedStr = s.replaceAll(pattern, "");
				if (isTwoCharacter(trimmedStr) && trimmedStr.length() > max) {
					max = trimmedStr.length();
				}
			}
		}
		return max;
	}

	static boolean isTwoCharacter(String s) {
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		int sample = alternate("beabeefeab");
		System.out.println(sample);
	}

}
