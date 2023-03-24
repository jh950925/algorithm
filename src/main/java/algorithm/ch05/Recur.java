package algorithm.ch05;


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
        while (n > 0) {
            recur(n - 1);
            System.out.println(n);
            n = n - 2;
        }
    }//end recur

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = sc.nextInt();

        recur(x);
    }//end main
}//end class
