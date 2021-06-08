package wt.com.alg.array;

import sun.security.util.ArrayUtil;

import java.util.*;

//给出一个整数数组，请在数组中找出两个加起来等于目标值的数，
//你给出的函数twoSum 需要返回这两个数字的下标（index1，index2），需要满足 index1 小于index2.。注意：下标是从1开始的
//假设给出的数组中只存在唯一解
//例如：
//给出的数组为 {20, 70, 110, 150},目标值为90
//输出 index1=1, index2=2
public class NunmAdd {
    public static void main(String[] args) {
        int[] array = new int[]{3,2,4};
        System.out.println(Arrays.toString(twoSum(array,6)));

    }
    public  static int[] twoSum (int[] numbers, int target) {
        // write code here


        int[] res=new int[2];
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<numbers.length;i++){
           if(!map.containsKey(target-numbers[i])){
               map.put(target-numbers[i],i);
           }else{
               res[0]=map.get(target-numbers[i])+1;
               res[1]=i+1;
           }
        }
        return res;
    }
}
