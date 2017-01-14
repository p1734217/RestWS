package serialization;

import java.util.Arrays;

public class Mergesort {

	public static void main(String[] args) {

		
		int[] arr1 = { 3, 4, 12, 324, 6, 8, 1 };
		int[] arr2 = { 32, 31, 2 };

		int p = arr1.length + arr2.length;
		
		int[] arr3 = new int[p];

		int i = 0, j = 0, k = 0;

		while (i < arr1.length && k < arr2.length) {
			
			if (arr1[i] < arr2[k])
				arr3[j++] = arr1[i++];
			else
				arr3[j++] = arr2[k++];
		}

		while (i <arr1.length)
			arr3[j++] = arr1[i++];
		
		while (k <arr2.length)
			arr3[j++] = arr2[k++];

		System.out.println("Sorted array is");
		//FIXME
		for (i = 0; i < p - 1; i++) {
			System.out.print(arr3[i]+", ");
		}
	}

}
