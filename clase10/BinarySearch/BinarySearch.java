package BinarySearch;
import java.util.Arrays;
import java.lang.Math;

class BinarySearch {
    static int linearSearchI(int[] A, int x) {
        for(int i = 0; i < A.length - 1; i++) {
            if (A[i] == x) 
                return i;
        }
        return -1;
    }

    static int linearSearchR(int[] A, int x, int i) {
        if (i >= A.length) 
            return -1;
        if (A[i] == x) 
            return i;
        return linearSearchR(A, x, i+1);
    }

    static int binarySearchI(int[] A, int x) {
        int lo = 0, hi = A.length - 1, mid;
        while(lo <= hi) {
            mid = (lo + hi) / 2;
            if (A[mid] == x) return mid;
            // ir derecha
            else if (A[mid] < x) lo = mid + 1;
            // ir izquierda
            else hi = mid - 1;
        }
        return -1;
    }

    static int binarySearchR(int[] A, int lo, int hi, int x) {
        if (lo > hi) return -1;
        int mid = (lo + hi) / 2;
        if (A[mid] == x) 
            return mid;
        else if(A[mid] < x)
            return binarySearchR(A,  mid + 1, hi, x);
        else 
            return binarySearchR(A,  lo, mid - 1, x);
    }

    static int binarySearchC(int[] A, int x) {
        return Arrays.binarySearch(A, x);
    }

    static int[] generateRandomArray(int N) {
        int[] A = new int[N];
        for(int i = 0; i < N; i++) {
            A[i] = (int) (Math.random() * 1e3);
        }
        return A;
    }

    static void experimentA(int[] A) {
        long tL1 = System.nanoTime();
        linearSearchI(A, 10024);
        long tL2 = System.nanoTime();
        System.out.println(tL2 - tL1);

        Arrays.sort(A);
        long tB1 = System.nanoTime();
        binarySearchI(A, 10024);
        long tB2 = System.nanoTime();
        System.out.println(tB2 - tB1);
    }
    public static void main(String[] args) {
        int[] A = generateRandomArray(100000000);
        experimentA(A);

    }
}