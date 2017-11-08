package BackJoon.Graph.DFS;

import java.util.Arrays;
import java.util.Scanner;

public class StickHouseNumber {

	static int[][] house;
	static int[][] check;
	static int n;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		house = new int[n][n];
		
		for(int i=0; i<n; i++){
			String str = sc.next();
			for(int j=0; j<n; j++){
				house[i][j] = Integer.parseInt(str.charAt(j)+"");			
			}
		}
		
		int cnt = 0;
		check = new int[n][n];
		
		for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(house[i][j]==1 && check[i][j] == 0){
                    dfs(i,j,++cnt);
			
                }
            }
        }
		for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            	System.out.print(check[i][j]+" ");
            }
            System.out.println();
        }
		
		
		
		
		int[] ans = new int[cnt];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (check[i][j] != 0) {
                    ans[check[i][j]-1]+=1;
                }
            }
        }

        Arrays.sort(ans);
        System.out.println(cnt); //총 단지수 
        for (int i=0; i<cnt; i++) {
            System.out.println(ans[i]); //오름 차순
        }

	}

	static int goX[] = {-1,0,1,0};
	static int goY[] = {0,1,0,-1};
	private static void dfs(int x, int y, int cnt) {
		check[x][y] = cnt;
		for(int k=0; k<4; k++){
			int nx = x + goX[k];
			int ny = y + goY[k];
			
			if((-1 < nx && nx < n) && (-1 <ny && ny < n)){
				if(house[nx][ny]==1 && check[nx][ny] == 0){
					dfs(nx,ny,cnt);
				}
			}
			
			
		}
		
		
	}

}
