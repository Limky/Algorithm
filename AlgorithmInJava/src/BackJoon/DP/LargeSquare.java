package BackJoon.DP;

import java.util.Scanner;

public class LargeSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int a[][] = new int[w+1][h+1];
		int dp[][] = new int[w+1][h+1];
		
		sc.nextLine(); //엔터 제거
		
		for(int i=1; i<=w; i++){
			String str = sc.next();
			for(int j=1; j<=h; j++){
				a[i][j] = Integer.parseInt(str.charAt(j-1)+"");
			}
		}
		
		int ans = 0;
		for(int i=1; i<=w; i++){
			for(int j=1; j<=h; j++){
				if(a[i][j]==1){
					int min = Math.min(dp[i-1][j-1], Math.min(dp[i-1][j], dp[i][j-1]));
					dp[i][j]=min+1;
					ans = Math.max(dp[i][j],ans);
				}
			}
		}
		System.out.println(ans*ans);
		

	}





}
