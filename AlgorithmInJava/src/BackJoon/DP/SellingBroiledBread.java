package BackJoon.DP;

import java.util.Arrays;
import java.util.Scanner;

public class SellingBroiledBread {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //�Ǹ��� �ؾ�� ����
		
		int d[] = new int[n+1]; 
		int p[] = new int[n+1]; 
		
		for(int i=1; i<=n;i++) p[i] = sc.nextInt(); //������ �ؾ ����

		d[0] = 0;
		for(int i=1; i <= n; i++){
			for(int j=1; j<=i; j++){
				d[i] = Math.max(d[i],p[j]+d[i-j]);
			}
		}
		System.out.println(d[n]);
		
		
	}

}
