package baekjoon.ch04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ch04_5597 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> total = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 1; i <= 30; i++) {
            total.add(i);
        }
        for (int i = 0; i < 28; i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);

        total.removeAll(arr);

        for (Integer n : total) {
            System.out.println(n);
        }
    }//end main
}//end class
