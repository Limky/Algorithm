package Programmers_Level02;

public class NumOfPrime {

	public static void main(String[] args) {
		NumOfPrime prime = new NumOfPrime();
		System.out.println(prime.numberOfPrime(5));

	}

	int numberOfPrime(int n) {
		int result = 0;
		// 함수를 완성하세요.

		for (int j = 1; j <= n; j++){
			int num = 0;
			for (int i = 1; i <= j; i++) {

				if (j % i == 0) {
						num++;
				}

			}
			if(num == 2)result++;
		}
		
		return result;
	}
}
