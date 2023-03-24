package algorithm.ch05;

import java.util.*;

public class Factorial {
    static int factorial(int n) {
        if(n > 0) return n * factorial(n - 1);
        else return 1;
    }//end Factorial

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력 하세요 : ");
        int x = sc.nextInt();

        System.out.println(x + "와 팩토리얼은 " + factorial(x) + "입니다.");
    }//end main
}//end class
