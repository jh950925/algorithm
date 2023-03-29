package algorithm.ch06;

import java.util.Scanner;

public class Partition {

    //배열 요소 a[idx1]과 a[idx2]를 바꾼다
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    //배열을 나눈다.
    static void partition(int[] a, int n) {
        int pl = 0;
        int pr = n - 1;
        int x = a[n / 2]; // 피벗

        do{
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;
            if(pl <= pr) swap(a, pl++, pr--);
        }while(pl <= pr);

        System.out.println("피벗은 : " + x);

        System.out.println("피벗 이하의 그룹");
        for (int i = 0; i <= pl-1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        if (pl > pr + 1) {
            System.out.println("피벗과 일치하는 그룹");
            for (int i = pr + 1; i <= pl - 1; i++) { // a[pr+1] - a[pl-1]
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

        System.out.println("피벗 이상의 그룹");
        for (int i = pr + 1; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }//end partition

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열 나누기");
        System.out.print("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }
        partition(x,nx);
    }//end main
}//end class

