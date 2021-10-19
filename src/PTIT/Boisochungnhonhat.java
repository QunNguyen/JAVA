package PTIT;

import java.util.Scanner;

public class Boisochungnhonhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n= sc.nextInt();
            long x=1;
            for (int j =2; j <=n ; j++) {
                x=lcm(x,j);
            }
            System.out.println(x);
        }
    }
    public static long gcd(long a, int b) {
        if (b == 0) return a;
        return gcd(b, (int) (a % b));
    }
    public static long lcm(long a, int b){
        return (a*b)/gcd(a,b);
    }
}
