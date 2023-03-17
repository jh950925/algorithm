package algorithm.ch02;

import java.util.*;
public class Ex02_13 {

    static int[][] mdays = {
              {31,28,31,30,31,30,31,31,30,31,30,31} // 평년
            , {31,29,31,30,31,30,31,31,30,31,30,31} // 윤년
    };

    //서기 year년은 윤년인가? ( 윤년 : 1 평년 : 0 )
    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }// end isLeap

    //서기 y년 m 월 d일의 그 해 결과 일 수를 구함
    static int dayOfYear(int y, int m, int d) {
        int days = d;

        for (int i = 1; i < m; i++) {
            days += mdays[isLeap(y)][i-1];
        }
        return days;
    }//end dayOfYear

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int retry;

        System.out.println("그 해 경과 일수를 구합니다.");

        do {
            System.out.print("년  : ");
            int year = sc.nextInt();

            System.out.print("월  : ");
            int month = sc.nextInt();

            System.out.print("일  : ");
            int day = sc.nextInt();

            System.out.printf("그 해 %d일쨰입니다.\n", dayOfYear(year, month, day));

            System.out.println("한번 더? (예:1,아니오:2) : " );
            retry = sc.nextInt();
        } while (retry == 1);
    }//end main

}//end class
