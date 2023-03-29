package baekjoon.ch03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ch03_25314 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer buffer = new StringBuffer();
        int num = Integer.parseInt(br.readLine());
        int cnt = 0;

        //4의 배수가 문제라서 의미가 없음
        if (num % 4 == 0) {
            cnt = num / 4;
        }else{
            cnt = num / 4 + 1;
        }
        for (int i = 0; i < cnt; i++) {
            if(i != cnt){
                buffer.append("long").append(" ");
            }
        }
        String result = buffer.append("int").toString();
        System.out.println(result);
    }
}
