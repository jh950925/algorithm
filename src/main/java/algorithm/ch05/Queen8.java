package algorithm.ch05;

public class Queen8 {
    static int[] pos = new int[8]; //각 열의 퀸의 위치

    // 각 열의 퀸의 위치를 출력
    static void print() {
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2d", pos[i]);
        }
        System.out.println();
    }//end print

    // i열에 퀸을 놓는다.
    static void set(int i) {                // 열
        for (int j = 0; j < 8; j++) {       // 행
            pos[i] = j;             // 퀸을 j행에 배치
            if (i == 7) {           // 모든 열에 배치
                print();
            } else {
                set(i + 1); // 다음열에 퀸을 배치
            }
        }
    }//end set

    public static void main(String[] args) {
        set(0);     // 첫 퀸 배치
    }//end main

}//end class
