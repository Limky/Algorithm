package BackJoon.Graph.BFS;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingDeque;

public class ExploreMaze {
	static int maze[][];
	static 	int n,m;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		 n = sc.nextInt(); // 행의 갯수
		 m = sc.nextInt(); // 열의 갯수

		maze = new int[n][m];

		for (int i = 0; i < n; i++) {
			String str = sc.next();
			for (int j = 0; j < m; j++) {
				maze[i][j] = Integer.parseInt(str.charAt(j)+"");
			}
		}

		solution();
	//	printArray(maze);
	}
	
	static int goX[] = {-1, 0, 1, 0};
	static int goY[] = {0, 1, 0, -1};
	private static void solution() {
		Queue<Point> queue = new LinkedList<>();
		
		queue.add(new Point(0,0));
		
		while(!queue.isEmpty()){
			Point point = queue.poll();
			//4방향 체크해야 하기 때문에 4
			for(int i=0; i<4; i++){
			int x = point.x + goX[i];
			int y = point.y + goY[i];
					
			if((-1< x && x < n) && (-1 < y && y < m) && maze[x][y] == 1 ){
				maze[x][y] = maze[point.x][point.y] + 1; //+=하면 안되는 이유 한곳에 도착 할 수 있는 방법 여러개
				queue.add(new Point(x,y));
			}
			
			}
			
		}
		
		System.out.println(maze[n-1][m-1]);
		
		
	}
	
	private static void printArray(int[][] array) {
		 for(int i=0; i<array.length; i++){
			 for(int j=0; j<array[0].length; j++){
			 System.out.print(array[i][j]+" ");
			 }
			 System.out.println();
			 }
		 System.out.println();
		
	}

}
