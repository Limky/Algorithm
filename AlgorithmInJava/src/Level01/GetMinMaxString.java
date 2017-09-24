package Level01;

import java.util.Arrays;

public class GetMinMaxString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String str = "11 -8 10 -15 0 -6 5";
	        GetMinMaxString minMax = new GetMinMaxString();
	        //아래는 테스트로 출력해 보기 위한 코드입니다.
	        System.out.println("최대값과 최소값은?" + minMax.getMinMaxString(str));
		
	}
	
	   public String getMinMaxString(String str) {
		   String[] strArray = str.split(" ");
		   int[] array = Arrays.stream(strArray).mapToInt(Integer::parseInt).toArray();
		   System.out.println(Arrays.toString(array));
		   
		   sortSelection(array);
		  
		   
	        return array[0]+" "+array[array.length-1];
	    }

	   
	private void sortSelection(int[] array) {
		   int temp = 0;
		   int minIndex = 0;
		   for(int i = 0 ; i < array.length-1; i++){
			   minIndex = i;
			   for(int j = i+1; j < array.length; j++){				  
				   if(array[minIndex] > array[j]){
					   minIndex = j;
					  
				   }
				   
			   }
			   
			   temp = array[i];
			   array[i] = array[minIndex];
			   array[minIndex] = temp;
						   	   
		   }
	}

}
