package algorithm.ch06;

import java.util.Scanner;

public class BubbleSort_3 {

    //a[idx1]와 a[idx2]의 값을 바꾼다.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }//end swap

    //버블정렬_2
    static void buubleSort(int[] a, int n) {
        int k = 0;  // a[k]보다 앞쪽은 정렬을 마친 상태
        while (k < n - 1) {
            int last = n-1; // 마지막으로 요소를 교환한 위치
            for (int j = n - 1; j > k; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                    last = j;
                }
                k = last;
            }
        }

    }//end buubleSort

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("버플 정렬[버전1]");
        System.out.print("요솟수 : ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        buubleSort(x, nx);

        System.out.println("오름차순으로 정렬 완료");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }
    }//end main

}


