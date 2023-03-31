package baekjoon.ch04;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Ch04_10807 {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];


        StringTokenizer tk = new StringTokenizer(br.readLine());

        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(tk.nextToken());
        }
        int result = 0;
        int chkNum = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            if (arr[i] == chkNum) {
                result++;
            }
        }
        System.out.println(result);

    }//end main
}//end class
