package algorithm.ch04;

public class IntQueue { 
    private int max;        // 큐 용량
    private int front;      // 첫 번재 요소 커서
    private int rear;       // 마지막 요소 커서
    private int num;        // 현재 데이터 수
    private int[] que;      // 큐 본체

    //실행 시 예외 : 큐가 비어있음
    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {  }
    }

    //실행 시 예외 : 큐가 가득 참
    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException () {  }
    }

    //생성자
    public IntQueue(int capacity) {
        num = front = rear = 0; 
        max = capacity;
        try {
            que = new int[max]; // 큐 본체용 배열을 생성
        } catch (OutOfMemoryError e) { //생성할 수 없음
            max =  0;
        }
    }//end IntQueue

    //인큐
    public int enque(int x) throws  OverflowIntQueueException {
        if (num >= max) throw new OverflowIntQueueException();

        que[rear++] = x;
        num++;

        // 만약 인큐 후 rear가 max에서 초기화 했던 값과 동일 할 경우를 대비하여
        // 같을 경우 0으로 초기화해준다.
        if(rear == max) rear = 0;

        return x;
    }//end enque

    //디큐
    public int deque() throws EmptyIntQueueException {
        if(num <= 0 ) throw new EmptyIntQueueException();

        int x = que[front++];
        num--;

        if(front == max) front =0;

        return x;
    }//end deque

    //큐에서 데이터를 피크(프론트 데이터를 들여다봄)
    public int peek() throws EmptyIntQueueException {
        if (num <= 0) throw new EmptyIntQueueException(); //큐가 비어있음

        return que[front];
    }//end peek

    //큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % max;
            if(que[idx] == x) return idx; //검색 성송
        }
        return -1;
    }//end indexOf

    //큐를 비움
    public void clear(){
        num = front = rear = 0;
    }

    // 큐의 용량을 반환
    public int capacity() {
        return max;
    }

    //큐에 쌓여 있는 데이터 수를 반환
    public int size() {
        return num;
    }

    //큐가 비어 있나요?
    public boolean isEmpty() {
        return num <= 0;
    }

    //큐가 가득 찼나요?
    public boolean isFull() {
        return num >= max;
    }

    //큐 안의 모든 데이터를 프런트 -> 리어 순으로 출력
    public void dump() {
        if (num <= 0) {
            System.out.println("큐가 비어 있습니다.");
        }else{
            for (int i = 0; i < num; i++) {
                System.out.print(que[(i+front) % max] + " " );
            }
            System.out.println();
        }
    }

}
