package com.hackerRank.practice.algorithms.string;

import java.awt.image.RescaleOp;

public class HackerRankinString {

	private static String checkIfIsHacker(String s) {

		String str = "hackerrank";
		if (s.length() < str.length()) {
			return "NO";
		}
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			if (j < str.length() && s.charAt(i) == str.charAt(j)) {
				j++;
			}
		}
		return (j == str.length() ? "YES" : "NO");

	}

	// Complete the hackerrankInString function below.
	static boolean hackerrankInString(String s) {
		String hackerrank = "hackerrank";
		int index = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == hackerrank.charAt(index)) {
				index++;
			}
			if (index == hackerrank.length()) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = hackerrankInString("hhaacckkekraraannk");
		System.out.println(flag ? "YES" : "NO");

		String str = checkIfIsHacker("hhaacckkekraraannk");
		System.out.println(str);

	}

}
