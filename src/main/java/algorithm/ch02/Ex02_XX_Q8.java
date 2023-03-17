package algorithm.ch02;

import java.util.Scanner;

public class Ex02_XX_Q8 {
    /**
     * 메서드 dayOfYear를 변수 i와 days 없익 구현하고 while문 사용.
     **/
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

        while(--m !=0){ //받아온 월 기준 --해주고 0이 아닐때까지 -->> 1월이 마지막
            d += mdays[isLeap(y)][m - 1];   // 받아온 날짜에 다시 더해줄껀데 윤년 평년 계산하여 배열값 설정
        }

        return d;
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
}
