package BackJoon.Graph.BFS;

import java.awt.Point;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Tomato {


	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		int arrays[][] = new int[N][M];
		
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				arrays[i][j] = sc.nextInt();
			}
			
		}
		
		solution(arrays,M,N);
		
	}

	
	static int[] goX ={0,1,0,-1};
	static int[] goY ={-1,0,1,0};
	private static void solution(int[][] arrays, int M, int N) {
		Queue<Point> queue = new LinkedList<>();
		
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				if(arrays[i][j] ==1){
					queue.add(new Point(i,j));
				}
			}		
		}
		
		
		while(!queue.isEmpty()){
			Point current = queue.poll();
			
			for(int i=0; i<goX.length; i++){
				int x = current.x + goX[i];
				int y = current.y + goY[i];
			
				if(-1< x && x <N && -1< y && y <M && arrays[x][y] == 0 ){
					
					arrays[x][y] = arrays[current.x][current.y] + 1;
					queue.add(new Point(x, y));
				}
			
			}
			
		}
		
		int day = 0;
		for(int i=0; i<N; i++){
			for(int j=0; j<M; j++){
				if(arrays[i][j] == 0){
					System.out.println(-1+" 익지 않은 토마토가 있음.");
					return;
				}	
				if(arrays[i][j] > 0){		
					day = Math.max(day, arrays[i][j]);		
				}		
			}		
		}
		System.out.println(day-1+" 일 동안 익었음.");
		
		
		
		
	}
 

	
}
