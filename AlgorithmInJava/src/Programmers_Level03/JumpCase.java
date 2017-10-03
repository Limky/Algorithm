package Programmers_Level03;

public class JumpCase {

	public static void main(String[] args) {
		JumpCase c = new JumpCase();
        int testCase =19;
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.jumpCase(testCase));
	
	}
	  public int jumpCase(int num) {
	        double answer = 0;

	        int n = (num/2)+1;
	      //  System.out.println(n);
	        
	        for(int i=0; i<n; i++){
	        	int oneNum = 0;
	        	int two = 2*i;
	        	int remain = num-two;
	        	
	        	while(remain > 0){
	        		remain -= 1;
	        		oneNum++;
	        	}
	        	
	        //	System.out.println("2 : "+i +" 1 : "+oneNum); 	
	        	double a =factorial(i+oneNum);
	        	double b =factorial(i);
	        	double c =factorial(oneNum);   	
	
	         	answer += a/(b*c);
	        	
	        }
	        

	        return (int) answer;
	    }
	  
	  
	  public static Double factorial(int n) {
		  Double fac=(double) 1;
    	  for(int i=n; i>=1; i--) {
    	   fac=fac*i;
    	  }
    	  return fac;
		}



}
