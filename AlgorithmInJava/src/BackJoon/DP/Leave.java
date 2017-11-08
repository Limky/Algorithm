package BackJoon.DP;

import java.util.Scanner;


public class Leave {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] day = new int[n+1];
		int[] pay = new int[n+1];
		
		int[] dp = new int[n+1];
		
		for (int i = 1; i <= n; i++) {
			day[i] = sc.nextInt();
			pay[i] = sc.nextInt();

			dp[i] = pay[i];
		}

		//2일 부터 다음 DP가 적용됨.
		for(int i=2; i<=n; i++){
			for(int j=1; j<i; j++){
				
				if(day[j]+j <= i){
					dp[i] = Math.max(dp[j]+pay[i], dp[i]);
				}		
			}
			
		}
//		
//		for(int i: dp){
//			System.out.println(i);
//		}
		
		int max = 0;
		for (int i = 1; i <= n; i++) {
			if (i + day[i] <= n + 1) {
				if (max < dp[i]) {
					max = dp[i];
				}
			}
		}
		System.out.println(max);
		
		

	}

}
