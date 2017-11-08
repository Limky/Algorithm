package Programmers.level02;

public class CreateMinimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CreateMinimal test = new CreateMinimal();
	        int []A = {1,2};
	        int []B = {3,4};
	    System.out.println(test.getMinSum(A,B));
		
	}

	
	 public int getMinSum(int []A, int []B)
	    {
	        int answer = 0;

	        for(int i=0; i<A.length; i++){
	        	
	        	answer += A[i]*B[A.length-1-i];
	        }
	        
	        
	        return answer;
	    }
}
