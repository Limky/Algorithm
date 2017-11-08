package BackJoon.DP;

import java.util.Scanner;

public class PinaryNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long dp[] = new long[n+1];
		
		dp[1] = 1;
		if(n>=2) dp[2] = 1;
		
		for(int i=3; i<=n; i++){
			//n�ڸ��� 0�ϰ��
			//n�ڸ��� 1�ϰ��
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		System.out.println(dp[n]);
	}

}
