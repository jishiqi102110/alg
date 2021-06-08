package wt.com.alg.array;

import java.util.Arrays;
import java.util.Collections;

public class Sort2Array {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,0,0,0};
        int[] array2=new int[]{2,5,6};
        System.out.println(Arrays.toString(MySort(array)));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        System.arraycopy(nums2,0,nums1,n,m);
//
        Arrays.sort(nums1);

    }
    public static int[] MySort (int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
