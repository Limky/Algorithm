package Woo.PreTest_One;

import java.awt.Point;
import java.util.Scanner;

public class Test03 {

	static int [][] map = new int[10000][10000];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner s = new Scanner(System.in))
		{
			int x1 = s.nextInt();
			int y1 = s.nextInt();
			int x2 = s.nextInt();
			int y2 = s.nextInt();
			
			int x3 = s.nextInt();
			int y3 = s.nextInt();
			int x4 = s.nextInt();
			int y4 = s.nextInt();
			
			int x5 = s.nextInt();
			int y5 = s.nextInt();
			int x6 = s.nextInt();
			int y6 = s.nextInt();
			
		
			drawSector(Math.abs(y2-y1),Math.abs(x2-x1),y2, x1);
			sector++;
			drawSector(Math.abs(y4-y3),Math.abs(x4-x3),y4, x3);
			sector++;
			drawSector(Math.abs(y6-y5),Math.abs(x6-x5),y6, x5);
		
			//여기부터 작성해 주세요
			
			counting();
			
		}
		
		
		
	}
	static int sector = 1;
	private static void drawSector(int h, int w, int y, int x) {
		
		int start_x = 10000-y; 
		for(int i=start_x; i<start_x+h; i++){
			for(int j=x; j<x+w; j++){
				map[i][j] = sector;
			}
		}	
	}
	
	private static void counting() {
		
		int count = 0;
		for(int i=0; i<10000; i++){
			for(int j=0; j<10000; j++){
				if(map[i][j]==1) count++;
			}
		}
		
		System.out.println(count);
	}
	
	
	
		
	
	
}
