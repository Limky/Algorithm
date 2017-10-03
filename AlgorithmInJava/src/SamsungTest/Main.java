package SamsungTest;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
				Scanner sc = new Scanner(System.in);
				int a, b;
				a = sc.nextInt();
				b = sc.nextInt();
		
				
				Integer[][] arrays = new Integer[a][b];

				for(int i = 0; i < a ; i++){
					for(int j= 0; j < b; j++){
						arrays[i][j] = sc.nextInt();
					}
				}
	
				for(int i = 0; i < a ; i++){
					for(int j= 0; j < b; j++){
						System.out.println(arrays[i][j]);
					}
				}
				
			
	

	}

}
