package com.greatlearn.gradeddsa;

import java.util.*;

public class skyscrapper {

	public static void main(String[] args) {
		System.out.println("enter the total no of floors in the building :");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int arr[] = new int[n];
		int k = 0;
		int current_floor = n;

		for (int i = 1; i <= n; i++) {
			System.out.println("\n\n\nenter the floor size given on day :  " + i);

			int floor = scan.nextInt();
			if (floor < current_floor) {
				arr[k++] = floor;
			}

			else if (floor == current_floor) {
				System.out.println("\n\nThe order of construction is as follows");
				System.out.println("Day : " + i + "\n" + current_floor);
				int j;
				for (j = current_floor - 1; j >= 0; j--) {
					int flag = 1;
					for (int m = 0; m < k; m++) {
						if (arr[m] == j) {
							System.out.println(j);
							flag = 0;
							break;
						}
					}
					if (flag == 1)
						break;
				}

				current_floor = j;

			}

		}
		scan.close();
	}

}