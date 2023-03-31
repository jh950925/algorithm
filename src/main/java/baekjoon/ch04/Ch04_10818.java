package baekjoon.ch04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ch04_10818 {
    public static void main(String[] args) throws  Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        int[] arrNum = new int[count];

        StringTokenizer tk = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            arrNum[i] = Integer.parseInt(tk.nextToken());
        }

        Arrays.sort(arrNum);
        int min = arrNum[0];
        int max = arrNum[count-1];
        bw.write(min+" "+max);
        bw.flush();
        bw.close();
    }//end main
}//end class
