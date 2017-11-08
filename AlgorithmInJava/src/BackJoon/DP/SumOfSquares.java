package BackJoon.DP;

import java.util.Scanner;

public class SumOfSquares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dp = new int[n+1];
		
		for(int i=1; i<=n; i++){
			dp[i] = i;//최악의 경우로 초기화
			for(int j=1; j*j<=i; j++){
				System.out.println(dp[i]+" "+dp[i-j*j]);
				if(dp[i] > dp[i-j*j]+1){
					dp[i] = dp[i-j*j]+1;
				}
			}
		
		}
		
		System.out.println(dp[n]);
		
	}

}
