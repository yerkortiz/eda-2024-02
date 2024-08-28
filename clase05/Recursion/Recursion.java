package clase05.Recursion;
public class Recursion {
    static int fact(int n) {
        if(n == 0) return 1;
        return fact(n - 1) * n;
    }

    static int sum(int n) {
        if(n == 1 || n == 0) return n;
        return sum(n - 1) + n;
    }

    static int sumSquare(int n) {
        if(n == 1 || n == 0) return n;
        return sumSquare(n - 1) + n*n;
    }

    static int fib(int n) {
        if (n == 0 || n == 1) return n;
        return fib(n - 2) + fib(n - 1);
    }

    static int fibMemo(int n) {
        if (n == 0 || n == 1) return n;
        int[] memo = new int[n+1];
        memo[0] = 0; 
        memo[1] = 1;
        return fibAuxMemo(n, memo);
    }

    static int fibAuxMemo(int n, int[] memo) {
        if(memo[n] != 0 || n == 0) return memo[n];
        memo[n] = fibAuxMemo(n - 1, memo) + fibAuxMemo(n - 2, memo);
        return memo[n];
    }

    static void recArray(int[] A, int i) {
        if(i >= A.length || i < 0) return;

        System.out.println(A[i]);
        recArray(A, ++i);
    }

    static String intToBin(int N) {
        if(N <= 1) return "" + N%2;  
        return intToBin(N/2) + N%2;
    }

    public static void main(String[] args) {
        // System.out.println(fact(3));
        // System.out.println(sum(4));
        // System.out.println(sumSquare(3));
        // System.out.println(fib(2));
        // recArray(new int[]{1,2,3}, 0);
        // System.out.println(intToBin(8));
        // System.out.println(intToBin(7));
        // System.out.println(intToBin(0));
        // System.out.println(intToBin(1));
        // System.out.println(intToBin(6));
        System.out.println(fibMemo(0));
        System.out.println(fibMemo(1));
        // System.out.println(fibMemo(2));
        // System.out.println(fibMemo(3));
        // System.out.println(fibMemo(4));
        // System.out.println(fibMemo(5));
        // System.out.println(fibMemo(6));
        // System.out.println(fibMemo(7));
        // System.out.println(fibMemo(30));

    }
}
