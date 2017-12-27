package BackJoon.Graph.DFS;

import java.util.Arrays;
import java.util.Scanner;

public class FindDirections {

	static int[][] a; // 인접행렬로 이루어진 방향그래프
	static int[] c; //check 방문 여부 저장하는 1차원 배열
	static int[][] path; //i,j로 가는길 여부를 저장하는 2차원 배열
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		a = new int[n+1][n+1];
		c = new int[n+1];
		path = new int[n+1][n+1];
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				a[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i=1; i<=n; i++){
			dfs(i);
			
			for(int j=1; j<=n; j++){
				path[i][j] = c[j];
			}
			//다음 탐색을 위해 리셋
			Arrays.fill(c, 0);
		}
		
		
		for(int i=1; i<=n; i++){
			for(int j=1; j<=n; j++){
				System.out.print(path[i][j]+" ");
			}
			System.out.println();
		}


	}
	private static void dfs(int v) {
		int n = a.length-1;
		
		for(int i=1; i<=n; i++){
			
			//v->i갈 수있는 길이 있고, 방문하지 않은 경우
			if(a[v][i]==1 && c[i]==0){
				c[i] = 1; // 방문체크
				dfs(i);
			}
		}
		
		
	}

}
