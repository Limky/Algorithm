package SamsungTest;

import java.util.Arrays;
import java.util.Scanner;

public class ExaminationSupervision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int classNum,B,C,mainViewer,subViewer;
	
		classNum = sc.nextInt();
		int[] classRoom = new int[classNum];
		
		for(int i =0; i<classNum;i++){
			classRoom[i] = sc.nextInt();			
		}

		mainViewer = sc.nextInt();	
		subViewer = sc.nextInt();	
		//System.out.println(Arrays.toString(classRoom));
		
		int totalViewr = solution(classRoom,mainViewer,subViewer);
		System.out.println(totalViewr);
		
	}

	private static int solution(int[] classRoom, int mainViewer, int subViewer) {
		// TODO Auto-generated method stub
		for(int i = 0; i < classRoom.length; i++){
			classRoom[i] -= mainViewer;
		}
		
		int subVieweNumber = 0;
		for(int i = 0; i < classRoom.length; i++){
			System.out.println("classRoom[i] "+classRoom[i]);
			if(classRoom[i] > 0){
				
				do{
					classRoom[i] -= subViewer;
					subVieweNumber++;
					System.out.println("sub "+subVieweNumber);
				}while(classRoom[i] > 0);
					
				
			}
			
		}

		return classRoom.length+subVieweNumber;
	}


}
