package algorithm.ch06;

import algorithm.ch04.IntStack;

import java.util.Scanner;

public class QuiclSort2 {

    //배열 요소 a[idx1]과 a[idx2]를 바꾼다
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    /** 퀵정렬(비재귀 버전) **/
    static void quickSort(int [] a, int left, int right){

        /** 스택의 생성 **/
        IntStack lsStack = new IntStack(right - left + 1);
        IntStack rsStack = new IntStack(right - left + 1);

        lsStack.push(left);
        rsStack.push(right);

        while (lsStack.isEmpty() != true) {
            int pl = left = lsStack.pop();      // 왼쪽 커서
            int pr = right = rsStack.pop();     // 오른쪽 커서
            int x = a[(left + right) / 2];      // 피벗
            do{
                while (a[pl] < x) pl++;
                while (a[pr] > x) pr--;
                if(pl <= pr) swap(a, pl++, pr--);
            }while(pl <= pr);

            if (left < pr) {
                lsStack.push(left); //왼쪽 그룹 범위의
                rsStack.push(pr);   //인덱스를 푸쉬한다.
            }

            if (pl < right) {
                lsStack.push(pl);       //오른쪽 그룹 범위의
                rsStack.push(right);    // 인덱스를 푸쉬
            }
        }
    }

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

        quickSort(x, 0, nx - 1); // 배열 x를 퀵 정렬

        System.out.println("오름차순으로 정렬");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] : " + x[i]);
        }
    }
}
