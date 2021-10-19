package PTIT;

import java.util.Scanner;

public class Uocsochunglonnhatcuasonguyenlon {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i <t; i++) {
            long a= sc.nextLong();
            sc.nextLine();
            String b=sc.nextLine();
            System.out.println(gcdLarge(a,b));
        }
    }
    public static long gcd(long a, long b){
        if(a==0){
            return  b;
        }
        return gcd(b%a,a);
    }
    public static long reduceB(long a, String b){
        char[] c=b.toCharArray();
        long mod=0;
        for (int i = 0; i < b.length(); i++) {
            mod=(mod*10+c[i]-'0')%a;
        }
        return mod;
    }
    public static long gcdLarge(long a, String b){
        long num=reduceB(a,b);
        return gcd(a,num);
    }
}
