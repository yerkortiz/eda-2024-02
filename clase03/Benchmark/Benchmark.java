package Benchmark;

import java.util.Scanner;

public class Benchmark {
    static String intToBin(int x){
        String s = ""; //1
        s += (x % 2); //1
        // lg (n)
        while(x > 1) { // depende de cuantas divisiones tenga x para llegar a 1
            x /= 2; // 1
            s = (x % 2) + s; // log (n)
        }
        return s; // 1
    }

    static String intToBin2(int x){
        StringBuilder s = new StringBuilder(); //1
        s.append(x % 2); //1
        while(x > 1) { // lg n
            x /= 2; //1
            s.append(x % 2); //1
        }
        
        return s.reverse().toString(); //1
    }

    static double nanoSecondsToSeconds(double ns){
        return ns / 1e9;
    }
    //1e9 significa 10 elevado a 9, 1000000000
     public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int high = stdin.nextInt();
        
        System.out.printf("calculating int to bin for every integer from 0 to %d\n", high);
        long startTime = System.nanoTime();
        for(int i = 0; i <= high; i++){
            System.out.println(intToBin2(i));
        }
        long endTime = System.nanoTime();
        System.out.printf("the calculation took %f seconds\n", nanoSecondsToSeconds((double) (endTime - startTime) ));
        stdin.close();
    }
}