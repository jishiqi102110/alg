package wt.com.alg.array;

import java.util.Arrays;

public class quicSort3 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 7, 9, 1};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void swap (int[] arr,int j,int i){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void  quickSort(int[] arr,int left,int right){
        if(left<right){
            int partion=findPartion(arr,left,right);
            quickSort(arr,left,partion-1);
            quickSort(arr,partion+1,right);
        }
    }
    public static int findPartion(int[] arr,int left,int right){
        int first=arr[left];
        while (left<right){
           while (arr[right]>=first && left<right){
               right--;
           }
           swap(arr,left,right);
           while (arr[left]<=first && left<right){
               left++;
           }
           swap(arr,left,right);
        }
        return  left;
    }
}
