package Woo.PreTest_One;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		try(Scanner s = new Scanner(System.in))
		{
			int n = s.nextInt();
			int d = s.nextInt();
			int k = s.nextInt();
			int j = s.nextInt();
			
			//여기부터 작성해 주세요
			int a[] = new int[n];
			for(int i=0; i<n; i++){
				a[i] = i+1;
			}
			
			move(a,d,k,j);		
		}

	}

	private static void move(int[] a, int d, int k, int j) {
		int currentIndex = 0;
		int count = 0;
		while(check(a)){
			if(d==1){
				//시계방향
				count = k;
				while(count != 0){
					currentIndex = currentIndex+1;
					if(currentIndex == a.length)currentIndex = 0;
					
					if(a[currentIndex]==-1){
				//		System.out.println("이미 탈락자 " +a[currentIndex]+ " "+count);
					}else{
					count--;			
				//	System.out.println("현재 " +a[currentIndex]+ " "+count);
					}
				}
			
			//	System.out.println("최종 탈락자 " +a[currentIndex]);
				a[currentIndex] = -1;
				k+=j;//증가
		
			}else{
				//반시계방향
				count = k;
				while(count != 0){
					currentIndex = currentIndex-1;
			//		System.out.println(currentIndex);
					if(currentIndex == -1)currentIndex = a.length-1;
					
					if(a[currentIndex]==-1){
			//			System.out.println("이미 탈락자 " +a[currentIndex]+ " "+count);
					}else{
					count--;			
			//		System.out.println("현재 " +a[currentIndex]+ " "+count);
					}
				}
			
			//	System.out.println("최종 탈락자 " +a[currentIndex]);
				a[currentIndex] = -1;
				k+=j;//증가
		
			}
	
		}
		for(int i=0; i<a.length; i++){
			if(a[i]!=-1) System.out.println(a[i]);
		}
		
		
	}

	private static boolean check(int[] a) {
		
		int cnt = 0;
		for(int i=0; i<a.length; i++){
			if(a[i]==-1) cnt++;
			if(cnt == a.length-1)return false;
		}

		return true;

	}
	
	

}
