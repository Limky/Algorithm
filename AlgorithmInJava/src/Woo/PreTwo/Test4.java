package Woo.PreTwo;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { -1, 1, 3, 3, 3, 2, 1, 0 };
		solution(A);
	}

	public static int solution(int[] A) {

		int ans = 0;
		int dp[] = new int[A.length-1];
		for (int i = 0; i < A.length; i++) {
			if(-1 < i+1 && i+1 < A.length)
			dp[i] = Math.abs(A[i]-A[i+1]);
		
		} 
		
		//System.out.println(Arrays.toString(dp));
		for(int i=0; i<dp.length;i++){
			boolean flag = true;
			int n=1;
			int index = i;
			while(flag){
			
				if(-1 < index+1 && index+1 < dp.length){
				if(dp[index]==dp[++index]){
					n++;
				}else{
					flag=false;
				}
				}else{
					flag=false;
				}
				
				
			}
			if(n != 1)
			//System.out.println("d "+n);
			ans+=n-1;
		}

		
		//System.out.println(ans);
		return ans;
	}

}
