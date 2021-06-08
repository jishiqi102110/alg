package wt.com.alg.array;

import java.util.Arrays;

public class MergerSort2 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 7, 9, 1};
        int mid=array.length/2;
        mergeSort(array,0,array.length-1);
    }
    public static void mergeSort(int[] arr,int left,int right){
        if(left<right){
            int mid=left+right/2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge2Array(arr,left,mid,right);
        }else return;
    }
    public static void merge2Array(int arr[],int left,int mid,int right){
        int ln=0;
        int rn=mid+1;
        int[] temp=new int[right-left+1];
        int k=0;
        while (ln<=mid && rn<=right ){
            if(arr[ln]<arr[rn]){
                temp[k++]=arr[ln++];
            }else{
                temp[k++]=arr[rn++];
            }
        }
        while (ln<=mid){
            temp[k++]=arr[ln++];
        }
        while (rn<=right){
            temp[k++]=arr[rn++];
        }
        for(int i=0;i<temp.length;i++){
            arr[left++]=temp[i];
        }
    }
}
