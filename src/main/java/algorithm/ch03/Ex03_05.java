package algorithm.ch03;

import java.util.*;

public class Ex03_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순 정렬");

        System.out.print("x[0] : ");
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = sc.nextInt();
            } while (x[i] < x[i-1]); //바로 앞의 요소보다 작으면 다시 입력한다.
        }
        System.out.print("검색할 값 : ");
        int ky = sc.nextInt();

        int idx = Arrays.binarySearch(x, ky); // 배열 x에서 키 값이 ky인 요소를 검색

        if (idx < 0) {
            // 메서드에 보내준 ky값에 -가 붙어서 나옴
            System.out.println("그 값의 요소가 없습니다. (" + idx + ")");
        }else{
            System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
        }

    }//end main
}//end class
