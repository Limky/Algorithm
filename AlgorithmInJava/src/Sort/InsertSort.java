package Sort;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		int[] array = {5,3,4,7,6,2,1};
		System.out.println("Before   : "+Arrays.toString(array)+"\n");
		insertSort(array);
		


	}

	private static void insertSort(int[] array) {
		int temp = 0;
		int j = 0;
		
		for(int i=1; i<array.length; i++){
			temp = array[i]; // ���Դ�� �ӽ� ����.
			j = i; //index �ӽ�����
			while(j > 0 && temp < array[j-1]){ //���Դ���� ���ĵ� ���麸�� ���� ��찡 �ִ� ��� 
				array[j] = array[j-1]; //�б�
				j--; //���� �񱳸� ���� �ε��� �̵�
			}
			array[j] = temp; //�������� ���Ե� ��ġ�� ���Դ�� ����
			System.out.println((i)+"ȸ�� select sort result : " + Arrays.toString(array));	
			
		}
	}

	
}
