package InsertionSort;

public class InsertionSort {
    static void insertionSort(int[] A, int n){
        for(int i = 1; i < n; i++) {
            int key = A[i];
            int j = i - 1;
            while(j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j--;
            }
            A[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] A = new int[]{9,3,5,2,1,20,18};
        insertionSort(A, A.length);
        for(int a: A) {
            System.out.printf("%d ", a);
        }
    }
}
