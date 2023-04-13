package baekjoon.ch04;

import java.util.Arrays;
import java.util.Scanner;

public class Ch04_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int result = 1;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt() % 42;
        }

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result++;
            }
        }
        System.out.println(result);
    }//end main
}//end class
