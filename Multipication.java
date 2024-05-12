package recursion;

import java.util.Scanner;

public class Multipication {
    int multiply(int n){
        if (n == 1)
            return 1;
        return n * multiply(n -1);
    }
    public static void main(String[] args) {
        Multipication m = new Multipication();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(m.multiply(n));
    }
}
