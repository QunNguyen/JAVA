package PTIT;

import java.util.Scanner;

public class TinhsoFibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int j=0;j<t;j++) {
            int n = sc.nextInt();
            long[] f = new long[n + 1];
            f[1] = 1;
            f[2] = 1;
            for (int i = 2; i <= n; i++) {
                f[i] = f[i - 1] + f[i - 2];
            }
            System.out.println(f[n]);
        }
    }
}
