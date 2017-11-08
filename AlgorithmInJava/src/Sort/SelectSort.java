package Sort;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,3,4,7,6,2,1};
		System.out.println("Before   : "+Arrays.toString(array)+"\n");
		selectSort(array);

	}
	
	//시간복잡도 n-1,n-2,n-3...1 -> O(n^2)
	//공간복잡도 하나의 배열에서만 진행 O(n)
	private static void selectSort(int[] array) {
		int temp = 0;
		int index = 0;
		for(int i=0; i<array.length; i++){
			index = i;
			for(int j=i+1; j<array.length; j++){
				if(array[index] > array[j]){
					index = j;
				}
			}
			 temp = array[i];
			 array[i] = array[index];
			 array[index] = temp;
			
			 System.out.println((i+1)+"번째 select sort result : " + Arrays.toString(array));	
		}
	
	}
		
		
	}


	

