package Divisibility;
class TestDivisibility {
    //this could be improved by throwing exceptions
    static void TestIsDivisor() {
        if (Divisibility.isDivisor(5, 2)){
            System.out.printf("(isDivisor) error: %d is not divisible by %d", 5, 2);
            return;
        }
        
        if (!Divisibility.isDivisor(8, 2)){
            System.out.printf("(is Divisor) error: %d is divisible by %d", 8, 2);
            return;
        }

        System.out.println("(isDivisor) behaves as expected");
    }
 
    static void TestIsPrime(){
        if(Divisibility.isPrime(6)){
            System.out.printf("(isPrime) error: %d is not prime", 6);
            return;
        }

        if(!Divisibility.isPrime(5)){
            System.out.printf("(isPrime) error: %d is prime", 6);
            return;
        }

        if(Divisibility.isPrime(1024)){
            System.out.printf("(isPrime) error: %d is not prime", 6);
            return;
        }

        System.err.println("(isPrime) behave as expected");
    }

    static void TestGCD(){
        if(Divisibility.gcd(24, 12) != 12) {
            System.out.printf("(isPrime) error: gcd between %d and %d is %d", 24, 12, 12);
            return;
        }

        if(Divisibility.gcd(17, 5) != 1) {
            System.out.printf("(isPrime) error: gcd between %d and %d is %d", 17, 5, 1);
            return;
        }

        System.err.println("(gcd) behave as expected");
    }

    public static void main(String[] args) {
        TestIsDivisor();
        TestIsPrime();
        TestGCD();
    }
}
