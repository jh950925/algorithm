package baekjoon.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ch01_10926 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String lastString = "??!";

        String s = br.readLine();
        System.out.println(s + lastString);
    }
}
