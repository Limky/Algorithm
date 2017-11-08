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

		 n = sc.nextInt(); // ���� ����
		 m = sc.nextInt(); // ���� ����

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
			//4���� üũ�ؾ� �ϱ� ������ 4
			for(int i=0; i<4; i++){
			int x = point.x + goX[i];
			int y = point.y + goY[i];
					
			if((-1< x && x < n) && (-1 < y && y < m) && maze[x][y] == 1 ){
				maze[x][y] = maze[point.x][point.y] + 1; //+=�ϸ� �ȵǴ� ���� �Ѱ��� ���� �� �� �ִ� ��� ������
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
