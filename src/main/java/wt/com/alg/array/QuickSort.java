package wt.com.alg.array;

import java.util.*;

public  class QuickSort {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 7, 9, 1};
        quickSort(array,0,array.length-1);
        System.out.println(Arrays.toString(array));
        int[] array2 = new int[]{2,1,2,1,3};
        mergeSort2(array2,0,array2.length-1);
        System.out.println(Arrays.toString(array2));
        System.out.println(JumpFloor(5));

        Stack<Integer> stack= new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        System.out.println(stack.toString());
        Iterator<Integer> iter=stack.iterator();
        while(iter.hasNext()){
            int n=iter.next();
            System.out.println(n);
        }
        System.out.println(10%10);
        System.out.println(10/10);


    }

    public static int[] MySort(int[] arr) {
        int mid = arr.length / 2;
        int begin = 0;
        int end = arr.length;
        for (int i = 0; i < mid; i++) {
            swap(arr, i, arr.length - i - 1);
        }
        return arr;
    }
    public static void quickSort(int arr[],int left,int right){
        if(left<right){
            int partion=partion(arr,left,right);
            quickSort(arr,left,partion-1);
            quickSort(arr,partion+1,right);
        }
    }

    public static void swap(int[] arr, int i, int j) {

        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }


    public static int partion(int arr[], int left, int right) {
        int low = arr[left];
        while (left<right){
            //从右边开始
            while (left < right && arr[right]>=low){
                right--;
            }
            swap(arr, left, right);
            while (left < right && low >= arr[left]) {
                left++;
            }

            swap(arr,left,right);
        }
        return  left;
    }

    // 归并排序
    //思想，利用栈的思想,线性合并的时候，直接放，每次将数组分成两个部分，先对子部分进行排序，然后对两个子序列进行 线性合并
    public static void mergeSort(int[] nums, int l, int r) {
        int mid=(l+r)/2;
        int mid2 = (l + r) >> 1;
        //这里先对子序列排序
        mergeSort(nums,l,mid);
        mergeSort(nums,mid+1,r);
        //这里然后对两边进行线性合并

        int i=l;
        int j=mid+1;


        List<Integer> list=new ArrayList<Integer>();
        while (i<=mid && j<=r){//这里需要判断下
            //如果num i <= num j,直接放进去，i++,如果大于 j放进去，j++
            if(nums[i]<=nums[j]){
                list.add(nums[i]);
                i++;
            }else {
                list.add(nums[j]);
                j++;
            }
            while (i<=mid){
                list.add(nums[i]);
                i++;
            }
            while (j<=r){
                list.add(nums[j]);
                j++;
            }
//            if(i==mid){
//                for(int x=j;x<=r;x++){
//                    list.add(nums[x]);
//                }
//            }
//            if(j==r){
//                for(int x=i;x<=l;x++){
//                    list.add(x);
//                }
//            }
        }
        for(int x=0;x<nums.length;x++){
            nums[i]=list.get(i);
        }


    }



    public static void mergeSort2(int[] nums, int l, int r) {

        //这里先对子序列排序
        if (l>=r){
            return;
        }
        int mid=(l+r)/2;
        mergeSort2(nums,l,mid);
        mergeSort2(nums,mid+1,r);
        //这里然后对两边进行线性合并

        int i=l;
        int j=mid+1;

        int[] temp=new int[r-l+1];
        int count=0;
        while (i<=mid && j<=r){//这里需要判断下
            //如果num i <= num j,直接放进去，i++,如果大于 j放进去，j++
            if(nums[i]<=nums[j]){
                temp[count++]=nums[i];
                i++;
            }else {
                temp[count++]=nums[j];
                j++;
            }
//            if(i==mid){
//                for(int x=j;x<=r;x++){
//                    list.add(nums[x]);
//                }
//            }
//            if(j==r){
//                for(int x=i;x<=l;x++){
//                    list.add(x);
//                }
//            }
        }
        while (i<=mid){
            temp[count++]=nums[i];
            i++;
        }
        while (j<=r){
            temp[count++]=nums[j];
            j++;
        }

//        for (int k = 0; k < r - l + 1; ++k) {
//            nums[k + l] = temp[k];
//        }
//        for(int x=l;x<r-l+1;x++){
//            nums[x]=temp[x];
//        }
        for (int k = 0; k < r - l + 1; ++k) {
            nums[k + l] = temp[k];
        }
    }
    public static int JumpFloor(int target) {

        if(target==1 || target==2){
            return target;
        }
        int[] num=new int[target+1];
        num[1]=1;
        num[2]=2;
        for(int i=3;i<=target;i++){
            num[i]=num[i-1]+num[i-2];
        }
        return num[target];
    }
}
