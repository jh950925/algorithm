package algorithm.ch02;

import java.util.*;

public class Ex02_14 {

    static final int VMAX = 21; // 시시력 분포(0.0ㅇ;서 0.1 단위로 21개)

    static class PhyscData{
        String name;
        int heught;
        double vision;

        public PhyscData(String name, int heught, double vision) {
            this.name = name;
            this.heught = heught;
            this.vision = vision;
        }
    }

    //키의 평균값
    static double aveHeight(PhyscData[] dat) {
        double sum = 0;

        for (int i = 0; i < dat.length; i++) {
            sum += dat[i].heught;
        }

        return sum / dat.length;
    }

    static void distQVision(PhyscData[] dat, int[] dist) {
        int i=0;

        dist[i] = 0;
        for (i = 0; i < dat.length; i++) {
            if (dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0) {
                dist[(int)(dat[i].vision * 10)]++;
            }
        }
    }

    public static void main(String[] args) {
        PhyscData[] x = {
                new PhyscData("AAA",100,0.1),
                new PhyscData("BBB",200,0.2),
                new PhyscData("CCC",300,0.3),
                new PhyscData("DDD",400,0.4),
                new PhyscData("EEE",500,0.5),
                new PhyscData("FFF",600,0.6),
        };

        int[] vdist = new int[VMAX];

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i].name + "  /  " + x[i].heught + "  /  " + x[i].vision);
        }
        System.out.println("평균키 : " + aveHeight(x));
        distQVision(x,vdist);
        for (int i = 0; i < VMAX; i++) {
            System.out.println(vdist[i]);
        }
    }

}
