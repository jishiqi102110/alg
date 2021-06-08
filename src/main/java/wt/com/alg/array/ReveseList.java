package wt.com.alg.array;

import sun.security.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReveseList {
    public static void main(String[] args){
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(4);
        Collections.reverse(list);
        System.out.println(list.toString());
        System.out.println(list.get(0));

    }
}
