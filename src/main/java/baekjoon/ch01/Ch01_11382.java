package baekjoon.ch01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Ch01_11382 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

//        long a = Long.parseLong(tk.nextToken());
//        long b = Long.parseLong(tk.nextToken());
//        long c = Long.parseLong(tk.nextToken());

        /**
         * 첫 번째 줄에 A, B, C (1 ≤ A, B, C ≤ 10의 12제곱)이 공백을 사이에 두고 주어진다. -> int형 불가
         * **/
        int a = Integer.parseInt(tk.nextToken());
        int b = Integer.parseInt(tk.nextToken());
        int c = Integer.parseInt(tk.nextToken());

        System.out.println(a + b + c);

    }
}
