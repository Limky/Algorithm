package LinePlus;

import java.util.Scanner;

public class Max {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		int[] data = new int[N];
		for (int i = 0; i < N; i++) {
			data[i] = scanner.nextInt();
		}
		System.out.println(solve(data));
	}

	private static int solve(int[] data) {
		
		int temp = data[0];
		for(int i=0; i<data.length; i++){
			if(temp < data[i]){
				temp = data[i];
			}
		}
		
		return temp;
	}

}
