package algorithm.ch05;

public class Queen8B {

    static boolean[] flag = new boolean[8]; // 각 행의 퀸을 배치했는지 체크
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
            if(flag[j] == false){ // J행에 배치 안했을 경우
                pos[i] = j;
                if (i == 7) {
                    print();
                }else{
                    flag[j] = true;
                    set(i + 1);
                    flag[j] = false;
                }
            }
        }
    }//end set

    public static void main(String[] args) {
        set(0);     // 첫 퀸 배치
    }//end main

}//end class