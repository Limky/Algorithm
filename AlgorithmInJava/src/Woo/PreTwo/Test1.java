package Woo.PreTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		String s = "photo.jpg, Warsaw, 2013-09-05 14:08:15\njohn.png, London, 2015-06-20 15:13:22\nmyFriends.png, Warsaw, 2013-09-05 14:07:13\nEiffel.jpg, Paris, 2015-07-23 08:03:02\npisatower.jpg, Paris, 2015-07-22 23:59:59\nBOB.jpg, London, 2015-08-05 00:02:03\nnotredame.png, Paris, 2015-09-01 12:00:00\nme.jpg, Warsaw, 2013-09-06 15:40:22\na.png, Warsaw, 2016-02-13 13:33:50\nb.jpg, Warsaw, 2016-01-02 15:12:22\nc.jpg, Warsaw, 2016-01-02 14:34:30\nd.jpg, Warsaw, 2016-01-02 15:15:01\ne.png, Warsaw, 2016-01-02 09:49:09\nf.png, Warsaw, 2016-01-02 10:55:32\ng.jpg, Warsaw, 2016-02-29 22:13:11";
		//System.out.println(s);
		solution(s);
	}

	
    public static String solution(String S) {
		String[] list = S.split("\n");
		String[] cityGrouping = new String[list.length];
		ArrayList<String> cityList[] = new ArrayList[list.length];
		Queue<String> q = new LinkedList<>();
		
		for(String i:list){
			q.add(i);
		}
		
		cityList[0].add(q.poll());
		int i=0;
		while(!q.isEmpty()){
			
			
			int size = q.size();
			
			for(int j=0; j<size; j++){
			String str = q.poll();
			if(str.contains(cityList[i].get(0).split(" ")[1])){
				cityList[i].add(str);
			}else{
				q.add(str);
			}
			
			}
			i++;
	
		}
		

    	return "";
       
    }
}
