package com.sortingAlg;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int [] a = {1,5,3,6,4,9,8,7,2};
		insertionSort(a);
		System.out.println(Arrays.toString(a));
	}

	private static void insertionSort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int temp = a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}

}
