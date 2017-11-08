package BackJoon.Graph.BFS;

import java.awt.Point;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MakeBridge {

	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][] a = new int[n][n]; //�־��� ��
		int[][] g = new int[n][n]; //�׷��� �� ��
		int[][] d = new int[n][n]; //�Ÿ� ��� ��
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				a[i][j] = sc.nextInt();
			}
		}
		
		//printArray(a);
		
		int cnt = 0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				if(a[i][j]==1 && g[i][j]==0){
				grouping(i,j,a,g,n,++cnt);
				}
			}
		}
		
	//	printArray(g);
		
		getMinDistance(a,g,d,n,cnt);
		
		
		
	}
	private static void getMinDistance(int[][] a, int[][] g, int[][] d, int n, int cnt) {
		int ans = -1; //������ �ٸ��� ���� �� -1 ����	
		Queue<Point> q = new LinkedList<>();
			for(int k=1; k<=cnt; k++){
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					d[i][j] = -1;
					if(g[i][j]==k){
						d[i][j] = 0;
						q.add(new Point(i,j));
					}
				}
			}
			
			while(!q.isEmpty()){
				Point p = q.poll();
				for(int m=0; m<4; m++){
					int nx = p.x+goX[m];
					int ny = p.y+goY[m];
					if(-1<nx && nx <n && -1<ny && ny<n){
						if (d[nx][ny] == -1) {
                            d[nx][ny] = d[p.x][p.y] + 1;
                            q.add(new Point(nx,ny));

                        }
					}
				}
			}//while�� ��
			
			for(int i=0; i<n; i++){
				for(int j=0; j<n; j++){
					if(a[i][j]==1 && g[i][j] !=k){//���̰�,���� ���� �ƴҶ�!
						if(ans==-1 || d[i][j]-1 < ans ){ //ans == -1�ΰ�� üũ�� ������ �ٸ��� ���� ���
							ans = d[i][j]-1;//���� �Ÿ����� 1���̳�.
						}
					}
				}
			}

			}
			System.out.println(ans);
			
	}
	static int[] goX = {-1,0,1,0};
	static int[] goY = {0,1,0,-1};
	private static void grouping(int x, int y, int[][] a, int[][] g, int n, int cnt) {
		Queue<Point> q = new LinkedList<>();
		q.add(new Point(x, y));
		g[x][y] = cnt;
		while(!q.isEmpty()){
			Point p = q.poll();
			for(int i=0; i<4; i++){
				int nx = p.x+goX[i];
				int ny = p.y+goY[i];
				if((-1 < nx && nx < n) && (-1 < ny && ny < n)){
					if(a[nx][ny]==1 && g[nx][ny]==0){ 
						g[nx][ny] = cnt;
						q.add(new Point(nx, ny));
					}
					
				}
			}
		}
		
	}

	private static void printArray(int[][] a) {
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[0].length; j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}