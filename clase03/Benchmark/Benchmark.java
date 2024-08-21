package Benchmark;

public class Benchmark {
    static String intToBin(int x){
        String s = ""; 
        s += (x % 2); 
        while(x > 1) {
            x /= 2; 
            s = (x % 2) + s; 
        }
        return s; 
    }

    static String intToBin2(int x){
        StringBuilder s = new StringBuilder(); 
        s.append(x % 2); 
        while(x > 1) {
            x /= 2; 
            s.append(x % 2); 
        }
        
        return s.reverse().toString(); 
    }

    static double nanoSecondsToSeconds(double ns){
        return ns / 1e9;
    }

    static boolean LinearSearch(int[] A, int x) {
        for(int i = 0; i < A.length; i++) {
            if (A[i] == x) 
                return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Benchmark for intToBin");
        for (int i = 1; i <= 1000000000; i *= 10) {
            System.out.printf("n = %d ", i);
            long startTime = System.nanoTime();
            for(int j = 0; j <= i; j++){
                intToBin(j);
            }
            long endTime = System.nanoTime();
            System.out.printf("t(seconds) = %f\n", nanoSecondsToSeconds((double) (endTime - startTime)));
        }
    }
}