package SamsungTest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PutOperator {

	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String [] nums = new String[n];
		for(int i=0; i<n; i++){
			nums[i] = sc.next();
		}
		// +, -, *, / 
		String[] operatorNum = new String[4];
		for(int i=0; i<4; i++){
			operatorNum[i] = sc.next();
		}
		System.out.println(Arrays.toString(nums));
		System.out.println(Arrays.toString(operatorNum));
		
		makeOperatorArray(operatorNum);
		
	}

	static String[] operators = {"+","-","*","/"};
	static ArrayList<String> combination = new ArrayList<>();
	static int data[] = null;
	private static void makeOperatorArray(String[] operatorNum) {
		
		ArrayList<String> tmp = new ArrayList<>();
		for(int i=0; i<4; i++){
			int n = Integer.parseInt(operatorNum[i]);
			for(int j=0; j<n;j++){
				tmp.add(operators[i]);	
			}
		}
		//System.out.println(tmp.toString());
		data = new int[tmp.size()];
		for(int i=0; i<tmp.size(); i++){
			data[i] = i+1;
		}
		Permutation(tmp.size(),tmp.size());
		
	}
	
	
	static void Permutation(int TotalN,int N)
	{
	    int i;

	    if( N==1 ) {
	        for(i=0;i<TotalN;i++){
	        	System.out.print(data[i]+" ");
	        }
	      System.out.println();
	    }

	    for(i=0;i<N;i++){
	        swap(i,N-1);
	        Permutation(TotalN,N-1);
	        swap(i,N-1);
	    }
	}
	
	static int swap(int i,int j)
	{
	    int temp;
	    if(i==j) return 0;
	    temp = data[i];
	    data[i]=data[j];
	    data[j]=temp;
	    return 0;
	}


}
