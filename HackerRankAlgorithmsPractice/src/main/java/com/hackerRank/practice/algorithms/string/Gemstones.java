package com.hackerRank.practice.algorithms.string;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Gemstones {

	static int gemstones(String[] arr) {
		int n = arr.length;
		char c = 'a';
		int[] a = new int[26];
		int count = 0;
		for (int i = 0; i < n; i++) {
			String s = arr[i];
			for (int j = 0; j < s.length(); j++)
				if (a[s.charAt(j) % c] == i)
					a[s.charAt(j) % c]++;
		}
		for (int i = 0; i < 26; i++)
			if (a[i] == n)
				count++;
		return count;
	}

	public static void main(String[] args) {

		String[] arr = { "abcdde", "baccd", "eeabg" };

		System.out.println(gemstones(arr));

	}
}
