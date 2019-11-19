package com.spk.practice.arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayOperations {

	public static void getLeftRotationArray(Object data) {

		System.out.println(data instanceof Arrays);

		if (data == null) {
			return;
		}

		if (data instanceof List) {
			List<?> data1 = (List) data;
			System.out.println(data1);
		} else if (data instanceof Arrays) {

			System.out.println(data);

		}
	}

	public static void main(String[] args) {
		int arr[] = { 45, 89, 125, 15 };
		getLeftRotationArray(arr);

		List list = new LinkedList(Arrays.asList(arr));
		getLeftRotationArray(list);
		
		System.out.println();

	}

}
