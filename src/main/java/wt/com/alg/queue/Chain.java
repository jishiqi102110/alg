package wt.com.alg.queue;

import java.awt.List;
import java.util.*;

public class Chain {
    public static void main(String[] args) {
        reorderList();
    }
    public static void reorderList() {
        //将链表数据保存到一个数组中，最后根据规律，调换位置，最后再遍历数组，构造链表
        LinkedList<Integer> list=new LinkedList<Integer>();
//        while(head!=null){
//            list.add(head.val);
//            head=head.next;
//        }
        list.add(10);
        list.add(20);
        list.add(30); list.add(40);



        LinkedList<Integer> list2=new LinkedList<>(list);
        Collections.reverse(list);
        System.out.println(list2);
        System.out.println(list);


        LinkedList<Integer> list3=new LinkedList<Integer>();
        int j=0;
        int k=0;
        for(int i=0;i<list.size();i++){
            if(i%2 ==0){
                list3.add(list2.get(j++));
            }else if(i%2==1){
                list3.add(list.get(k++));
            }
        }

        System.out.println(list3);

        //这里 根据下标 规律，替换就可以 if i%2==0 不变 i%2==1 a[i] 替换成 a[i+n-1]

    }
}
