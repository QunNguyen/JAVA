package PTIT;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Uocsonguyentolonnhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            System.out.println(check(n));
        }
    }

    public static long check(long n){
        long maxPrime = 0;
        while(n%2==0)
        { maxPrime=2;
            n/=2;
        }
        for(long i=3;i<=sqrt(n);i+=2)
        { while(n%i==0)
            n/=i;
            maxPrime=i;
        }
        if(n>1) maxPrime=n;
        return maxPrime;
    }
}