package DataStructure.collection.list.arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        // Integer 객체만 사용해서 ArrayList 생성
        ArrayList<Integer> testArrayList1 = new ArrayList<>();
        // 초기 용량 지정 -> 4
        ArrayList<Integer> testArrayList2 = new ArrayList<>(4);
        // 초기 생성시 배열을 지정해서 선언
        Integer[] arr = {1,2,3,4};
        ArrayList<Integer> testArrayList3 = new ArrayList<>(Arrays.asList(arr));
        // 다른 컬렉션으로 생성
        ArrayList<Integer> testArrayList4 = new ArrayList<>(testArrayList1);
    }
}
