package algorithm.ch05;


import algorithm.ch04.IntStack;

import java.util.Scanner;

public class Recur {
    //재귀 함수
    static void recur(int n) {
        /*
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
         */
        //고리 재귀의 제거
        /*
        while (n > 0) {
            recur(n - 1);
            System.out.println(n);
            n = n - 2;
        }
        */
        // 재귀의 제거
        IntStack s = new IntStack(n);

        while (true) {
            if (n > 0) {
                s.push(n);          // n 값을 푸뷔
                n = n - 1;
                continue;
            }
            if (s.isEmpty() != true) {      //스택이 비어 있지 않다면
                n = s.pop();                // 저장하고 있던 스택의 값을 팝
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }
    }//end recur

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = sc.nextInt();

        recur(x);
    }//end main
}//end class
