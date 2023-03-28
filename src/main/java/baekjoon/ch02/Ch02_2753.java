package baekjoon.ch02;

import java.util.Scanner;

public class Ch02_2753 {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int result;

        //연도가 4의 배수이면서, 100의 배수가 아닐때 또는 400의 배수
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
            result = 1;
        else
            result = 0;
        System.out.println(result);
    }
}
