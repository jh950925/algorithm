package baekjoon.ch03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ch03_25304 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalPrice = Integer.parseInt(br.readLine());
        int totalcnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < totalcnt; i++) {
            StringTokenizer tk = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(tk.nextToken());
            int cnt = Integer.parseInt(tk.nextToken());
            totalPrice -= price * cnt;
        }
        if (totalPrice == 0) {
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
