package wt.com.alg.array;

import java.util.Arrays;

public class mergeSort2 {
    public static void main(String[] args) {
        int[] array = new int[]{1,2,1,3,5,7};
        mergeSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
    public static void mergeSort(int [] arr,int left,int right){
        if(left<right){
            int mid=left+right/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge2Array(arr,mid,right,left);
        }
    }
    public static  void merge2Array(int[] arr,int mid ,int right,int left){
        int[] temp=new int[right-left+1];
        int p1=left;
        int p2=mid+1;
        int count=0;
        while (p1<=mid && p2<=right){
            if(arr[p1]<arr[p2]){
                temp[count++]=arr[p1];
            }else{
                temp[count++]=arr[p2];
            }
        }
        while (p1<=mid){
            temp[count++]=arr[p1];
        }
        while (p2<=right){
            temp[count++]=arr[p2];
        }
        for(int i=0;i<count;i++){
            arr[left++]=temp[i];
        }
    }
}
