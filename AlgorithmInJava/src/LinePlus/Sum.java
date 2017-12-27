package LinePlus;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		int[] data = new int[N];
		for (int i = 0; i < N; i++) {
			data[i] = scanner.nextInt();
		}
		System.out.println(solve(data));
	}

	private static int solve(int[] data) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i=0; i<data.length; i++){
			sum += data[i];
		}
		
		return sum;
	}

}
