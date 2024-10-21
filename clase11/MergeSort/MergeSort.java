package MergeSort;
class MergeSort {
    static void mergeSort(int[] A, int l, int h) {
        if (h >= l) return;

        int m = (l + h) / 2;
        mergeSort(A, l, m);
        mergeSort(A, m + 1, h);
        merge(A, l, m, h);
    }

    static void merge(int[] A, int l, int m, int h) {
        int n1 = m - l + 1;
        int n2 = h - m;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for (int i = 0; i < n1; ++i)
            L[i] = A[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = A[m + 1 + j];

        int i = 0, j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                A[k] = L[i];
                i++;
            }
            else {
                A[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            A[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            A[k] = R[j];
            j++;
            k++;
        }
    }

    
    public static void main(String[] args) {
        
    }
}