package algorithm.ch02;

public class Ex02_08_01 {
    static int cardConvR(int x, int y ,char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCD";

        do{
            d[digits++] = dchar.charAt(x % y);
            x /= y;
        }while (x != 0);
        return digits;
    }
}
