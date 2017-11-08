package SamsungTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Gear {

	static int[][] command;
	static ArrayList<int[]> list;
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		list = new ArrayList<>();
		
		for(int i=0; i<4; i++){
			int[] array = new int[8];
		
			String str = sc.next();
			for(int j=0; j<8; j++){
				array[j] = Integer.parseInt(str.charAt(j)+"");
			}
			list.add(array);
		}
		
		int n = sc.nextInt(); //회전 수
		
		command = new int[n][2];
		
		for(int i=0; i<n; i++){
			for(int j=0; j<2; j++){
				command[i][j] = sc.nextInt();
			}
		}

		
		solution();
		
		
		
		//printCommand(command);
		//printGear(list);
	}

	
	
	private static void solution() {
		for(int i=0; i<command.length;i++){
			rotate(command[i][0]-1,command[i][1]);
			
			boolean leftFlag = true;
			int target = command[i][0]-1;
			int direction = command[i][1];
			while(leftFlag){
				try {			
					if(list.get(target)[6+direction]!=list.get(--target)[2]){
						direction = direction*-1;
						rotate(target,direction);
					}else{
						leftFlag = false;
					}
				} catch (Exception e) {
					leftFlag = false;
				}
			}
			
			boolean rightFlag = true;
			target = command[i][0]-1;
			direction = command[i][1];
			while(rightFlag){
				try {			
					if(list.get(target)[2+direction]!=list.get(++target)[6]){
						direction = direction*-1;
						rotate(target,direction);
					}else{
						rightFlag = false;
					}
				} catch (Exception e) {
					rightFlag = false;
				}
			}
			
			
		}
		int ans = 0;
		for(int i=0; i<list.size();i++){
			ans += list.get(i)[0]*(Math.pow(2, i));
		}
		System.out.println(ans);
		
	}

	private static void rotate(int target, int direction) {
		if(direction == 1){
			//시계방향
			int temp=list.get(target)[7];
			for(int i=7; i > 0; i--){
				list.get(target)[i] = list.get(target)[i-1];
			}
			list.get(target)[0] = temp;
			
			//System.out.println(Arrays.toString(list.get(target)));
			
			
		}else{
			//시계 반대방향
			int temp=list.get(target)[0];
			for(int i=0; i < 7; i++){
				list.get(target)[i] = list.get(target)[i+1];
			}
			list.get(target)[7] = temp;
			//System.out.println(Arrays.toString(list.get(target)));
		}
	
		
	}



	private static void printCommand(int[][] command) {
		for(int i=0; i<command.length; i++){
			for(int j=0; j<2; j++){
				System.out.print(command[i][j]+" ");
			}
			System.out.println();
		}
		
	}

	private static void printGear(ArrayList<int[]> list) {
		for(int i=0; i<list.size();i++){
			
			for(int j=0; j<list.get(i).length;j++){
				System.out.print(list.get(i)[j]);
			}
			System.out.println();
		}
		
	}
	
	

}
