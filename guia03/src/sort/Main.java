package src.sort;

import java.lang.Math;

class Main {

    // En cada iteración i inserta el
    // elemento arr[i] en el subarreglo arr[:i], desplazando
    // a la derecha los elementos mayores a arr[i]. Se asume que
    // arr[:i] ya está ordenado previamente.
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                --j;
            }
            arr[j + 1] = key;
        }
    }

    // En cada iteración i encuentra el elemento mínimo en el
    // subarreglo A[i + 1:] y realiza el swap de dicho elemento
    // con el que que esté en la posición i.
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; ++j) {
                if (arr[j] < arr[minIndex]) minIndex = j;
            }
            swap(arr, i, minIndex);
        }
    }

    // En cada iteración i compara e itercambia
    // los elementos adyacentes en A[:i],
    // dejando el elemento máximo de A[:i]
    // en la posición A[A.length - i].
    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; ++i) {
            boolean exchange = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    exchange = true;
                }
            }
            if (!exchange) break;
        }
    }

    // Algoritmo divide and conquer que divide
    // recursivamente un arreglo hasta subarreglos
    // de tamaño 1 o 0, para luego mezclar recursivamente
    // cada subarreglo de manera ordenada.
    static void mergeSort(int[] arr, int lo, int hi) {
        if (lo >= hi) return;
        int mid = (lo + hi) / 2;
        mergeSort(arr, lo, mid);
        mergeSort(arr, mid + 1, hi);
        merge(arr, lo, hi);
    }

    static void merge(int[] arr, int lo, int hi) {
        int mid = (lo + hi) / 2;
        int n1 = mid - lo + 1;
        int n2 = hi - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for (int i = 0; i < n1; ++i) {
            L[i] = arr[lo + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[mid + j + 1];
        }
        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[lo + k] = L[i];
                ++i;
                ++k;
            } else {
                arr[lo + k] = R[j];
                ++j;
                ++k;
            }
        }

        while (i < n1) {
            arr[lo + k] = L[i];
            ++i;
            ++k;
        }

        while (j < n2) {
            arr[lo + k] = R[j];
            ++j;
            ++k;
        }
    }

    // Algoritmo divide and conquer que particiona
    // recursivamente un arreglo mediante un pivote p
    // hasta que el arreglo no se pueda particionar
    // más.
    static void quickSort(int[] arr, int lo, int hi) {
        if (lo >= hi) return;
        int p = partition(arr, lo, hi);
        quickSort(arr, lo, p - 1);
        quickSort(arr, p + 1, hi);
    }

    static int partition(int[] arr, int lo, int hi) {
        int pivot = arr[hi];
        int k = lo;
        for (int i = lo; i <= hi; ++i) {
            if (arr[i] < pivot) {
                swap(arr, i, k);
                k++;
            }
        }

        swap(arr, hi, k);
        return k;
    }

    // CountingSort es un algoritmo que no se basa en comparaciones,
    // sino que cuenta la frecuencia de cada elemento i en una tabla T
    // y luego reinserta en el arreglo original los elementos uno a uno
    // disminuyendo su frecuencia en la tabla T hasta que T[i] <= 0
    static void countingSort(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n > max) max = n;
            if (n < min) min = n;
        }

        int[] count = new int[max - min + 1];

        for (int n : arr) {
            count[n - min]++;
        }

        int pos = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[pos] = i;
                pos++;
                count[i]--;
            }
        }
    }

    // GnomeSort es una modificación de insertionSort que solo
    // utiliza un ciclo para ordenar.
    static void gnomeSort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            if (i == 0 || arr[i] >= arr[i - 1]) {
                ++i;
            } else {
                swap(arr, i, i - 1);
                --i;
            }
        }
    }

    static int binarySearch(int[] arr, int x, int lo, int hi) {
        if (lo > hi) return -1;
        int mid = (lo + hi) / 2;
        if (arr[mid] == x) return mid;
        else if (arr[mid] < x) return binarySearch(arr, x, lo, mid - 1);
        return binarySearch(arr, x, mid + 1, hi);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int[] randomArr(int n, int k) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * k);
        }
        return arr;
    }

    static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; ++i) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }

    static void printArr(int[] arr) {
        for (int a : arr) {
            System.out.printf("%d ", a);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // int[] A = randomArr(8, 8);
        int[] A = randomArr(10000000, 100);
        // printArr(A);
        System.out.println(isSorted(A));
        // insertionSort(A);
        // selectionSort(A);
        // bubbleSort(A);
        // mergeSort(A, 0, A.length - 1);
        // quickSort(A, 0, A.length - 1);
        // gnomeSort(A);
        countingSort(A);
        // printArr(A);
        System.out.println(isSorted(A));
    }
}
