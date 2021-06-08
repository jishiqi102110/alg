package com.wt.test;

import java.lang.reflect.Array;
import java.util.*;

public class TestArray {

    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        set.add("1");
        System.out.println(set);

        int[] a = new int[]{1, 2, 3};
        System.out.println(a);

        LinkedHashMap<Integer,Integer> lruMap = new LinkedHashMap<Integer,Integer>();
        lruMap.put(1,2);
        lruMap.put(2,3);
        Iterator iter=lruMap.keySet().iterator();
        System.out.println(iter.next());
        Stack stack=new Stack<Integer>();
        stack.isEmpty();
    }
}
