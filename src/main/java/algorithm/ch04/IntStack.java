package algorithm.ch04;

public class IntStack {
    private int max;
    private int ptr;
    private int[] stk;

    //실행 시 예외 : 스택이 비어있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException(){

        }
    }

    //실행 시 예외 : 스택이 가측 참
    public class OverflowIntStackException extends RuntimeException {
        public OverflowIntStackException() {

        }
    }

    //생성자
    public IntStack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = new int[max]; //스택 본체용 배열을 생성
        } catch (OutOfMemoryError e) { //생성할 수 없음
            max = 0;
        }
    }

    //데이터 넣어주기 push
    public int push(int x) throws IntStack.OverflowIntStackException{
        if (ptr >= max) {
            throw new OverflowIntStackException();
        }
        return stk[ptr++] = x;
    }

    //맨 마지막에 넣은 데이터부터 제거하고 반환하기 pop
    public int pop() throws EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[--ptr];
    }

    //pop과 다르게 지우지 않고 반호나만 해주기 -> 데이터 변화는 없음
    public int peek() throws  EmptyIntStackException {
        if (ptr <= 0) {
            throw new EmptyIntStackException();
        }
        return stk[ptr - 1];
    }

    // 검색
    public int indxOf(int x) {
        for (int i = ptr - 1; i >= 0; i--) { //정상 쪽에서 선형 검색
            if (stk[i] == x) {
                return i;
            }
        }//end for
        return -1;
    }

    //스택을 비움
    public void clear() {
        ptr = 0;
    }

    //스택의 용량을 반환
    public int capacity() {
        return max;
    }

    //스택에 쌓여 있는 데이터 수출 반환
    public int size() {
        return ptr;
    }

    //스택이 비어 있는가?
    public boolean isEmpty() {
        return ptr <= 0;
    }


    //스택이 가득 찾는가?
    public boolean isFull() {
        return ptr >= max;
    }

    //스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
    public void dump() {
        if (ptr <= 0) {
            System.out.println("스택이 비어 있습니다.");
        } else {
            for (int i = 0; i < ptr; i++) {
                System.out.print(stk[i] + " ");
            }
            System.out.println();
        }
    }

}
