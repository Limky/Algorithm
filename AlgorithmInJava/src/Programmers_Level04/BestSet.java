package Programmers_Level04;

import java.util.ArrayList;
import java.util.Arrays;

public class BestSet {

	public static void main(String[] args) {
		BestSet c = new BestSet();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(Arrays.toString(c.bestSet(4, 13)));
	}

	public int[] bestSet(int n, int s) {
		int[] answer = null;
		ArrayList<Integer>[] arrayList = new ArrayList[2];
		arrayList[0] = new ArrayList<>();
		arrayList[1] = new ArrayList<>();

		arrayList[0].add(0);

		int sum = s;
		int size = s - n + 1;

		for (int i = 1; i <= size; i++) {

			sum = sum-i;
			arrayList[1].add(i);// 첫번재 요소
			int x = 1;
		
			for (int j = 0; j < n-1; j++) {

				if(j == n-2){
				
				
					
				}else{
					
					
				
				}

			}
		
		}
		
		for(int i=0; i<arrayList[1].size();i++){
			System.out.print(arrayList[1].get(i)+" ");
		}
		
		
		

		return answer;
	}

}
