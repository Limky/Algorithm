package Woo;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		String num = sc.next();

		int decimal = Integer.parseInt(num);
		String decimalToHex = Integer.toHexString(decimal);
		System.out.println(decimalToHex);


	}
	
	

}
