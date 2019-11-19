package com.spk.practice.arrays;

import java.util.Arrays;

public class RotateArrayElementToLeft {

	// Complete the rotLeft function below.
	static int[] rotLeft(int[] a, int d) {

		System.out.println("Unmodified Array : " + Arrays.toString(a));
		int temp;

		for (int i = 0; i < d; i++) {
			temp = a[0];

			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}

			a[a.length - 1] = temp;
		}
		System.out.println("Modified Array : " + Arrays.toString(a));

		return a;

	}

	public static int[] rotateRight(int[] array, int d) {
		System.out.println("Unmodified Array : " + Arrays.toString(array));
		int temp;

		for (int i = 0; i < d; i++) {
			temp = array[array.length - 1];

			for (int j = array.length - 1; j > 0; j--) {
				array[j] = array[j - 1];
			}

			array[0] = temp;
		}
		System.out.println("Modified arrayrray : " + Arrays.toString(array));

		return array;

	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int d = 4;
		rotLeft(arr, d);
		rotateRight(arr, d);

	}

}
