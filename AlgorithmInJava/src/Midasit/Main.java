package Midasit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
		 int result;
		 String message;
		 
	     Scanner scan = new Scanner(System.in);      // 문자 입력을 인자로 Scanner 생

	     n = scan.nextInt();
	     String[] table = new String[n];
	     Scanner scan2 = new Scanner(System.in); 

		message = scan2.nextLine();
			 
		solution(table,message);
		
		solution(table);
		
	     
	}

	private static void solution(String[] table) {
		// TODO Auto-generated method stub
		
		  Integer[] intarray=new Integer[table.length];
		  int i=0;
		    for(String str:table){
		            intarray[i]=Integer.parseInt(str);
		            i++;
		    }
		    ArrayList<Integer> arrayList = new ArrayList<>();
		    
		for(int n = 0 ; n < table.length; n++){
			
			int number = 0;
			for(int j = 0 ; j < table.length; j++){
				if(intarray[n] <= intarray[j] && intarray[j] <= intarray[n]+4 ){
					number++;
					//System.out.println(n+" "+intarray[j]);
				}
				
			}
			if(number == 1){
				arrayList.add(intarray[n]);
			}
						
			
		}

		
		
	  Comparator<Integer> compare = new Comparator<Integer>() { @Override public int compare(Integer lhs, Integer rhs) { return lhs.compareTo(rhs); } };
	  
	  Collections.sort(arrayList, compare);
	  System.out.println(arrayList.get(0));
	  

		
	}

	private static void solution(String[] table, String message) {
		// TODO Auto-generated method stub
		String[] results = message.split(" ");
		
		for(int i = 0; i < table.length; i++ ){
			table[i] = results[i];
		}
		
		//System.out.println(Arrays.toString(table));
	}

}
