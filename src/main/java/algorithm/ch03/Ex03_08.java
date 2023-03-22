package algorithm.ch03;

import algorithm.ch02.Ex02_14;

import java.util.*;


public class Ex03_08 {
    static final int VMAX = 21; // 시시력 분포(0.0ㅇ;서 0.1 단위로 21개)

    static class PhyscData{
        private String name;
        private int    height;
        private double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
        @Override
        public String toString() {
            return "PhyscData{" +
                    "name='" + name + '\'' +
                    ", height=" + height +
                    ", vision=" + vision +
                    '}';
        }

        //오름차순으로 정렬하기 위한 compaarator
        public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();

        private static class HeightOrderComparator implements Comparator<PhyscData>{
            @Override
            public int compare(PhyscData d1, PhyscData d2) {
                return (d1.height > d2.height) ? 1 :
                        d1.height > d2.height ? -1 : 0;
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PhyscData[] x = {
                new PhyscData("AAA",100,0.1),
                new PhyscData("BBB",200,0.2),
                new PhyscData("CCC",300,0.3),
                new PhyscData("DDD",400,0.4),
                new PhyscData("EEE",500,0.5),
                new PhyscData("FFF",600,0.6),
        };
        System.out.print("몇 cm인 사람을 찾고 있나요 ? ");
        int height = sc.nextInt();
        int idx = Arrays.binarySearch(
                x,                                              // 배열 x에서
                new PhyscData("", height, 0.0),     // 키가 height인 요소를   
                PhyscData.HEIGHT_ORDER                          // HEIGHT_ORDER에 의헤 검색
        );

        if(idx < 0)
            System.out.println("요소가 없습니다.");
        else
            System.out.println("x[" + idx + "]에 있습니다.");
        System.out.println("찾은 데이터 : " + x[idx]);

    }//end main

}
