package com.hackerRank.practice.algorithms.string;

public class HighestValuePalindrome {

	static String highestValuePalindrome(String s, int n, int k) {

		char[] pal = s.toCharArray();

		// **** initialize indices ****
		int l = 0;
		int r = s.length() - 1;

		// **** attempt to make the string a palindrome ****
		while (l < r) {

			// **** replace left and right by their max ****
			if (s.charAt(l) != s.charAt(r)) {
				pal[l] = pal[r] = (char) Math.max(s.charAt(l), s.charAt(r));
				k--;
			}

			// **** updated indices ****
			l++;
			r--;
		}

		// **** check if we are done ****
		if (k < 0) {
			return "-1";
		}

		// **** initialize indices ****
		l = 0;
		r = s.length() - 1;

		// **** second pass (check if we can update digits to '9') ****
		while (l <= r) { // **** change mid character to '9' **** if ((l == r) && (k > 0)) {
			pal[l] = '9';
		}

		// **** check on left character ****
		if (pal[l] < '9') { // **** we can update them with cost of 2 ****
			if (k >= 2 && pal[l] == s.charAt(l) && pal[r] == s.charAt(r)) {
				pal[l] = pal[r] = '9';
				k -= 2;
			}

			// **** we can update them with cost 1 ****
			else if (k >= 1 && (pal[l] != s.charAt(l) || pal[r] != s.charAt(r))) {
				pal[l] = pal[r] = '9';
				k--;
			}
			// **** updated indices ****
			l++;
			r--;
			// **** ****
		}

		return new String(pal);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(highestValuePalindrome("4", 1, 3943));

	}

}
