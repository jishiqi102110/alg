package wt.com.alg.queue;

import java.util.*;

public class LRU_size {

    private static List<Integer> queue = new LinkedList<Integer>();
    private static Map<Integer, Integer> keyValueMap = new HashMap<Integer, Integer>();



    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 1, 1}, {1, 2, 2}, {1, 3, 2}, {2, 1}, {1, 4, 4}, {2, 2}};
        int[] res = LRU(array, 3);
        LinkedHashMap<Integer,Integer> lruMap = new LinkedHashMap<Integer,Integer>();

        Iterator iter=keyValueMap.keySet().iterator();
        Iterator it = keyValueMap.keySet().iterator();


        System.out.println(Arrays.toString(res));
    }

    public static int[] LRU(int[][] operators, int k) {
        // write code here
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < operators.length; i++) {
            int[] op = operators[i];
            if (op[0] == 1) {
                //判断如果存在key，删除key再插入
                while (list.size()>k){
                    list.remove(0);
                    keyValueMap.remove(op[1]);
                }
                list.add(op[1]);
                keyValueMap.put(op[1],op[2]);
            } else {
                get(op[1]);
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static void set(int key, int value) {
        if (keyValueMap.containsKey(key)) {
            queue.remove(queue.indexOf(key));
            keyValueMap.remove(key);
        }
        queue.add(key);
        keyValueMap.put(key, value);
    }

    public static int get(int key) {
        if (keyValueMap.containsKey(key)) {
            queue.remove(queue.indexOf(key));
            queue.add(key);
            return keyValueMap.get(key);
        } else {
            return -1;
        }
    }

}
