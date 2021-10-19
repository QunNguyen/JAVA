package PTIT;

import java.math.BigInteger;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Lietketohop1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String n=sc.next();
            if(check(n)) System.out.println(1);
            else System.out.println(0);
        }
    }
    static boolean check(String c){
        char[]s=c.toCharArray();
        int oddSum=0,evenSum=0;
        for(int i=0;i<s.length;i++){
            if(i%2==0) oddSum+=s[i]-'0';
            else evenSum+=s[i]-'0';
        }
        return ((oddSum-evenSum)%11==0);
    }
}
