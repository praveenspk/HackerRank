package com.hackerRank.practice.algorithms.string;

public class Caeser_Cipherr {

	static String caesarCipher(String s, int k) {
		
		String newString = "";
		int carr[] = new int[s.length()];
		for (int i = 0; i < s.length(); i++) {
			if ((int) s.charAt(i) >= 65 && (int) s.charAt(i) <= 90) {
				carr[i] = ((int) s.charAt(i));
				if ((carr[i] + (k % 26)) > 90) {
					newString += (char) (carr[i] - 90 + 64 + (k % 26));
				} else if ((carr[i] + (k % 26)) <= 90) {
					newString += (char) (carr[i] + (k % 26));

				}
			}
			if ((int) s.charAt(i) >= 97 && (int) s.charAt(i) <= 122) {
				carr[i] = ((int) s.charAt(i));
				if ((carr[i] + (k % 26)) > 122) {
					newString += (char) (carr[i] - 122 + 96 + (k % 26));
				} else if ((carr[i] + (k % 26)) <= 122) {
					newString += (char) (carr[i] + (k % 26));

				}
			}
			if ((int) s.charAt(i) >= 91 && (int) s.charAt(i) <= 96) {
				carr[i] = (int) s.charAt(i);
				newString += (char) (carr[i]);
			}
			if ((int) s.charAt(i) < 65 || (int) s.charAt(i) > 122) {
				carr[i] = (int) s.charAt(i);
				newString += (char) (carr[i]);
			}

		}
		return newString;
	}

	public static void main(String[] args) {
		String str = caesarCipher("middle-Outz", 2);
		System.out.println(str);

	}

}
