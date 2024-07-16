package com.sortingAlg;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int [] a = {5,3,2,6,4,1};
		System.out.println("Original Array: "+Arrays.toString(a));
		bubbleSort(a);
		System.out.println("Sorted Array: "+Arrays.toString(a));
	}

	private static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				if(a[i]>a[j]) {
					int temp = a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				System.out.println(i+","+j+" : "+Arrays.toString(a));
			}
		}
	}

}
