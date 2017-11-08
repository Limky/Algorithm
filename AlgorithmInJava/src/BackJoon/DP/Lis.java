package BackJoon.DP;

import java.util.Arrays;
import java.util.Scanner;

public class Lis {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	int n =  sc.nextInt();
    	
    	int[] dp = new int[n+1];
    	int[] arr = new int[n+1];
    	
    	for(int i=1; i<=n; i++){
    		arr[i] = sc.nextInt();
    	}
    	
  		int max = 1;
    	for(int i=1; i<=n; i++){
    		dp[i] = 1; 
    		for(int j=1; j<i; j++){
    			if(arr[i] > arr[j] && dp[i] <= dp[j]) {
					dp[i] = dp[j] + 1;
					if(max < dp[i]) max = dp[i];
				}
    		}
    		
    	}
    	
    	System.out.println(max);
    }
    
    
    

   
}

