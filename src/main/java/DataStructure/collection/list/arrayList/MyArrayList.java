package DataStructure.collection.list.arrayList;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {

    private int size;
    private T[] elements;
    private static final int DEFAULT_SIZE = 50;

    /**
     * 생성자 주입
     * @param size, 배열의 elements
     * @param elements
     */
    public MyArrayList(int size, T[] elements) {
        this.size = size;       // 배열 크기
        this.elements = (T[]) new Object[DEFAULT_SIZE]; // static으로 선언한 공간 50의 배열
    }

    /**
     * ArrayList에 배열 elements 추가
     * @param t 
     */
    @Override
    public void add(T t) {
        if(this.size == this.elements.length) {
            this.elements = Arrays.copyOf(this.elements, this.size() * 2);
        }
        this.elements[this.size++] = t;
    }

    /**
     * 배열 elements 공간 하나씩 밀면서 insert
     * @param index
     * @param t
     */
    @Override
    public void insert(int index, T t) {
        for (int i = index; i < this.size; i++) {
            this.elements[i + 1] = this.elements[i];
        }
        this.elements[index] = t;
        this.size++;
    }

    /**
     *  리스트 초기화
     */
    @Override
    public void clear() {
        this.size = 0;
        this.elements = (T[]) new Object[DEFAULT_SIZE];
    }

    /**
     * elements 값을 받아 삭제
     * @param t 
     * @return boolean
     */
    @Override
    public boolean delete(T t) {
        for (int i = 0; i < this.size; i++) { // 리스트안의 모든 원소를 반복하며 
            if (this.elements[i].equals(t)) { // 해당 원소 찾기
                for(int j=1; j<this.size-1; j++) {
                    this.elements[j] = this.elements[j + 1];
                }
                this.size--;
                return true;
            }
        }
        return false;
    }

    /**
     * 해당 index 내용 삭제 이후 size--
     * @param index
     * @return boolean
     */
    @Override
    public boolean deleteByIndex(int index) {
        if (index < 0 || index > this.size - 1) {
            return false;
        }

        for(int i=index; i<this.size-1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
        return true;
    }

    /**
     * 받아온 T 타입의 list에서 index에 해당하는 value를 출력
     * @param index
     * @return T
     */
    @Override
    public T get(int index) {
        if (index < 0 || index > this.size - 1) {
            throw new IndexOutOfBoundsException();
        }
        return this.elements[index];
    }

    /**
     * 파라미터로 받아온 데이터가 elements와 일치한다면 index 반환
     * @param t
     * @return int
     */
    @Override
    public int indexOf(T t) {
        for (int i = 0; i < this.size ;i++) {
            if(this.elements[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 리스트가 비어있다면 0 비어있지 않다면 1
     * @return
     */
    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * 리스트를 순회하면서 인자로 받아온 데이터가 해당 리스트 안의 원소인지 판별
     * @param t 
     * @return boolean
     */
    @Override
    public boolean contains(T t) {
        for (int i = 0; i < this.size; i++) {
            if (this.elements[i].equals(t)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 사이즈 리턴
     * @return int
     */
    @Override
    public int size() {
        return this.size;
    }
}
