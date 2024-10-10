package SelectionSort;

public class SelectionSort {
    static void selectionSort(int[] A, int n) {
        for(int i = 0; i < n - 1; i++) {
            int minPos = i;
            for(int j = i + 1; j < n; j++) {
                if (A[j] < A[minPos]) {
                    minPos = j;
                }
            }
            int temp = A[minPos];
            A[minPos] = A[i];
            A[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] A = new int[]{9,3,5,2,1,20,18};
        selectionSort(A, A.length);
        for(int a: A) {
            System.out.printf("%d ", a);
        }
    }
}
