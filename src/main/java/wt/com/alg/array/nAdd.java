package wt.com.alg.array;

import java.util.ArrayList;
import java.util.Arrays;

//给出一个有n个元素的数组S，S中是否有元素a,b,c满足a+b+c=0？找出数组S中所有满足条件的三元组。
//注意：
//三元组（a、b、c）中的元素必须按非降序排列。（即a≤b≤c）
//解集中不能包含重复的三元组。
public class nAdd {
    public static  ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> Tlist=new ArrayList<ArrayList<Integer>>();
        //先对数据进行冒泡排序，然后再进行处理
        if(num.length<3){
            return Tlist;
        }
        if (num == null) {
            return Tlist;
        }
        Arrays.sort(num);
        //利用双索引，无线夹击
        for(int i=0;i< num.length-2;i++){
            int left=i+1;
            int right= num.length-1;
            while (left<right){
                if(num[i]+num[left]+num[right]==0){
                    ArrayList<Integer>  list=new ArrayList<Integer>();
                    list.add(num[i]);
                    list.add(num[left]);
                    list.add(num[right]);
                    left++;
                    right--;
                    while (left < right && num[left] == num[left - 1]) {
                        left++;
                    }
                    while (left < right && num[right] == num[right + 1]) {
                        right--;
                    }
                }else if(num[left]+num[right]+num[i]<0){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return Tlist;
    }
    public static void main(String[] args) {
        int[] array = new int[]{1, 2,-3, 4, 7, 9, 1};
        System.out.println(threeSum(array));
    }
}
