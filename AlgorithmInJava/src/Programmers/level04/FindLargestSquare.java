package Programmers.level04;
//package Programmers_Level04;
//
//public	class FindLargestSquare{
//	
//	    public static void main(String[] args)
//	    {
//	    	FindLargestSquare test = new FindLargestSquare();
//					char [][]board ={
//					{'X','O','O','O','X'},
//					{'X','O','O','O','O'},
//					{'X','X','O','O','O'},
//					{'X','X','O','O','O'},
//					{'X','X','X','X','X'}};
//
//	        System.out.println(test.findLargestSquare(board));
//	    }
//	    
//	    public int findLargestSquare(char [][]board)
//	    {
//	        int answer = 0;
//	        for(int i=0; i<board.length; i++){
//	        	for(int j=0; j<board[0].length; j++){
//	        		if(board[i][j] =='O'){
//	        		System.out.println(detectSquare(board, i,j));
//	        		}
//	        	}
//	        }
// 
//
//	        return answer;
//	    }
//
//		private int detectSquare(char[][] board, int x, int y) {
//			int ans = 0;
//			int l = board.length;
//			for(int i=0; i<l; i++){
//				int cnt = 0;
//				for(int m=0; m<i; m++){
//					for(int n=0; n<i; m++){
//						if(-1<x+m && x+m<l && -1<y+m && y+m<l){
//							System.out.println("d");
//						if(board[x+m][x+y]=='O'){
//							cnt++;
//						}else{
//							return ans;
//						}
//						}
//					}
//				}
//				if(cnt==i*i){
//					System.out.println(i*i+" g");
//					Math.max(ans, i*i);
//				}
//				
//			}
//			return ans;
//			
//		}
//}