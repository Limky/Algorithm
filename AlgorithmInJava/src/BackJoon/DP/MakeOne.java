package BackJoon.DP;

import java.util.Arrays;
import java.util.Scanner;

public class MakeOne {

	static int dp[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        int n;
	        n = sc.nextInt();
	        dp = new int[n+1];

	        System.out.println(Arrays.toString(dp));
		System.out.println(bottom_up(n));
	     System.out.println(Arrays.toString(dp));
	}

	private static int top_down(int n) {
		if(n==1) return 0;
		if(dp[n] > 0) return dp[n];
		
		dp[n] = top_down(n-1)+1;
		if(n%2 == 0){
			int temp = top_down(n/2) + 1;
			if(dp[n] > temp) dp[n] = temp;
		}
		if(n%3 == 0){
			int temp = top_down(n/3) + 1;
			if(dp[n] > temp) dp[n] = temp;
		}
		return dp[n];
	}
	
	private static int bottom_up(int n){
		dp[1] = 0;
		for(int i=2; i<=n; i++){
			dp[i] = dp[i-1] + 1;
			if(i%2 == 0 && dp[i] > dp[i/2] + 1){
				dp[i] = dp[i/2] + 1;
			}
			
			if(i%3 == 0 && dp[i] > dp[i/3] + 1){
				dp[i] = dp[i/3] + 1;
			}
		}
		return dp[n];
		
	}

}
