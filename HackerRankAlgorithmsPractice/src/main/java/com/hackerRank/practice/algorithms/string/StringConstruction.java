package com.hackerRank.practice.algorithms.string;

import java.util.HashSet;
import java.util.Set;

public class StringConstruction {

	static int stringConstruction(String s) {

		return (int) s.chars().distinct().count();

	}

	static int string_Construction(String s) {

		Set<Character> aiseHi = new HashSet<>();
		char[] c = s.toCharArray();
		for (char ch : c) {
			aiseHi.add(ch);
		}
		System.out.println(aiseHi.size());
		return aiseHi.size();

	}

	public static void main(String[] args) {

		System.out.println(stringConstruction("abcd"));
		
		string_Construction("abcd");
		
	}

}
