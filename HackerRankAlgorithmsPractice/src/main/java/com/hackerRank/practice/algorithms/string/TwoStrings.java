package com.hackerRank.practice.algorithms.string;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class TwoStrings {
	static String twoStrings(String s1, String s2) {
		IntStream alphabets = "abcdefghijklmnopqrstuvwxyz".chars();
		OptionalInt alpha = alphabets.filter(c -> s1.indexOf(c) != -1 && s2.indexOf(c) != -1).findFirst();
		return alpha.isPresent() ? "YES" : "NO";

	}

	public static void main(String[] args) {

		String s1 = "hello", s2 = "world";
		System.out.println(twoStrings(s1, s2));
	}

}
