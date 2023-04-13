package algorithm.ch06;

import java.util.Scanner;

public class BubbleSort_2 {

    //a[idx1]와 a[idx2]의 값을 바꾼다.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }//end swap

    //버블정렬_2
    static void buubleSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int exchg = 0;          // 패스의 교환 횟수를 기록
            for (int j = n - 1; j > i; j--){
                if (a[j - 1] > a[j]) {
                    swap(a, j - 01, j);
                    exchg++;;
                }
                if(exchg == 0) break;
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

