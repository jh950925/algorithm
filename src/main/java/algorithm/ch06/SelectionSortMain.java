package algorithm.ch06;

import java.util.*;

public class SelectionSortMain {

    //a[idx1]와 a[idx2]의 값을 바꾼다.
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }//end swap

    //단순 선택 정렬
    static void selectionSort(int[]a, int n){
        for (int i = 0; i < n - 1; i++) {
            int min = i;        // 아직 정령되지 않은 부분에서 가장 작은 요소의 인덱스를 가져온다.
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            swap(a, i, min);    // 아직 병렬되지 않은 부분의 첫 요소와 가장 작은 요소를 교환한다.
        }
    }

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

        selectionSort(x, nx);

        System.out.println("오름차순으로 정렬 완료");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }
    }//end main

}

