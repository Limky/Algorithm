package Programmers.level02;

class ProductMatrix {

	public static void main(String[] args) {
		ProductMatrix c = new ProductMatrix();
		int[][] a = { { 1, 2 , 3}, { 2, 3 ,4} };
		int[][] b = { { 3, 4 }, { 5, 6 },{ 3, 4 } };
      // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
      System.out.println("����� ���� : " + c.productMatrix(a, b));
      
      
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
//	                System.out.print(answer[i][j] + " "); // �� ���
//	            }
//	            System.out.println(); // �� ���
//	        }
		
		return answer;
	}


}
