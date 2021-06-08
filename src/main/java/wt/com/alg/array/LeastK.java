package wt.com.alg.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//找出最少的k个数
public class LeastK {
    public static void main(String[] args) {
        int[] array = new int[]{4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution(array,4));
    }
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList list=new ArrayList<Integer>();
        if(k>input.length || input.length==0){
            return list;
        }
        for(int l=0;l<k;l++){
            for(int i=0;i<input.length;i++){
                for(int j=i+1;j<input.length;j++){
                    if(input[j]<input[i]){
                        int temp=input[i];
                        input[i]=input[j];
                        input[j]=temp;
                    }
                }
            }
            list.add(input[l]);
        }
        System.out.println(Arrays.toString(input));
        return list;
    }
}
