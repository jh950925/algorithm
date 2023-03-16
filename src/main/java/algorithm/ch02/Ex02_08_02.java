package algorithm.ch02;

import java.util.*;

public class Ex02_08_02 {
    static int cardConvR(int x, int y ,char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCD";

        do{
            d[digits++] = dchar.charAt(x % y);
            x /= y;
        }while (x != 0);
        return digits;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int no,cd,dno,retry;
        char[] cno = new char[32];

        System.out.println("10진수 변환");
        do {
            do {
                System.out.print("음이 아닌 정수 : ");
                no = sc.nextInt();
            } while (no < 0);

            do {
                System.out.print("어떤 진수로 변환 ? (2~36) : ");
                cd = sc.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConvR(no, cd, cno);
            System.out.println(cd + "진수로는 ");
            for (int i = dno - 1; i >= 0; i--) {
                System.out.print(cno[i]);
            }
            System.out.println("입니다.");

            System.out.print("한번 더 할까요? (1.예 / 2. 아니요) : ");
            retry = sc.nextInt();
        } while (retry == 1);
    }
}
