package baekjoon.ch05;

import java.util.*;
public class Ch05_27866 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int num = sc.nextInt();

        char [] arrStr = str.toCharArray();
        System.out.println(arrStr[num - 1]);

        sc.close();
    }//end main

}//end class
