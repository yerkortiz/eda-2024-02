package Analysis;

public class Analysis {
    // 1 + 1 + log_2(x) * (1 + log_2(x))
    // O((log_2(x))^2)
    static String intToBin(int x){
        String s = ""; //1
        s += (x % 2); //1
        while(x > 1) { // depende de la cantidad de divisiones hasta que x sea menor o igual a 1
            x /= 2; // 1
            s = (x % 2) + s; // depende del tamaño del string
        }
        return s;
    }

    // 1 + 1 + log_2(x) (1 + 1)
    // O(log_2(x))
    static String intToBin2(int x){
        StringBuilder s = new StringBuilder(); //1
        s.append(x % 2);//1
        while(x > 1) { //depende de la cantidad de divisiones
            x /= 2; //1
            s.append(x % 2); //1
        }
        
        return s.reverse().toString();
    }

    //O(max(n, m)) where n is the length of x and m the length of y
    static int[] add(int[] x, int[] y) {
        if (x.length < y.length) return add (y, x); //depends on how many operations add have

        int carry = 0; // 1
        int sum = 0;
        int i = x.length - 1;
        int j = y.length - 1;
        int[] res = new int[x.length+1];

        while(j > -1) { //depends of length of y
            sum = x[i] + y[j] + carry; //1
            res[i + 1] = sum % 10 ; //1
            carry = sum/10; //1
            i--; //1
            j--; //1
        }

        while(i > -1) { //depends of lenght of x - lenght of y
            sum = x[i] + carry; //1
            res[i + 1] = sum % 10; //1
            carry = sum/10; //1
            i--; //1
        }

        if (carry != 0) res[0] = carry; //1
        return res; //1
    }

    public static void main(String[] args) {
        int[] x= new int[]{1, 2};
        int[] y= new int[]{9};
        int[] z = add(x, y);
        for(int i = 0; i < z.length; i++) {
            System.out.println(z[i]);
        }
    }
}
