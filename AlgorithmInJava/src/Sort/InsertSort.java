package Sort;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		int[] array = {5,3,4,7,6,2,1};
		System.out.println("Before   : "+Arrays.toString(array)+"\n");
		insertSort(array);
		


	}

	private static void insertSort(int[] array) {
		int temp = 0;
		int j = 0;
		
		for(int i=1; i<array.length; i++){
			temp = array[i]; // 삽입대상 임시 저장.
			j = i; //index 임시저장
			while(j > 0 && temp < array[j-1]){ //삽입대상이 정렬된 대상들보다 작은 경우가 있는 경우 
				array[j] = array[j-1]; //밀기
				j--; //다음 비교를 위해 인덱스 이동
			}
			array[j] = temp; //최종으로 삽입될 위치에 삽입대상 삽입
			System.out.println((i)+"회전 select sort result : " + Arrays.toString(array));	
			
		}
	}

	
}
