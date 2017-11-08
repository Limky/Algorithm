package BackJoon.DP;

import java.util.Arrays;
import java.util.Scanner;

public class ContinuousSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] dp = new int[n+1];
		int[] arr = new int[n+1];

		for (int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}

		dp[1] = arr[1];
		int max = dp[1];
		for (int i = 2; i <= n; i++) {
			//���� �����հ� �ڽ��� ���� ���� ���� �ڱ� �ڽ��� �������� �ʰ� ���Ӱ� �����ϴ� ���� �ڽ��� �� �� ũ�⿡ ����
			//�б� ó��
			if (dp[i-1] + arr[i] > arr[i]) {
				//�����ϴ� ���
				dp[i] = dp[i-1] + arr[i];
			} else {
				//���Ӱ� ���� �����ϴ� ���
				dp[i] = arr[i];
			}

			max = Math.max(max, dp[i]);
		}
		System.out.println(Arrays.toString(dp));
		System.out.println(max);

	}

}
