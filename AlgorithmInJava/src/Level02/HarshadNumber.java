package Level02;

public class HarshadNumber {

	public static void main(String[] args) {
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(28));

	}
	
	public boolean isHarshad(int num){

		int number = num;
		int sum = 0;
		
		while(num !=0 ){
			sum += num%10;//³ª¸ÓÁö
			num /= 10;//¸ò
			
		}
		
		if(number%sum==0)return true;
	

		return false;
	}

}
