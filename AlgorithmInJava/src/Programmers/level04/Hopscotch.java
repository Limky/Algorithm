package Programmers.level04;

class Hopscotch {
    public static void main(String[] args) {
        Hopscotch c = new Hopscotch();
        int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.hopscotch(test, 3));
    }
    
    int hopscotch(int[][] board, int size) {
        int result = 0;
 
        int [][] dp = new int[size][board[0].length];
        
        for(int i=0; i<4; i++) dp[0][i] = board[0][i];
        
        int ans=0;
        for(int i=1; i<size; i++)
        	for(int j=0; j<4 ; j++)
        		for(int k=0; k<4; k++)
        			if(j!=k){
        				dp[i][j] = Math.max(dp[i][j], board[i][j] + dp[i-1][k]);
        			} 	
        
        //printArray(dp);
        
        for(int i=0; i<4; i++)
        	result = Math.max(result, dp[size-1][i]);
        

        return result;
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