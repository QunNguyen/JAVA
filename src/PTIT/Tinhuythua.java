package PTIT;

import java.util.Scanner;

public class Tinhuythua {
    public static void main(String[] args) {
        final long n= (long) (1e9+7);
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            long a= Long.parseLong(sc.next());
            long b=Long.parseLong(sc.next());
            if(a==0&&b==0) break;
            System.out.println(Power(a,b));
        }
    }
    public static long Power(long a,  long b) {
        final long n= (long) (1e9+7);
        if (b == 0) return 1;
        if (b == 1) return a;
        else {
            long  p = Power(a, b / 2);
            p = p % n;
            if (b % 2 == 0) {
                return (p * p) % n;
            } else {
                return (((p * p) % n) * a) % n;
            }
        }
    }
}
