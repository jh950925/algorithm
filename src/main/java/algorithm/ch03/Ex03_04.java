package algorithm.ch03;

import java.util.*;
public class Ex03_04 {

    static int binSearch(int[] a, int n, int key) {
        int pl = 0;
        int pr = n -1 ;

        do {
            int pc = (pl + pr) / 2; //중앙값
            if (a[pc] == key)
                return pc;
            else if (a[pc] < key)
                pl = pr + 1;
            else
                pr = pr - 1;    // 검색 범위를 앞쪽 절반으로 좁힘
        } while (pl <= pr);
        return -1;
    }//end binSearch

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = sc.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요");
        System.out.println("x[0] : ");
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]");
                x[i] = sc.nextInt();
            } while (x[i] < x[i - 1]);      // 바로 앞의 요소보다 작으면 다시 입력
        }

        System.out.print("검색할 값 : ");
        int ky = sc.nextInt();

        int idx = binSearch(x, num, ky);

        if (idx == -1) {
            System.out.println("값 없음");
        }else{
            System.out.println(ky + "는 x[" + idx + "]에 있습니다.");
        }
    }

}
