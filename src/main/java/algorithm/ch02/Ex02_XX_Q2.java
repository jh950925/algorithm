package algorithm.ch02;

public class Ex02_XX_Q2 {

    static void Re(int [] a, int num1, int num2){
        int t = a[num1];
        a[num1] = a[num2];
        a[num2] = t;
    }

    static void reverse(int [] a) {
        for (int i = 0; i < a.length / 2; i++) {
            Re(a, i, a.length - i - 1);
        }
    }

    public static void main(String[] args) {
        int [] arr = {5,10,73,2,-5,42};

        System.out.println("배열출력");
        for (int i : arr) {
            System.out.println("["+ i + "]");
        }

        reverse(arr);

        System.out.println("역순");
        for (int i=0; i<arr.length; i++) {
            System.out.println("["+ i + "] : " + arr[i]);
        }
    }
}
