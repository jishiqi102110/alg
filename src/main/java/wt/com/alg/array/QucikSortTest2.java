package wt.com.alg.array;

import java.util.Arrays;

public class QucikSortTest2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 7, 9, 1};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void quickSort(int[] arr,int left,int right){
        if(left<right){
            int partion=findPartion(arr,left,right);
            quickSort(arr,left,partion);
            quickSort(arr,partion+1,right);
        }
    }
    //  a b c d e
    public static int  findPartion(int[] arr,int left,int right){
        int first=arr[left];
        while (left<right){
            if( left < right && arr[right]>=first){
                right--;
            }
            swap(arr,left,right);
            if( left < right && arr[left]<=first){
                left++;
            }
            swap(arr,left,right);
        }
        return left;
    }
    public static void swap (int[] arr,int j,int i){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
