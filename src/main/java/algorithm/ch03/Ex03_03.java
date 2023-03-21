package algorithm.ch03;

import java.util.*;

public class Ex03_03 {
    static int seqSearchSen(int[] a, int n, int key) {
        int i=0;

        a[n] = key; //보초를 추가

        while (true) {
            if (a[i] == key) {
                break;
            }
            i++;
        }
        return i == n ? -1: i;
    }//end seqSearchSen

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num + 1];         // 요솟수 num + 1

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        System.out.print("검사할 값 : "); //키 값
        int ky = sc.nextInt();

        int idx = seqSearchSen(x, num, ky);

        if (idx == 1) {
            System.out.println("그 값의 요소가 없습니다.");
        } else {
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
        }

    }//end main

}
