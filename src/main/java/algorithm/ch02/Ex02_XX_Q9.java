package algorithm.ch02;

import java.util.Scanner;

public class Ex02_XX_Q9 {

    static int[][] mdays = {
            {31,28,31,30,31,30,31,31,30,31,30,31} // 평년
            , {31,29,31,30,31,30,31,31,30,31,30,31} // 윤년
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
    }// end isLeap

    static int leftDayOYear(int y, int m, int d) {

        int days = d;

        for (int i = 1; i < m; i++) { // 1월 ~ (m-1)dnjfdml dlf tnfmf ejgka
            days += mdays[isLeap(y)][i - 1];
        }

        return 365+ isLeap(y) - days; 
        // 365는 기본으로 가져가고 -days는 오늘까지의 일수를 뺴준다. 
        // 윤년인지 평년인지 계산하기 위해서는 isLeap에 해당년을 계산하여 -0 혹은 -1을 해줘야 완성
    }

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

            System.out.printf("그 해 %d일쨰입니다.\n", leftDayOYear(year, month, day));

            System.out.println("한번 더? (예:1,아니오:2) : " );
            retry = sc.nextInt();
        } while (retry == 1);
    }
}
