package Woo.PreTwo;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		solution(1,"");
		
	}
	
	
	public static int solution(int N, String S) {
		
		String[] reserved = S.split(" ");
		int[][] seats = new int[N][10];
		//예약먼저 시키기
		if(reserved.length > 1)
		for(int i=0; i<reserved.length; i++){
			int n = Integer.parseInt(reserved[i].charAt(0)+"");
			char rowstr = reserved[i].charAt(1);
			int row = rowstr-'A';
			if(row=='J') row = 8;
			if(row=='k') row = 9;

			seats[n-1][row] = 1;
		}
		//3사람 앉히기
		int ans = 0;
		for(int i=0; i<seats.length;i++){
			for(int j=0; j<seats[0].length; j++){
				if(j==0 || j==3 || j==4 || j==7){
					try {
						
				int temp = 0;
				if(seats[i][j]==0){	
					temp++;
				}
				if(seats[i][j+1]==0){
					temp++;
				}
				if(seats[i][j+2]==0){
					temp++;
				}
				
				if(temp==3) {
					seats[i][j]=1;
					seats[i][j+1]=1;
					seats[i][j+2]=1;
					ans++;
				}
				
					} catch (Exception e) {
						// TODO: handle exception
					}
				}
		//		printArray(seats);
		//		System.out.println();
			}
		}
		//System.out.println(ans);
		
		
		
		return ans;
    }
	
	private static void printArray(int[][] a) {
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[0].length; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
