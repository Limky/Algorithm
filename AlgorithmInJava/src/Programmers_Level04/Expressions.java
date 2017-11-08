package Programmers_Level04;

public class Expressions {

	public static void main(String[] args) {
		Expressions expressions = new Expressions();
		// 아래는 테스트로 출력해 보기 위한 코드입니다.
		System.out.println(expressions.expressions(15));

	}
	
	
	public int expressions(int num) {
		int answer = 0;

		for(int i=1; i<=num ;i++){
			int n = i;
			if(n == num)answer++;
			for(int j=i+1; j <=num; j++){
				n += j;
				if(num == n){
				//	System.out.println(i);
					answer++;
				}
				
			}
		}
		
		return answer;
	}
	

}
