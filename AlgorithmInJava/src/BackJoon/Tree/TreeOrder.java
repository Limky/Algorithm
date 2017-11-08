package BackJoon.Tree;

import java.util.Scanner;

public class TreeOrder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sc.nextLine();// ���� ����
		
		//���ĺ� �� 26��,�ڽ� ��� 2��
		int[][] a = new int[26][2];
		for(int i=0; i<n; i++){
			String line = sc.nextLine();
			//�������� �������� �����ϸ� ����� �� �������� int������ ����� ����.
			//'A'�� ���ִ� ���� 0~25���� 26���� index�� �빮�� ���ĺ��� ���� ��Ī ��Ű����
			int x = line.charAt(0) - 'A'; //�θ� ���ĺ� index��
			char y = line.charAt(2);
			char z = line.charAt(4);
			// '.'�� ��� �ڽ��� ���ٴ� ����. 
			// �ڽ��� ���� ��� -1 ����.
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
		
		
		preorder(a,0); //2��° ���ڴ� ������ ��Ʈ
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
