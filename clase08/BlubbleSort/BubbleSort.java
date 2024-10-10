class BubbleSort {
    static void bubbleSort(int[] A, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j ++) {
                if(A[j] > A[j + 1]){
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }  
            } 
        }
    } 

    public static void main(String[] args) {
        int[] A = new int[]{9,3,5,2,1,20,18};
        bubbleSort(A, A.length);
        for(int a: A) {
            System.out.printf("%d ", a);
        }
    }
}
