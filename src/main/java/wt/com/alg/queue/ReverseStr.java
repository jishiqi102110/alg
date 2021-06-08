package wt.com.alg.queue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseStr {
    public static void main(String[] args) {
        String s="12334451";
        System.out.println(solve(s));

        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        List<Integer> list2=list;
        Collections.reverse(list);


        System.out.println(list);
        System.out.println(list2);
        int[] arr1=new int[]{1,2,3,0,0};
        int[] arr2=new int[]{4,5};
        System.arraycopy(arr2,0,arr1,3,2);
        System.out.println(Arrays.toString(arr1));
    }
    public static String solve (String str) {
        // write code here
        //
        char[] chars=str.toCharArray();
        for(int i=0;i<=(chars.length)/2;i++){
            char temp=chars[i];
            chars[i]=chars[chars.length-i-1];
            chars[chars.length-i-1]=temp;
        }
        return  String.copyValueOf(chars);
    }
}
