package recursion;

import java.util.Scanner;

public class PalindromeNumber {
    static int poli(int n){
        if (n == 0)
            return 0;
        int sum = 0;
        int i = 0;
        sum = sum + n % 10;
        poli(n /10);
        return (sum * 10 ) + n % 10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n == poli(n))
            System.out.println("poli");
        else
            System.out.println("Not poli");
    }
}
