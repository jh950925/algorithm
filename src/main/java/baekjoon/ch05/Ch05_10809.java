package baekjoon.ch05;

import java.util.Scanner;

public class Ch05_10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        // 비교할 수 있는 a~z의 배열이필요
        //97~122
        for (int i = 97; i <= 122; i++) {
            char ch = (char) i;
            // 문자열은 받아왔으니 위에서 받은 배열 기준해서 문자열의 각각의 문자가 포함되어 있는지 확인
            int num = s.indexOf(ch);

            // 만약 해당 문자가 문자열에 존재한다면 그 위치 확인
            System.out.print(num + " ");
        }
    }
}
