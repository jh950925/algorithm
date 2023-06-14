package baekjoon.ch05;

import java.util.*;

public class Ch05_9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = sc.nextInt();
        String[] arrStr = new String[count];
        for (int i = 0; i < arrStr.length; i++) {
            arrStr[i] = sc.next();
        }

        for (int i = 0; i < arrStr.length; i++) {
            System.out.print(arrStr[i].charAt(0));
            System.out.print(arrStr[i].charAt(arrStr[i].length()-1));
            System.out.println();
        }

        sc.close();
    }
}
