package algorithm.ch06;

import java.util.Scanner;

public class ShellSort {
    //셸 정렬
    static void shellSort(int[] a, int n) {
        for (int h = n / 2; h > 0; h /= 2) {
            for (int i = h; i < n; i++) {
                int j;
                int tmp = a[i];
                for (j = i - h; j >= 0 && a[j] > tmp; j -= h) {
                    a[j + h] = a[j];
                }
                a[j + h] = tmp;
            }
        }
    }//end shellSort

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /** 1 **/
        System.out.println("셸정렬");
        System.out.print("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        shellSort(x, nx);

        System.out.println("오름차순으로 정렬하기");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }
    }//end main

}//end class
