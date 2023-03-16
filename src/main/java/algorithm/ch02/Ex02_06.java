package algorithm.ch02;

import java.util.*;

public class Ex02_06 {
    // 배열 요소 a[idx1] a[idx2] 변경
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    //배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a) {
        for (int i = 0; i < a.length/2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("스캔 : ");
        int num = sc.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("X[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        reverse(x);

        System.out.println("역순");
        for (int i = 0; i < num; i++) {
            System.out.println("X[" + i + "] : " + x[i]);
        }
    }
}
