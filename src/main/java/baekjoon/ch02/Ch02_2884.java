package baekjoon.ch02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ch02_2884 {
    public static void main(String[] args)  throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(br.readLine());

        int T = 45;

        int H = Integer.parseInt(tk.nextToken());
        int M = Integer.parseInt(tk.nextToken());
        if (H <= 23 && M <= 59) {
            if (M < 45) {
                if(H == 0){
                    H = 23;
                    M = 60 + M - T;
                }else{
                    H = H - 1;
                    M = 60 + M - T;
                }
            }else{
                M = M - T;
            }
        }//end if
        System.out.println(H + " " + M);
    }
}
