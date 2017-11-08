package GraphSearching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {

	static ArrayList<Integer>[] graph;
	static boolean[] check;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt(); //������ ��
		int m = sc.nextInt(); //������ ��
		int start = sc.nextInt(); //Ž���� ������ ����
		
		graph = new ArrayList[n+1]; //�ε��� ���ǻ� e+1�� �������.
		
		//�� ������ �������� ����Ǵ� �����鿡 ���� ������ ���� ����Ʈ �ʱ�ȭ �۾�
		for(int i=1; i<=n; i++){
			graph[i] = new ArrayList<>();
		}
		
		for(int i=0; i<m; i++){
			int u = sc.nextInt();
			int v = sc.nextInt();
			
			graph[u].add(v);
			graph[v].add(u);
		}
		//Ž���� ������ �������� ��� ������ ���� �������� Ž�� �ϴ� ������ �����.
		for(int i=1; i<=n; i++){
			Collections.sort(graph[i]);
		}
		
		 check = new boolean[n+1];
		 bfs(start);
		 System.out.println();
		

	}
	
	private static void bfs(int start) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(start);
		check[start] = true;
	
		while(!queue.isEmpty()){
			int x = queue.remove();
			System.out.print(x + " ");
			for(int y : graph[x]){
				if(check[y] == false){
					check[y] = true;
					queue.add(y);
				}
			}
		}
	}
	

}
