package SamsungTest;

import java.util.Arrays;
import java.util.Scanner;

public class Laboratory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner sc = new Scanner(System.in);
		int n, m;
		n = sc.nextInt();
		m = sc.nextInt();

		
		Integer[][] arrays = new Integer[n][m];

		for(int i = 0; i < n ; i++){
			for(int j= 0; j < m; j++){
				arrays[i][j] = sc.nextInt();
			}
		}
			    
			    solution(arrays,n,m);
			    
			    

			    for (int i = 0; i < arrays.length; i++) {
		            for (int j = 0; j < arrays[i].length; j++) {
		                System.out.print(arrays[i][j] + " "); // 열 출력
		            }
		            System.out.println(); // 행 출력
		        }
		

				
		
		
	}

	private static void solution(Integer[][] table, int n, int m) {


		
	}


}
