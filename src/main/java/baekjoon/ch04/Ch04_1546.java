package baekjoon.ch04;

import java.util.Scanner;

public class Ch04_1546 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arrScores = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            arrScores[i] = sc.nextInt();
            if (arrScores[i] > max) {
                max = arrScores[i];
            }
        }

        double[] ArrResult = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            ArrResult[i] = (double) arrScores[i] / max * 100;
            sum += ArrResult[i];
        }

        double Avg = sum / n;
        System.out.println(Avg);

        sc.close();
    }//end main
}//end class
