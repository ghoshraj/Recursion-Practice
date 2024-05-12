package recursion;

import java.util.Scanner;

public class Sum {
    int sum(int n){
        if (n == 1)
            return 1;
        return (n+sum(n-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sum s = new Sum();
        System.out.println(s.sum(n));
    }
}
