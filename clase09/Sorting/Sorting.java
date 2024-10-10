package Sorting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Sorting {
    static void ascendentSort(Integer[] A) {
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

    static void sortCollection(ArrayList<Integer> A) {
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
        Integer[] A = new Integer[]{6,1,23,21,52};
        ascendentSort(A);
        descendentSort(A);
        ArrayList<Integer> Al = new ArrayList<Integer>(Arrays.asList(6,1,23,21,52));

    }
}