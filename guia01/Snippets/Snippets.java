package Snippets;
class Snippets {
    static void f1(int N){
        for(int i = 0; i < N; i++) {
            // <body>
        }
    }

    static void f2(int N){
        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
            // <body>
            }
        }
    }

    static void f3(int N){
        for(int i = 1; i < N; i*=2) {
            // <body>
        }
    }

    static void f4(int N){
        for(int i = 0; i < N; i++) {
            for(int j = 1; j < N; j*=2) {
                // <body>
            }
        }
    }

    static void f5(){
        for(int i = 0; i < 1024; i++) {
            // <body>
        }
    }

    static void f6(int N){
        for(int i = 0; i < N; i+=2) {
            // <body>
        }
    }

    static void f7(int N){
        for(int i = 0; i < N*N; ++i) {
            // <body>
        }
    }

    static void f8(int N){
        for(int i = 0; i*i < N; ++i) {
            // <body>
        }
    }

    static void f9(int N){
        for(int i = 0; i*i < N*N; ++i) {
            // <body>
        }
    }

    static void f10(int N, int M){
        for(int i = 0; i < N; ++i) {
            // <body>
        }

        for(int i = 0; i < M; ++i) {
            // <body>
        }
    }

    static void f11(int N, int M){
        for(int i = 0; i < N; ++i) {
            for(int j = 0; j < M; ++j) {
                // <body>
            }
        }   
    }

    static void f12(int N){
        for(int i = 0; i < N; ++i) {
            for(int j = 0; j < 100; ++j) {
                // <body>
            }
        }   
    }

    static void f13(int N){
        while(N > 0) {
            // <body>
            --N;
        } 
    }

    static void f14(int N){
        while(N > 0) {
            // <body>
            N/=2;
        } 
    }

    static void f15(int N){
        while(N > 0) {
            // <body>
            N/=10;
        } 
    }

    static String intToBin(int N) {
        String bin = "";
        bin += N%2;
        while(N > 1) {
            N/=2;
            bin = N%2 + bin;
        }
        return bin;
    }

    static int gcd(int a, int b) {
        int res = a%b;
        while(res != 0) {
            a = b;
            b = res;
            res = a%b;
        }
        return b;
    }

    static boolean[] eratosthenes(int n) {
        boolean[] primes = new boolean[n];
        for(int i = 0; i < n; i++){
            primes[i] = true;
        }

        for (int p = 2; p * p <= n; p++) {
            if (primes[p] == true) {
                for (int i = p * p; i <= n; i += p)
                    primes[i] = false;
            }
        }

        return primes;
    }
}