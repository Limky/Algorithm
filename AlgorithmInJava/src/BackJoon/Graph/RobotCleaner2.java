package BackJoon.Graph;

import java.util.Scanner;

public class RobotCleaner2 {
	static int map[][];
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 행의 갯수
		int m = sc.nextInt(); // 열의 갯수

		int startI = sc.nextInt(); // 로봇 위치 i
		int startJ = sc.nextInt(); // 로봇 위치 j

		int direction = sc.nextInt(); // 청소기 세팅 방향

		map = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				map[i][j] = sc.nextInt();
			}
		}

		printArray();

		solution(map, n, m, direction, startI, startJ);

	}


	private static void printArray() {
		 for(int i=0; i<map.length; i++){
			 for(int j=0; j<map[0].length; j++){
			 System.out.print(map[i][j]+" ");
			 }
			 System.out.println();
			 }
		 System.out.println();
		
	}

	private static void check(int i, int j, int cleanNum){
		if(map[i][j] == 0){
			map[i][j] = 2;
			cleanNum++;
		}
		
	}
	
	private static void solution(int[][] map, int n, int m, int direction, int startI, int startJ) {

		boolean possibility = true;
		int cleanNum = 0;
		int i=startI;
		int j=startJ;
		int tryNum = 0;
		
		
		while (possibility) {
			if(map[i][j] == 0){
				map[i][j] = 2;
				cleanNum++;
			}
			
			System.out.println(i+" "+j +"direction :"+direction);
			printArray();
			if(tryNum >= 5) {
				System.out.println("tryNum : "+tryNum);
				System.out.println("cleanNum : "+cleanNum);
				return;
			}
			
			switch (direction) {
		
		
			case 0:
				
				if(map[i][j-1] == 0){
					map[i][j-1] = 2;
					cleanNum++;
					j =j-1;
					direction = 3;
					tryNum = 0;
					
				}else{
					tryNum +=1; //시도 증가
					direction = 3; //왼쪽 틀기
					if(tryNum == 4){
						if(!(map[i+1][j]==1)){
						i = i+1;
						tryNum = 0;
						}else{
							tryNum++;
						}	
					}
						
			
						
				}
				
				break;
			case 1:
		
				if(map[i-1][j] == 0){
					map[i-1][j] = 2;
					cleanNum++;
					i =i-1;
					direction = 0;
					tryNum = 0;
					
				}else{
					tryNum +=1; //시도 증가
					direction = 0; //왼쪽 틀기
					if(tryNum == 4){
						if(!(map[i][j-1]==1)){
						j = j-1;
						tryNum = 0;
						}else{
							tryNum++;
						}	
					}
				}
				break;

			case 2:
				
				if(map[i][j+1] == 0){
					map[i][j+1] = 2;
					cleanNum++;
					j =j+1;
					direction = 1;
					tryNum = 0;
					
				}else{
					tryNum +=1; //시도 증가
					direction = 1; //왼쪽 틀기
					if(tryNum == 4){
						if(!(map[i-1][j]==1)){
						i = i-1;
						tryNum = 0;
						}else{
							tryNum++;
						}	
					}
				}
				break;

			case 3:
				
				if(map[i+1][j] == 0){
					map[i+1][j] = 2;
					cleanNum++;
					i =i+1;
					direction = 2;
					tryNum = 0;
					
				}else{
					tryNum +=1; //시도 증가
					direction = 2; //왼쪽 틀기
					if(tryNum == 4){
						if(!(map[i][j+1]==1)){
						j = j+1;
						tryNum = 0;
						}else{
							tryNum++;
						}	
					}
				}
				
				break;

			default:
				break;
			}

		}

	}

}
