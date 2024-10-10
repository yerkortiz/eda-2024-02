package Sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Collections;

class Sorting {
    // integer es distinto a int
    static void ascendentSort(int[] A) {
        System.out.printf("Array a: ");
        for(int a : A) {
            System.out.printf(" %d", a);
        }
        System.out.printf("\n");
    
        Arrays.sort(A);

        System.out.printf("Sorted Array a: ");
        for(int a : A) {
            System.out.printf(" %d", a);
        }
        System.out.printf("\n");
    }

    static void descendentSort(Integer[] A) {
        System.out.printf("Array a: ");
        for(int a : A) {
            System.out.printf(" %d", a);
        }
        System.out.printf("\n");
    
        Arrays.sort(A, Collections.reverseOrder());
        System.out.printf("Sorted Array a: ");
        for(int a : A) {
            System.out.printf(" %d", a);
        }
        System.out.printf("\n");
    }

    static void sortCollection(LinkedList<Integer> A) {
        System.out.printf("Array a: ");
        for(int a : A) {
            System.out.printf(" %d", a);
        }
        System.out.printf("\n");
    
        Collections.sort(A);
        System.out.printf("Sorted Array a: ");
        for(int a : A) {
            System.out.printf(" %d", a);
        }
        System.out.printf("\n");
    }

    public static void main(String[] args) {
        // int[] A = new int[]{6,1,23,21,52};
        // ascendentSort(A);
        // descendentSort(A);
        // Integer[] A = new Integer[]{6,1,23,21,52};
        // ascendentSort(A);
        // descendentSort(A);
        // ArrayList<Integer> Al = new ArrayList<Integer>(Arrays.asList(6,1,23,21,52));
        LinkedList<Integer> ll = new LinkedList<Integer>(Arrays.asList(6,1,23,21,52));
        sortCollection(ll);
    }
}