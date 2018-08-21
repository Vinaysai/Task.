package com.task.all;

import java.util.Arrays;
import java.util.Scanner;

public class TodaysTask {

	// This is a merge method.Which will sort and add two arrays into third.
	public static void mergeArrays(int[] a, int[] b, int n, int m, int[] arr3) {
		int i = 0, j = 0, k = 0;

		// Traverse both array
		while (i < n && j < m) {

			// To check which array is greater.
			if (a[i] < b[j])
				// Store elements accordingly.
				arr3[k++] = a[i++];
			else
				// Store elements accordingly.
				arr3[k++] = b[j++];
		}

		// Store remaining elements of first array
		while (i < n)
			arr3[k++] = a[i++];

		// Store remaining elements of second array
		while (j < m)
			arr3[k++] = b[j++];
	}

	public static void main(String[] args) {
		int n, m, temp;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no. of elements you want in array a:");
		n = s.nextInt();
		System.out.print("Enter the no. of elements you want in array b:");
		m = s.nextInt();
		int a[] = new int[n];
		int b[] = new int[m];
		System.out.println("Enter all the elements a:");
		for (int i = 0; i < n; i++) {
			a[i] = s.nextInt();
		}

		System.out.println("Enter all the elements b:");
		for (int i = 0; i < m; i++) {
			b[i] = s.nextInt();

		}
		System.out.println(
				"Your first array before sorting is:::" + Arrays.toString(a) + "\nSecond array" + Arrays.toString(b));

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = i + 1; j < m; j++) {
				if (b[i] > b[j]) {
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}

			}
		}
		System.out.print("\nfirst element in After Sorting::");
		for (int i = 0; i < n - 1; i++) {
			System.out.print(a[i] + ",");
			
		}
		System.out.print(a[n - 1]);
		System.out.print("\nSecond Element After Sorting::");
		for (int i = 0; i < m - 1; i++) {
			System.out.print(b[i] + ",");

		}

		System.out.print(b[m - 1]);

		System.out.println("\n_______________________");

		int length = a.length + b.length;
		int merge[] = new int[length];

		mergeArrays(a, b, n, m, merge);

		System.out.println("\nArray after merging");
		for (int i = 0; i < n + m; i++)

			System.out.print(merge[i] + " ");

		s.close();
	}

}
