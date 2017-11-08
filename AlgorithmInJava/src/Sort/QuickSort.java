package Sort;

import java.util.Arrays;

public class QuickSort {
    
    public void sort(int[] data, int l, int r){
        int left = l;
        int right = r;
        int pivot = data[(l+r)/2];
        
        do{
            while(data[left] < pivot) left++;
            while(data[right] > pivot) right--;
            if(left <= right){    
                int temp = data[left];
                data[left] = data[right];
                data[right] = temp;
                left++;
                right--;
            }
        }while (left <= right);
        
        System.out.println(Arrays.toString(data));
        
        if(l < right) sort(data, l, right);
        if(r > left) sort(data, left, r);
    }
    
    public static void main(String[] args) {
        
        int data[] = {1, 2, 3, 4, 5, 10};
        
        QuickSort quick = new QuickSort();
        quick.sort(data, 0, data.length - 1);
        System.out.println(Arrays.toString(data));
    }
}


