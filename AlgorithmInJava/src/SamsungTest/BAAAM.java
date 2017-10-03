package SamsungTest;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class BAAAM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n,appleNum,turnNum;
	
		n = sc.nextInt();
		int[][] map = new int[n][n];
		appleNum = sc.nextInt();
		
		for(int i =0; i<appleNum;i++){
			map[sc.nextInt()-1][sc.nextInt()-1] = 2;			
		}
		
		turnNum = sc.nextInt();
		
		LinkedHashMap turnInfo = new LinkedHashMap();
		ArrayList<Integer> turnList = new ArrayList<>();
		
		for(int i=0; i<turnNum;i++){
			int dummy = sc.nextInt();
			turnList.add(dummy);
			turnInfo.put(dummy,sc.next());
		}
		
		
		 Iterator keyData = turnInfo.keySet().iterator();
         String v;
         int k;
         while (keyData.hasNext()) {
                 k = (int) keyData.next();
                 v = (String) turnInfo.get(k);
                 System.out.println(k + " : " + v);
         } // while





		
		printMap(map);
		
		solution(map, turnNum, turnInfo , turnList);
		
		
	}
	static int x2,x1 = 0;
	static int y2,y1 = 0;
	static int size = 1;
	static int time = 0;
	static ArrayList<Point> pathList = new ArrayList<>();
	private static void solution(int[][] map, int turnNum, LinkedHashMap turnInfo, ArrayList<Integer> turnList) {

	boolean tail = false;
		do{
			//¹«ºê
			time++;
			System.out.println("time :"+time);
			try {
				tail = move(map,turnInfo,time, turnList);	
				if(tail) {
					System.out.println("²¿¸® ¹°±â »ç¸Á");
					System.out.println("result time :"+time);
					break;
					}
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("Àå¿Ü ÀÌÅ» »ç¸Á");
				System.out.println("result time :"+time);
				break;
			}

			//ÀÍ¼Á¼ÇÃ³¸®
			
			printMap(map);
			
			
		}while(true);
		
	}

	private static boolean move(int[][] map, LinkedHashMap turnInfo, int time, ArrayList<Integer> turnList) {
		String head = "";
		String turn = "";
		if(time == 1){
			head = "X++";
			
			x1 = x2;
			y1 = y2;
			
			savePath(y2,++x2, map);
			
			//map[y2][++x2] = 1;
			

		}else{
			turn = "G";
			
			if(turnList.size()>0)
			if(time-1 == turnList.get(0)){
			    turn =(String)turnInfo.get(time-1);	
			    turnList.remove(0);			   
			}
			//Á÷Áø
			
			int X = x1-x2;
			int Y = y1-y2;
		//	System.out.println(Y+" "+X);
			
			if(X == 1) head ="X--";
			if(Y == 1) head ="Y--";
			if(X == -1) head ="X++";
			if(Y == -1) head ="Y++";
			
			x1 = x2;
			y1 = y2;
			
			switch (head) {
			
			case "X++":
			//	System.out.println("X++");
				if(turn.equals("G")){
			//		System.out.println("G");	
				return savePath(y2,++x2, map);
					
				}
				else if(turn.equals("D")){
			//		System.out.println("D");
					return	savePath(++y2,x2, map);
				}
				else if(turn.equals("L")){
			//		System.out.println("L");
					return	savePath(--y2,x2, map);
				}
			
				break;
			case "Y++":
			//	System.out.println("Y++");
				if(turn.equals("G")){
			//		System.out.println("G");
					return savePath(++y2,x2, map);

				}
				else if(turn.equals("D")){
			//		System.out.println("D");	
					return savePath(y2,--x2, map);
				}
				else if(turn.equals("L")){
			//		System.out.println("L");
					return savePath(y2,++x2, map);
				}
				break;
				
			case "X--":
			//	System.out.println("X--");
				if(turn.equals("G")){
			//		System.out.println("G");			
					return savePath(y2,--x2, map);
				}
				else if(turn.equals("D")){
			//		System.out.println("D");
					return savePath(--y2,x2, map);
				}
				else if(turn.equals("L")){
			//		System.out.println("L");
					return savePath(++y2,x2, map);
				}
				break;
			case "Y--":
			//	System.out.println("Y--");
				if(turn.equals("G")){
			//		System.out.println("G");
					return savePath(--y2,x2, map);
				}
				else if(turn.equals("D")){
			//		System.out.println("D");
					return savePath(y2,++x2, map);
				}
				else if(turn.equals("L")){
			//		System.out.println("L");
					return savePath(y2,--x2, map);
				}
				break;
				
				
			}

			
		}
		
		return false;
	}


	static int temp =1;
	private static boolean savePath(int y, int x, int[][] map) {
		// TODO Auto-generated method stub
	
		if(map[y][x]==2){
			temp = size+1;
		}
		if(map[y][x]==1){
			return true;
		}
		
		Point point = new Point(y, x);
		pathList.add(point);
	//	System.out.println("pathList : "+pathList.size()+" size : "+size);
		for(int i=0; i<pathList.size();i++){	
			if(i >= pathList.size()-size){
				map[(int) pathList.get(i).getX()][(int) pathList.get(i).getY()] = 1;
			}else{
				map[(int) pathList.get(i).getX()][(int) pathList.get(i).getY()] = 0;
				
			}	
		}
		
		
		
		size = temp;
		
		return false;
		
	}

	private static void printMap(int[][] map) {
		
	    for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " "); 
            }
            System.out.println(); 
        }
	    System.out.println(); 

		
	}

}
