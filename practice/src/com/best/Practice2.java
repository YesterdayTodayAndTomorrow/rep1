package com.best;

public class Practice2 {
    static int i = 1;
    int n =10;
    int s = n+i;
    public static void test(){
        i = i +1;
    }

//     static {
//        i=i+1;
//    }

    public static void main(String[] args) {
        test();
        System.out.println(i);
    }
}
