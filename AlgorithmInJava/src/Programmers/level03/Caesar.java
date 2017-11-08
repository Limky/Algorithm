package Programmers.level03;

public class Caesar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caesar c = new Caesar();
		System.out.println("s는 'a B z z', n은 4인 경우: " + c.caesar("a B z zasdfasdDASDFf", 34));
	}

	String caesar(String s, int n) {
		//a = 97 z = 122   A = 65 Z = 90
		String result = "";
		String[] str = s.split(" ");
		
		for(int i=0; i<s.length(); i++){
			char c = s.charAt(i);
			int asccode = (int)c;
			if(c ==' '){
				//skip	
			}
			else if(asccode >= 65 && asccode <=90){
				 //대문자
				 asccode += n;
				 if(asccode > 90){
				 do{
					 asccode = asccode -26;
				 }while(!(asccode >= 65 && asccode <=90));
				 }
				// if(asccode > 90) asccode = asccode -26;
				 
				 
			 }else{
				 //소문자
				 asccode += n ;
				 if(asccode > 122){
					 do{
						 asccode = asccode -26;
					 }while(!(asccode >= 97 && asccode <=122));
					 }
				 
				// if(asccode > 122) asccode = asccode -26;
				 
			 }	 	
			result +=Character.toString((char)asccode);
		}
		
		return result;
	}


}
