package baekjoon.ch03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ch03_10952 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer buffer = new StringBuffer();

        while (true) {
            StringTokenizer tk = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(tk.nextToken());
            int num2 = Integer.parseInt(tk.nextToken());
            if (num1 == 0 && num2 == 0) {
                break;
            }else{
                buffer.append(num1 + num2).append("\n");
            }
        }//end while
        bw.write(buffer.toString());
        bw.flush();
        bw.close();
    }
}
