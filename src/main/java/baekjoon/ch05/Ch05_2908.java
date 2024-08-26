package baekjoon.ch05;

import java.util.Scanner;

public class Ch05_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        int reversedNum1 = reverseNumber(num1);
        int reversedNum2 = reverseNumber(num2);

        int result = Math.max(reversedNum1, reversedNum2);

        System.out.println(result);

        sc.close();
    }

    private static int reverseNumber(int num) {
        int reversedNum = 0;
        while (num > 0) {
            reversedNum = reversedNum * 10 + num % 10;
            num /= 10;
        }
        return reversedNum;
    }
}
