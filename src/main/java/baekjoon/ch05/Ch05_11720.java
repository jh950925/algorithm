package baekjoon.ch05;

import java.util.Scanner;
public class Ch05_11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        String str = sc.next();

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            result += str.charAt(i) - '0';
        }


        System.out.println(result);
        sc.close();
    }
}
