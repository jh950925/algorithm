package baekjoon.ch03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ch03_2439 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 1; i <= count; ++i) {
            for (int j = 1; j <= count - i; ++j) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; ++k) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
