package PTIT;

import java.math.BigInteger;
import java.time.Year;
import java.util.Scanner;

public class Chiahet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            String s = sc.next();
            String x=sc.next();
            BigInteger n =new BigInteger(s);
            BigInteger m=new BigInteger(x);
            BigInteger kq1=n.divide(m);
            BigInteger kq2=m.divide(n);
            if(kq1.multiply(m).equals(n)){
                System.out.println("YES");
            }
            else {
                if(kq2.multiply(n).equals(m)){
                    System.out.println("YES");
                }
                else System.out.println("NO");
            }

        }
    }
}
