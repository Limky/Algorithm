package Programmers.level02;

class ProductMatrix {

	public static void main(String[] args) {
		ProductMatrix c = new ProductMatrix();
		int[][] a = { { 1, 2 , 3}, { 2, 3 ,4} };
		int[][] b = { { 3, 4 }, { 5, 6 },{ 3, 4 } };
      // 아래는 테스트로 출력해 보기 위한 코드입니다.
      System.out.println("행렬의 곱셈 : " + c.productMatrix(a, b));
      
      
	}


	public int[][] productMatrix(int[][] A, int[][] B) {
		int[][] answer = new int[A.length][B[0].length];
		
		for(int i=0; i<answer.length;i++){
			for(int j=0; j<answer[0].length;j++){
				
				for(int k=0; k<A[0].length;k++){
					answer[i][j] += A[i][k]*B[k][j];
				}
				
			}
			
		}
//		 for (int i = 0; i < answer.length; i++) {
//	            for (int j = 0; j < answer[i].length; j++) {
//	                System.out.print(answer[i][j] + " "); // 열 출력
//	            }
//	            System.out.println(); // 행 출력
//	        }
		
		return answer;
	}


}
