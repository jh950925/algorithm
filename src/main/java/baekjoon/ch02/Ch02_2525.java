package baekjoon.ch02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ch02_2525 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(tk.nextToken()); //시
        int M = Integer.parseInt(tk.nextToken()); //분
        int T = Integer.parseInt(br.readLine());  //요리에 걸리는 시간

        int tmpMin = 60 * H + M;
        int tmp = tmpMin + T;

        int hour = (tmp / 60) % 24;
        //%해주는 이유는 24시 일때는 0으로 치완시켜주기 때문
        int minute = tmp % 60;

        System.out.println(hour + " " + minute);
    }//end main
}//end class
