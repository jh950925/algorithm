package algorithm.ch02;

public class Ex02_11 {
    public static void main(String[] args) {
        int counter = 0;            // 곱셈과 나눗셈의 횟수
        int pte = 0;                // 찾은 소수의 개수
        int[] prime = new int[500]; // 소수를 저장하는 배열

        prime[pte++] = 2;           // 소수
        prime[pte++] = 3;           // 소수

        for (int n = 5; n < 1000; n += 2) { // 대상은 홀수만
            boolean flag = false;
            for (int i = 1; prime[i] * prime[i] <= n; i++) {
                counter += 2;
                if (n % prime[i] == 0) {        // 나누어지면 소수가 아님
                    flag = true;
                    break;                      // 소수가 아니면 반복  XXX
                }
            }
            if (!flag) {                // 마지막까지 나누어 떨어지지 않음
                prime[pte++] = n;       // 소수라고 배열에 저장
                counter++;
            }
        }
        for (int i = 0; i < pte; i++) {     // 찾은 ptr개의 소수를 출력
            System.out.println(prime[i]);
        }
        System.out.println("곱셈과 나눗셈을 수행한 횟수 : " + counter);
    }
}
