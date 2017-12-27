package Programmers.level05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LineCombination {

	public static void main(String[] args) {
		LineCombination lc = new LineCombination();
		System.out.println(Arrays.toString(lc.setAlign(4, 5)));
	}
	
	  public int[] setAlign(int n, long k) {
	        int[] answer = new int[n];

	        List<Integer> arr = new ArrayList<>();
	        for(int i = 0; i < n; i++){
	            arr.add(i + 1);
	        }

	        int num = n;
	        long remain;
	        int share;

	        List<Integer> result = new ArrayList<>();
	        while(num > 0) {
	            --num;
	            remain = k % fac(num);
	            share = (int)(k / fac(num));
	            
              //  System.out.println("share : " + share);
	          //  System.out.println("remain : " + remain);
	         //   System.out.println(arr.toString());
	            
	            if (remain == 0) {
	                share--;
	                result.add(arr.get(share));
	                arr.remove(share);
	                break;
	            }
	            
	            result.add(arr.get(share));
	            arr.remove( share);

	            k = remain;
	        }

	        for(int i = arr.size()-1; i >= 0; i--){
	            result.add(arr.get(i));
	            arr.remove(i);
	        }

	        for(int i = 0; i < result.size(); i++){
	            answer[i] = result.get(i);
	        }
	        return answer;
	    }
	    public static int fac(long num){
	        int result = 1;

	        for(long i = num; i > 0; i--){
	            result *= i;
	        }
	        return result;
	    }

}
