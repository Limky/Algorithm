package Programmers.level04;

import java.util.ArrayList;
import java.util.Arrays;

public class BestSet {

	public static void main(String[] args) {
		BestSet c = new BestSet();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(Arrays.toString(c.bestSet(33, 13)));
	}

	public int[] bestSet(int n, int s) {
		int[] answer = new int[n];
		
		if(s<n)return new int[]{-1};
		
		for(int i=0; i<n; i++){
			answer[i] = s/n;
		}
		int g = s-((s/n)*n);
		if(g == 0){
			return answer;		
		}
		
		for(int i=0; i<g; i++){
			answer[i] += 1;
		}
		
		Arrays.sort(answer);
		
		return answer;
	}

}
