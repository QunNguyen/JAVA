package PTIT;

import java.math.BigInteger;
import java.util.Scanner;


public class Hieusolonnhat1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            String s= sc.next();
            String s1=sc.next();
            int n=Math.max(s.length(),s1.length());
            BigInteger x=new BigInteger(s);
            BigInteger y=new BigInteger(s1);
            BigInteger kq=x.subtract(y).abs();
            for (int i = 0; i < n-kq.toString().length(); i++) {
                System.out.print("0");
            }
            System.out.println(kq);
        }
    }
}