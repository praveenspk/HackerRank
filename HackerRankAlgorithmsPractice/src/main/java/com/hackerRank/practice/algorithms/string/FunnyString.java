package com.hackerRank.practice.algorithms.string;

public class FunnyString {

	// Complete the funnyString function below.
	static String funnyString(String s) {
		String r = (new StringBuffer(s)).reverse().toString();
		for (int i = 1; i < s.length(); i++) {
			if (Math.abs(((int) s.charAt(i)) - ((int) s.charAt(i - 1))) != Math
					.abs(((int) r.charAt(i)) - ((int) r.charAt(i - 1)))) {
				return "Not Funny";
			}
		}
		return "Funny";

	}

	public static void main(String[] args) {
		System.out.println(funnyString("bcxz"));
		


	}

}
