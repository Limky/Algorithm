package Woo;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String result = "";
		for(int i=1; i<=n; i++){
			if(n%i==0){
				result+=i+" ";
			}
			
		}
		System.out.println(result);

	}
	
	

}
