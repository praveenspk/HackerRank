package com.hackerRank.practice.algorithms.string;

public class CamelCase {

	static void getCamelCase(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (Character.isUpperCase(s.charAt(i))) {
				count++;
			}
		}
		System.out.println(count + 1);
	}

	public static void main(String[] args) {

		// String str = "saveChangesInTheEditor";
		String str = "";
		getCamelCase(str);
	}

}
