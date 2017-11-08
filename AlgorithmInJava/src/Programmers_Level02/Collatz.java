package Programmers_Level02;

public class Collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collatz c = new Collatz();
		int ex = 626331;
		System.out.println(c.collatz(ex));
	}
	
	public int collatz(int num) {
		Double answer = (double)num;
		int n=0;
		while(true){
			
		if(answer%2==0){
			//È¦¼ö
			answer = answer/2;
		//	System.out.print(answer+" ");
		}else{
			//Â¦¼ö
			answer = (answer*3)+1;
		//	System.out.print(answer+" ");
		}
			n++;
			if(answer==1)return n;
			if(n>=500) return -1;
		}
	}

}
