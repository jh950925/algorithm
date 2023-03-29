package baekjoon.ch03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Ch03_10951 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuffer buffer = new StringBuffer();
        String str;

        while ((str = br.readLine()) != null) {
            StringTokenizer tk = new StringTokenizer(str," ");
            int num1 = Integer.parseInt(tk.nextToken());
            int num2 = Integer.parseInt(tk.nextToken());

            buffer.append(num1 + num2).append("\n");
        }//end while
        bw.write(buffer.toString());
        bw.flush();
        bw.close();
    }
}
