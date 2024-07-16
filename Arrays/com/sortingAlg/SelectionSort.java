package com.sortingAlg;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		int [] a = {3,6,2,7,4,5,9,1,8};
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}

	private static void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min=i;
			for (int j = i; j < a.length; j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}
			int temp = a[min];
			a[min]=a[i];
			a[i]=temp;
			System.out.println(i+","+min+" : "+Arrays.toString(a));
		}
	}
}
