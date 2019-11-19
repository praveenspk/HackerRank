package com.hackerRank.practice.algorithms.string;

public class MarsExploration {

	static int marsExploration(String message) {
		String sos = "SOS";
		int count = 0;
		for (int i = 0; i < message.length(); i++) {
			if (message.charAt(i) != sos.charAt(i % 3)) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int result = marsExploration("SOSSPSSQSSOR");
		System.out.println(result);
	}
}
