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
	
		int n = sc.nextInt(); //정점의 수
		int m = sc.nextInt(); //간선의 수
		int start = sc.nextInt(); //탐색을 시작할 정점
		
		graph = new ArrayList[n+1]; //인덱스 편의상 e+1로 만들어줌.
		
		//각 정점의 간선으로 연결되는 정점들에 대한 정보를 담을 리스트 초기화 작업
		for(int i=1; i<=n; i++){
			graph[i] = new ArrayList<>();
		}
		
		for(int i=0; i<m; i++){
			int u = sc.nextInt();
			int v = sc.nextInt();
			
			graph[u].add(v);
			graph[v].add(u);
		}
		//탐색할 정점이 여러개일 경우 정점중 작은 정점부터 탐색 하는 기준을 만든다.
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
