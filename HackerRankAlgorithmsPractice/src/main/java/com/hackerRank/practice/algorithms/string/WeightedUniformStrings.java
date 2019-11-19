package com.hackerRank.practice.algorithms.string;

public class WeightedUniformStrings {

	// Complete the weightedUniformStrings function below.
	static String[] weightedUniformStrings(String s, int[] queries) {

		s = s + "\0";
		int[] char_num = new int[27];
		int local_len = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(i - 1)) {
				char_num[s.charAt(i - 1) - 'a' + 1] = Math.max(char_num[s.charAt(i - 1) - 'a' + 1], local_len);
				local_len = 1;
			} else
				local_len++;
		}

		String[] ans = new String[queries.length];

		for (int i = 0; i < queries.length; i++) {
			boolean flag = false;
			int j = 1;
			while (j < char_num.length) {
				if (char_num[j] > 0 && queries[i] % j == 0 && queries[i] / j <= char_num[j]) {
					ans[i] = "Yes";
					flag = true;
					break;
				}
				j++;
			}
			if (!flag)
				ans[i] = "No";
		}

		return ans;

	}

	public static void main(String[] args) {

		int[] queries = { 6, 1, 3, 1, 5, 9, 10 };

		String[] str = weightedUniformStrings("abccddde", queries);
		System.out.println("" + str);

	}

}
