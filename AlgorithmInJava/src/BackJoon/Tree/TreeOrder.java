package BackJoon.Tree;

import java.util.Scanner;

public class TreeOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sc.nextLine();// 엔터 제거
		
		//알파벳 총 26개,자식 노드 2개
		int[][] a = new int[26][2];
		for(int i=0; i<n; i++){
			String line = sc.nextLine();
			//문자형에 문자형을 연산하면 결과가 각 문자형의 int값들의 연산과 같다.
			//'A'를 빼주는 이유 0~25까지 26개의 index로 대문자 알파벳을 강제 매칭 시키려고
			int x = line.charAt(0) - 'A'; //부모 알파벳 index값
			char y = line.charAt(2);
			char z = line.charAt(4);
			// '.'인 경우 자식이 없다는 것임. 
			// 자식이 없는 경우 -1 저장.
			if (y == '.') {
                a[x][0] = -1;
            } else {
                a[x][0] = y-'A';
            }
            if (z == '.') {
                a[x][1] = -1;
            } else {
                a[x][1] = z-'A';
            }
		}
		
		
		preorder(a,0); //2번째 인자는 시작할 루트
		System.out.println();
		inorder(a,0);
		System.out.println();
		postorder(a,0);
		System.out.println();
	}


	private static void preorder(int[][] a, int x) {
		if(x == -1)return;
		System.out.print((char)(x+'A'));
		preorder(a, a[x][0]); // Left
		preorder(a, a[x][1]); // Right
	
	}

	private static void inorder(int[][] a, int x) {
		if(x == -1)return;
		inorder(a, a[x][0]); // Left
		System.out.print((char)(x+'A'));
		inorder(a, a[x][1]); // Right
		
	}
	
	private static void postorder(int[][] a, int x) {
		if(x == -1)return;
		postorder(a, a[x][0]); // Left
		postorder(a, a[x][1]); // Right
		System.out.print((char)(x+'A'));
		
	}


}
