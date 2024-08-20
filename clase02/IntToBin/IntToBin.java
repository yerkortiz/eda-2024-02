public class IntToBin {
    public static String intToBin(int n) {
        String bin = "";
        while(n > 0) {
            bin = (n%2) + bin;
            n /= 2;
        }
        return bin;
    }

    public static void main(String[] args) {
        System.out.println(intToBin(25));
        System.out.println(intToBin(2505));
        System.out.println(intToBin(8));
        for(int i=0; i < 10000000; i++) {
            System.out.println(intToBin(i));
        }
    }
}