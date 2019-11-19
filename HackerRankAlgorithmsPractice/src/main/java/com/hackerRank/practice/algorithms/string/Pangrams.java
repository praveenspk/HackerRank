package com.hackerRank.practice.algorithms.string;

import java.util.Arrays;

public class Pangrams {

	static String pangrams(String s) {

		return (isPangram(s)) ? "pangram" : "not pangram";
	}

	static boolean isPangram(String sentence) {
		String lowerSentence = sentence.toLowerCase();
		for (char letter = 'a'; letter <= 'z'; letter++) {
			if (lowerSentence.indexOf(letter) < 0)
				return false;
		}
		return true;
	}

	static Boolean isPanagram(String input) {

		char[] str = input.replaceAll(" ", "").toLowerCase().toCharArray();
		Arrays.sort(str);
		System.out.println(str);
		for (int i = 0; i < str.length - 1; i++) {
			if ((str[i] + 1 != str[i + 1]) && !(str[i] == str[i + 1]) && str[i] != ' ') {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		
		System.out.println(isPanagram("The quick brown fox jumps over the lazydog"));

		System.out.println(pangrams("The quick brown fox jumps over the lazy dog"));
	}

}
