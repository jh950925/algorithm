package algorithm.ch03;

import java.util.*;
public class Ex03_01 {

    static int seqSearh(int[] a, int n, int key) {
        int i=0;

        while (true) {
            if(i == n)
                return -1; //검색 실패
            if(a[i] == key)
                return i;  //검색 성공
            i++;
        }
    }//end  seqSearh

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("X[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = sc.nextInt();

        int idx = seqSearh(x, num, ky); // 배열 x에서 키 값이 ky인 요소를 검색

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        }else{
            System.out.println(ky + "는 x[" + idx + "]에 있습니다.");
        }

    }//end main

}
