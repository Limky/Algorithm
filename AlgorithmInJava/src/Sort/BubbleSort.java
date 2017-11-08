package Sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int[] array = {5, 3, 4, 1};

		System.out.println("Before   : " + Arrays.toString(array) + "\n");
		bubbleSort(array);

	}

	private static void bubbleSort(int[] array) {
		int temp = 0;
		int size = array.length - 1;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size-i ; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}
			}
			System.out.println((i + 1) + "È¸Àü bubble sort result : " + Arrays.toString(array));
		}

	}

}
