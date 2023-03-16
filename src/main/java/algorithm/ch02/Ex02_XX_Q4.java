package algorithm.ch02;

import java.util.*;

public class Ex02_XX_Q4 {

    static void copy(int [] a, int[] b) {

        if (a.length != b.length) {
            System.out.println("XXX");
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if(a[i] != b[i]){
                System.out.println("XXX");
                return;
            }
        }
        System.out.println("OOO");
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1,2, 3};

        copy(a,b);
    }
}
