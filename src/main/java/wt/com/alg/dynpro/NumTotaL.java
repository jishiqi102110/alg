package wt.com.alg.dynpro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumTotaL {
    public static void main(String[] args) {
        int[] array=new int[]{-1,2,-1,3};
        System.out.println(getArray(array));
    }
    public static int getArray(int[] nums){
        if(nums.length==1){
            return nums[0];
        }
        int maxValue=nums[0];
        int[] dp=new int[nums.length];
        dp[0]=maxValue;
        for(int i=1;i<nums.length;i++){
            dp[i]=Math.max(nums[i],dp[i-1]+nums[i]);
            maxValue=Math.max(maxValue,dp[i]);
        }

        return maxValue;
    }
}
