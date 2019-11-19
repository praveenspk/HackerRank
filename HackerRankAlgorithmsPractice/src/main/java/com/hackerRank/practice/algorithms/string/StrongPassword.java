package com.hackerRank.practice.algorithms.string;

public class StrongPassword {

	static int minimumNumber(int n, String password) {

		int lc = 0, uc = 0, no = 0, sc = 0;
		int sum = 0;

		String lowercase = ".*[a-z]+.*";
		String uppercase = ".*[A-Z]+.*";
		String num = ".*[0-9]+.*";
		String specialchar = ".*[-!@#$%^&*()+]+.*";
		
		// Regex for pattern matching

		if (!(password.matches(lowercase)))
			lc++;
		// if there is no match to a lowercase,"lc" is increased by 1.

		if (!(password.matches(uppercase)))
			uc++;
		// if there is no match to an uppercase,"uc" is increased by 1.

		if (!(password.matches(num)))
			no++;
		// if there is no match to a number,"no" is increased by 1.

		if (!(password.matches(specialchar)))
			sc++;
		// if there is no match to a specialCharacter,"sc" is increased by 1.

		sum = lc + uc + sc + no;

		return (sum > (6 - n)) ? sum : (6 - n);

	}

	public static void main(String[] args) {

		int sample = minimumNumber(12, "#HackerRank1");
		System.out.println(sample);

	}

}
