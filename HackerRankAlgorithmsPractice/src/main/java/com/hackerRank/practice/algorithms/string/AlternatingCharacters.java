package com.hackerRank.practice.algorithms.string;

public class AlternatingCharacters {
	// Complete the alternatingCharacters function below.
	static int alternatingCharacters(String s) {
		int j = 0;
		int count = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(j) == s.charAt(i)) {
				count++;
				j++;
			} else {
				j++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String[] str = {};

	}

}
