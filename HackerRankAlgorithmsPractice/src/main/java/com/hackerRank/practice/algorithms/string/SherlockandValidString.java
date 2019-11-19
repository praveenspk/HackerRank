package com.hackerRank.practice.algorithms.string;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SherlockandValidString {

	static String isValid(String s) {

		if (s == null || s.length() <= 2)
			return "YES";
		HashMap<Character, Integer> countMap = new HashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			countMap.put(c, countMap.getOrDefault(c, 0) + 1);
		}

		// Now, use a second hashmap:
		// Number of times a letter appears -> Number of different letters for which it
		// appears.
		// For the string to be valid, there should be at most 2 keys,
		// and the smallest key is either 1 or the max key - 1,
		// and the value for the smallest key must be 1.
		HashMap<Integer, Integer> freqToDiffLetters = new HashMap<Integer, Integer>();
		Iterator<Character> iter = countMap.keySet().iterator();

		while (iter.hasNext()) {
			int freq = countMap.get(iter.next()); // Get the frequency.
			freqToDiffLetters.put(freq, freqToDiffLetters.getOrDefault(freq, 0) + 1);
		}

		// Finally, analyze this HashMap.
		if (freqToDiffLetters.keySet().size() > 2)
			return "NO";
		if (freqToDiffLetters.keySet().size() == 1)
			return "YES";

		Iterator<Integer> iter2 = freqToDiffLetters.keySet().iterator();
		iter2 = freqToDiffLetters.keySet().iterator();
		int freq1 = iter2.next();
		int freq2 = iter2.next();

		if (freq1 > freq2) {
			int temp = freq1;
			freq1 = freq2;
			freq2 = temp;
		}

		if (freq1 == 1) {
			return (freqToDiffLetters.get(freq1) == 1 ? "YES" : "NO");
		}
		if (freq2 == freq1 + 1) {
			return (freqToDiffLetters.get(freq2) == 1) ? "YES" : "NO";
		}
		return "NO";

	}

	public static boolean sherlockStr(String s) {
		Map<Long, Long> counts = s.chars().mapToObj(t -> (char) t)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.map(Map.Entry::getValue).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		switch (counts.size()) {
		case 1:
			return true;
		case 2:
			Iterator<Long> it = counts.keySet().iterator();
			return (Math.abs(it.next() - it.next()) == 1 && (counts.values().stream().anyMatch(i -> i == 1)));
		default:
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isValid("aabbcd"));
		System.out.println(sherlockStr("aabbcd") ? "YES" : "NO");
	}

}
