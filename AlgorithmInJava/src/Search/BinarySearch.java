package Search;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int []array = new int[n];
		for(int i=0; i<n; i++){
			array[i] = sc.nextInt();
		}
		
		int value = sc.nextInt();
		
		System.out.println(binarySearch(array, value)+1+" 번째 있음");

	}

	private static int binarySearch(int[] array, int value) {
		int mid = array.length/2;
		
		while(true){
		//	System.out.println(mid);
			if(array[mid] == value){
				return mid;
			}else{
				if(array[mid] < value){
					mid = (mid + array.length)/2;
				}else{
					mid = mid/2;
				}
			}
			
		}
	
	}
	
	//재귀로 구현

}
