package wt.com.alg.array;


//请实现有重复数字的升序数组的二分查找
//给定一个 元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1
public class devideFind  {

    public static void main(String[] args) {
        int[] arr=new int[]{1,2,4,4,5};
        System.out.println(search(arr,4));
    }

    public static int search (int[] nums, int target) {
        // write code here
        int cur=-1;
        int left=0;
        if(nums==null||nums.length==0){
            return -1;
        }
        int right=nums.length;

        while (left<right){
            int m=(left+right)/2;
            if(nums[m]== target){
                return m;
            }else if(nums[m]<target){
                left=m+1;
            }else if(nums[m]>target){
                right=m-1;
            }
        }
        if(nums[left]==target){
            cur=left;
        }
        return cur;
    }
    public int solve (int[] a) {
        // write code here
      int cur=-1;

      int left=0;
      int right=a.length;
      while (left<right){
          int mid=(left+right)/2;
          if(a[mid]>mid){
              right=mid-1;
          }else if(a[mid]<mid){
              left=mid+1;
          }else{
              left=mid;
          }
      }
      return left;
    }

}
