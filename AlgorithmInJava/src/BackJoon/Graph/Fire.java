package BackJoon.Graph;

import java.awt.Point;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fire {
	static ArrayList<char[][]> arrays;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		arrays = new ArrayList<>();
		
		char [][]temp;
		for(int i=0; i<n; i++){
			int h = sc.nextInt();
			int w = sc.nextInt();
			temp = new char[w][h];
			sc.nextLine();
			for(int j=0; j< temp.length; j++){
				 String str = sc.nextLine();
				for(int k=0; k<temp[0].length; k++){
					temp[j][k] = str.charAt(k);
				}	
			}
			arrays.add(temp);	
			
		}
		
		String[] str = new String[n];
		for(int i=0; i<arrays.size(); i++){
			str[i] = startFire(arrays.get(i));
			
		}
		for(String s : str){
			System.out.println(s);
		}

		

	}

	static int[] goX ={0,1,0,-1};
	static int[] goY ={-1,0,1,0};
	private static String startFire(char[][] cs){
		int cols = cs.length;
		int rows = cs[0].length;
		
		Queue<Point> fireQueue = new LinkedList<>();
		Queue<Point> humanQueue = new LinkedList<>();
		
		int escapeNum = 1;
		
		for(int i=0; i<cs.length; i++){	
			for(int j=0; j< cs[0].length; j++){
				if(cs[i][j] == '*'){
					fireQueue.add(new Point(i,j));
				}
				if(cs[i][j] == '@'){
					humanQueue.add(new Point(i,j));
				}
				
			}
		}
		

		while(!fireQueue.isEmpty() || !humanQueue.isEmpty()){
	
			//4방향 다 체크
			int size = fireQueue.size();
			for(int n =0; n<size;n++){
				Point firePoint = fireQueue.poll();
				
			for(int i=0; i<4; i++){
				int fireX = firePoint.x + goX[i];
				int fireY = firePoint.y + goY[i];
				//불이 번질 수 있을 때.
				if(-1< fireX && fireX <cols && -1< fireY && fireY < rows && (cs[fireX][fireY]=='.' || cs[fireX][fireY]=='@')){
					cs[fireX][fireY] = '*';
					fireQueue.add(new Point(fireX, fireY));
				}

			}
			}
		
			
			//인간 움직임.
			
			int humanSize = humanQueue.size();
			if(humanSize > 0){
			for(int n=0; n<humanSize; n++){
				Point humanPoint = humanQueue.poll();
				
				for(int i=0; i<4; i++){
					int humanX  = humanPoint.x + goX[i];
					int humanY  = humanPoint.y + goY[i];
				//	System.out.println(humanX+" "+humanY);
					try {
					if(cs[humanX][humanY] == '.'){
						cs[humanX][humanY] = '@';
						humanQueue.add(new Point(humanX, humanY));
						
						
						}
					} catch (Exception e) {
						//System.out.println(escapeNum+" 탈출 ");
						return String.valueOf(escapeNum);
							
					}
				
				}
			}
			escapeNum++;
			}else{
				//System.out.println(" !!! 탈출 불가능 !!! ");
				return "IMPOSSIBLE";
			}
		

			
		}
		
		//인간이 더이상 움직일 수 없을때
	return "IMPOSSIBLE";
		
	}
	
	

		
		
		
	}


