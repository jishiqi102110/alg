package wt.com.alg.digui;

import java.util.Arrays;

public class Fibnac {
    public static void main(String[] args) {
        System.out.println(Fibonacci(10));
        System.out.println(Fibonacci2(10));
        System.out.println(Fibonacci3(10));

    }
    public static int Fibonacci(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        int result=0;
        int pre=0;
        int second=1;
        for(int i=2;i<=n;i++){
            int temp=pre+second;
//            if(i==n){
//               result=temp;
//            }
            pre=second;
            second=temp;
        }
        return second;
    }

    public static int Fibonacci2(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        return Fibonacci2(n-1)+Fibonacci2(n-2);
    }
    static int[] memo=new int[11];
    static {
        Arrays.fill(memo,-1);
    }
    public static int Fibonacci3(int n) {
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        if(memo[n]!=-1) return  memo[n];
        int r=Fibonacci3(n-1)+Fibonacci3(n-2);
        memo[n]=r;
        return r;
    }
}
