package com.spk.hackerRank;

import java.util.Scanner;

public class NewYearChaos {

	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {
		int swapCount = 0;

		for (int i = q.length - 1; i >= 0; i--) {
			if (q[i] != i + 1) {
				if (q[i - 1] == (i + 1)) {
					swapCount++;
					swap(q, i, i - 1);

				} else if (q[i - 2] == (i + 1)) {
					swapCount += 2;
					swap(q, i - 2, i - 1);
					swap(q, i - 1, i);
				} else {
					System.out.println("Too Chaotic ");
					return;
				}
			}
		}
		System.out.println(swapCount);

	}

	private static void swap(int[] q, int i, int j) {
		int temp = q[i];
		q[i] = q[j];
		q[j] = temp;

	}

	public static void main(String[] args) {

		int[] q = { 2, 1, 5, 3, 4 };
		int[] arr = { 2, 5, 1, 3, 4 };
		minimumBribes(q);
		minimumBribes(arr);

	}

}
