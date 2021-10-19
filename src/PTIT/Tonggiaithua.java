package PTIT;

import java.math.BigInteger;
import java.util.Scanner;

public class Tonggiaithua {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long s=0;
        for (int i = 1; i <=n ; i++) {
            s+=gt(i);
        }
        System.out.println(s);
    }
    public static long gt(int n){
        long t=1;
        for (int i = 1; i <=n ; i++) {
            t*=i;
        }
        return t;
    }
}
