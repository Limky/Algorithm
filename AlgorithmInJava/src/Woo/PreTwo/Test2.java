package Woo.PreTwo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Test2 {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		solution(str);
		String[] strArray = str.split(" ");

//		int ans = -1;
//		for(int i=0; i<strArray.length; i++){
//			ans = solution(strArray[i]);
//		}
	
		//System.out.println(ans);
		// System.out.println(Arrays.toString(strArray));
	}

	public static int solution(String S) {
		Stack<Integer> stack = new Stack<>();
		String[] strArray = S.split(" ");

		for(int i=0; i<strArray.length; i++){
			String str = strArray[i];
		try {

			switch (str) {
			case "DUP":
				int temp = stack.peek();
				stack.push(temp);
				break;
			case "POP":
				stack.pop();
			
				break;
			case "+":
				int a1 = stack.pop();
				int b1 = stack.pop();
				stack.push(a1+b1);
				break;
			case "-":
				int a2 = stack.pop();
				if(a2 <0) return -1;
				int b2 = stack.pop();
				stack.push(a2-b2);
				break;
			default:
				stack.push(Integer.parseInt(str));
				break;
			}

		} catch (Exception e) {
			//System.out.println(-1);
			return -1;
		}

		//return stack.peek();
		
		}
		
		//System.out.println(stack.peek());
		return stack.peek();
		

	}

}
