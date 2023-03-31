package baekjoon.ch04;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Ch04_10871 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer tk;

        tk = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(tk.nextToken());
        int num = Integer.parseInt(tk.nextToken());

        int[] arrNum = new int[count];
        ArrayList<Integer> arrresult = new ArrayList<>();
        tk = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            arrNum[i] = Integer.parseInt(tk.nextToken());
            if (arrNum[i] < num) arrresult.add(arrNum[i]);
        }

        for (Integer n : arrresult) {
           bw.write(n + " ");
        }
        bw.flush();
        bw.close();
    }//end main
}//end class
