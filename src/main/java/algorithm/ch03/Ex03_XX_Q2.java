package algorithm.ch03;

import java.util.Scanner;

public class Ex03_XX_Q2 {

    static int scanArr(int [] arrNum, int num, int key) {
        // 검색하는 총 갯수
        System.out.print("   |");
        for (int i = 0; i < num; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();

        System.out.print("---+");
        for (int k = 0; k < 4 * num + 2; k++)
            System.out.print("-");
        System.out.println();

        for (int i = 0; i < num; i++) {
            System.out.print("   |");
            System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");
            System.out.printf("%3d|", i);
            for (int k = 0; k < num; k++)
                System.out.printf("%4d", arrNum[k]);
            System.out.println("\n   |");
            if (arrNum[i] == key)
                return i; // 검색성공
        }
        return -1; // 검색실패
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("요솟수 입력 : ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("arr[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("찾는 값 : ");
        int ky = sc.nextInt();

        int result = scanArr(arr, num, ky);
//        System.out.println("result : " + result);


        if(result == -1)
            System.out.println("검색번호 없음");
        else
            System.out.println("그 값은 x[" + result + "]에 있습니다.");
    }//end main
}//end class
