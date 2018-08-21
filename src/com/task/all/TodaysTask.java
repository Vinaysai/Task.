package com.task.all;

import java.util.Arrays;
import java.util.Scanner;

public class TodaysTask {

	// This method can sort any individual array.
	public void cansortanyarray(int a[]) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] < a[j]) {

					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}

		}
		System.out.println("Sorted array is:" + Arrays.toString(a));
	}

	// taking two arrays and merging them into third.
	public void sample() {

		int n, m;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the no. of elements you want in array a:");
		n = s.nextInt();
		System.out.print("Enter the no. of elements you want in array b:");
		m = s.nextInt();
		int a[] = new int[n];
		int b[] = new int[m];
		int ab[] = new int[n + m];

		System.out.println("Enter all the elements a and b:");

		for (int i = 0; i < n & i < m; i++) {
			a[i] = s.nextInt();

			b[i] = s.nextInt();

		}

		int l = 0, k = 0;

		for (int i = 0; i < ab.length; i++) {

			if (i % 2 == 0)
				ab[i] = a[l++];
			else
				ab[i] = b[k++];

		}

		System.out.println("First array is:" + Arrays.toString(a) + "\nSecond array is:" + Arrays.toString(b)
				+ "\nab array is:" + Arrays.toString(ab));

		// Sorting array ab.
		new TodaysTask().cansortanyarray(ab);
		s.close();
	}

	public static void main(String[] args) {

		new TodaysTask().sample();
	}
}