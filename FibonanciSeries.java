package recursion;

import java.util.Scanner;

public class FibonanciSeries {
    static void fibo(int a , int b, int count , int n){
        if (count > n)
            return;
        System.out.println(a);
        fibo(b,a+b,count+1,n);
    }
    static void fibo(int n){
        fibo(0,1,1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo(n);
    }
}
