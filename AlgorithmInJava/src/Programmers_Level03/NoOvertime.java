package Programmers_Level03;

import java.util.Arrays;

public class NoOvertime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoOvertime c = new NoOvertime();
		int []test = {4,3,3};
		System.out.println(c.noOvertime(4,test));
	}

	public int noOvertime(int no, int[] works) {
		int result = 0;
		// �߱� ������ �ּ�ȭ �Ͽ��� ���� �߱� ������ ���ϱ��?
	
		for(int i =0; i<no; i++){
			Arrays.sort(works);
			works[works.length-1] -= 1;	
		}
		
		System.out.println(Arrays.toString(works));
		for(int i=0; i<works.length;i++){
			result+= Math.pow(works[i], 2);
		}
		

		return result;
	}
	
}
