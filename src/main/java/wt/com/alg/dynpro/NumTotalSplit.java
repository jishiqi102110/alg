package wt.com.alg.dynpro;

import java.util.Arrays;

public class NumTotalSplit {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,1,3};
        System.out.println(getTotal(array));
    }
    public static int getTotal(int[] nums){
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return nums[0];
        }
        int max=Math.max(nums[0],nums[1]);
        int[] total=new int[nums.length];
        total[0]=nums[0];
        total[1]=max;
        for(int i=2;i<nums.length;i++){
            total[i]=Math.max(total[i-1],nums[i]+nums[i-2]);
            max=total[i];
        }
        return max;
    }
}
