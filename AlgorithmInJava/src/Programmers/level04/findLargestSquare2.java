package Programmers.level04;

public class findLargestSquare2 {

	 public static void main(String[] args)
	    {
		 findLargestSquare2 test = new findLargestSquare2();
					char [][]board ={
					{'X','O','O','O','X'},
					{'X','O','O','O','O'},
					{'X','X','O','O','O'},
					{'X','X','O','O','O'},
					{'X','X','X','X','X'}};

	        System.out.println(test.findLargestSquare(board));
	    }

	 public int findLargestSquare(char [][]board)
	    {
	        int answer = 0;
	        int [][]dp = new int[board.length+1][board[0].length+1];
	
	        for(int i=0; i<board.length; i++){
	        	for(int j=0; j<board[0].length; j++){
	        		if(board[i][j]=='O'){
	        			dp[i+1][j+1] = 1;
	        		}
	        	}
	        }
	        
	        for(int i=0; i<dp.length; i++){
	        	for(int j=0; j<dp[0].length; j++){
	        		if(dp[i][j]>=1 && dp[i][j-1]>=1 && dp[i-1][j-1]>=1 && dp[i-1][j]>=1){
	        			dp[i][j] = Math.min(dp[i][j-1],Math.min(dp[i-1][j-1], dp[i-1][j]))+1; 
	        		}
	        	}
	        }

	        //printArray(dp);
	        for(int i=0; i<dp.length; i++){
	        	for(int j=0; j<dp[0].length; j++){
	        		answer = Math.max(dp[i][j], answer);
	        	}
	        }
	        
	        return answer*answer;
	    }
	 
	 private static void printArray(int[][] ground) {
			for(int i=0; i<ground.length; i++){
				for(int j=0; j<ground[0].length; j++){
					System.out.print(ground[i][j]+" ");
				}
				System.out.println();
			}
		}
}

