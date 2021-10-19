package PTIT;

import java.util.Scanner;

public class Tonguocso {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long t= sc.nextLong();
        long tong=0;
        for (int i = 0; i < t; i++) {
            long n= sc.nextLong();
            tong+=check(n);
        }
        System.out.println(tong);
    }
    public static long check(long n){
        long tong =0;
        long[]a = {2,3,5,7};
        for (int i = 0; i < a.length; i++) {
            while (n%a[i]==0)
            {
                tong+=a[i];
                n/=a[i];
            }
            if(i==a.length-1&&n>1) tong+=n;
        }
        return tong;
    }
}



