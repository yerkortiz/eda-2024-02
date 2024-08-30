package control01;

public class Palindrome {
    static boolean solution1(int N) {
        int numSize = (int) Math.log10(N) + 1;
        int[] digits = new int[numSize];
        int i = numSize - 1;
        while(N > 0) {
            digits[i] = N % 10;
            N /= 10;
            --i;
        }

        for(i = 0; i < (numSize/2); ++i) {
            if (digits[i] != digits[numSize - i - 1]) return false;
        }
        
        return true;
    }

    static boolean solution2(int N) {
        String digits = "";
        while(N > 0) {
            digits = N%10 + digits;
            N/=10;
        }

        for(int i = 0; i < digits.length()/2; ++i) {
            if(digits.charAt(i) != digits.charAt(digits.length() - i - 1)) return false;
        }
        return true;

    }

    static boolean solution3(int N) {
        int r = 0;
        int temp = N;
        while(temp > 0) {
            r = 10*r + temp%10;
            temp /= 10;
        }
        return r==N;
    }


    public static void main(String[] args) {
        System.out.println(solution1(1));
        System.out.println(solution1(9));
        System.out.println(solution1(10));
        System.out.println(solution1(99));
        System.out.println(solution1(1234));
        System.out.println(solution1(12321));
        System.out.println(solution1(123321));
        System.out.println(solution1(123721));
        System.out.println("_______________");
        System.out.println(solution2(1));
        System.out.println(solution2(9));
        System.out.println(solution2(10));
        System.out.println(solution2(99));
        System.out.println(solution2(1234));
        System.out.println(solution2(12321));
        System.out.println(solution2(123321));
        System.out.println(solution2(123721));
        System.out.println("_______________");
        System.out.println(solution3(1));
        System.out.println(solution3(9));
        System.out.println(solution3(10));
        System.out.println(solution3(99));
        System.out.println(solution3(1234));
        System.out.println(solution3(12321));
        System.out.println(solution3(123321));
        System.out.println(solution3(123721));
        System.out.println(solution3(10101));
    }
}
