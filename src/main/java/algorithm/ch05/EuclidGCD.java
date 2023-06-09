package algorithm.ch05;

import java.util.*;

public class EuclidGCD {
    static int gcd(int x, int y){
        if(y == 0) return x;
        else return gcd(y, x % y);
    }//end gcd

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 정수의 최대 공약수를 구합니다.");
        System.out.print("정수를 입력하세요 : ");
        int x = sc.nextInt();
        System.out.print("정수를 입력하세요 : ");
        int y = sc.nextInt();

        System.out.println("최대 공약수는 : " + gcd(x,y));
    }//end main
}//end class
