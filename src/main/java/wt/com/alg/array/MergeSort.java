package wt.com.alg.array;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 7, 9, 1};
        int[] arr1 = new int[]{1,2,4,3,5,7};
        mergeSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }

    public static void mergeSort(int[] arr,int l,int r){
        if (l==r) return;
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    //这里合并两个有序数组
    public static void merge(int[] arr,int l,int mid,int r){
        int[] temp=new int[r-l+1];
        int k=0;
        int p1=l;
        int p2=mid+1;
        while (p1<=mid && p2<=r){
            temp[k++]=arr[p1]<arr[p2]?arr[p1++]:arr[p2++];
        }
        while (p1<=mid){
            temp[k++]=arr[p1++];
        }
        while (p2<=r){
            temp[k++]=arr[p2++];
        }
        for(int i=0;i<temp.length;i++){
            arr[l++]=temp[i];
        }
    }
}
