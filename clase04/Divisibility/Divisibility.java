package Divisibility;

public class Divisibility {

    //O(1)
    public static boolean isDivisor(int x, int y) {
        return x % y == 0;
    }

    //O(N^(1/2))
    public static boolean isPrime(int N) {
        for (int i = 2; i * i < N; i++) {
            if (N % i == 0) return false;
        }
        return true;
    }

    //O(log(min(a, b)))
    public static int gcd(int a, int b) {
        int res = a % b;
        while (res != 0) {
            a = b;
            b = res;
            res = a % b;
        }
        return b;
    }
}
