package clase06.Combinatorics;
import java.util.List;

public class Combinatorics {
    //O(n!)
    static void permutations(int[] A, int lo, int hi) {
        if(lo == hi) {
            for(int i = 0; i < A.length; ++i) {
                System.out.printf(" %d ", A[i]);
            }
            System.out.println();
            return;
        }

        for(int i = lo; i <= hi; ++i) {
            int temp = A[lo];
            A[lo] = A[i];
            A[i] = temp;

            permutations(A, lo+1, hi);

            temp = A[lo];
            A[lo] = A[i];
            A[i] = temp;
        } 
    }

    //O(2^N)
    static void subsets(List<Integer> subset, int lo, int hi) {
        if(lo == hi + 1) {
            for(int n:subset) {
                System.out.printf(" %d ", n);
            }
            System.out.println();
            return;
        }
        subset.add(lo);
        subsets(subset, lo + 1, hi);
        subset.removeLast();
        subsets(subset, lo + 1, hi);
    }

    //O(N^2)
    static void subarrays(int[] A, int lo, int hi) {
        if(hi == A.length) return;

        if(lo > hi) {
            subarrays(A, 0, hi+1);
            return;
        }

        for(int i = lo; i <= hi; ++i) {
            System.out.printf(" %d ", A[i]);
        }
        System.out.println();

        subarrays(A, lo+1, hi);
    }

    public static void main(String[] args) {
        // permutations(new int[]{1,2,3}, 0, 2);
        // List<Integer> l = new LinkedList<Integer>();
        // subsets(l, 0, 2);
        // subarrays(new int[]{1,2,3}, 0, 0);
    }
}