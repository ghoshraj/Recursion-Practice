package recursion;

import java.util.Scanner;

public class DigitSum {
    int sum = 0;
    int summ(int n){
        if(n == 0)
            return sum;
        sum+=n%10;
        return summ(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        DigitSum d = new DigitSum();
        System.out.println(d.summ(n));
    }
}
