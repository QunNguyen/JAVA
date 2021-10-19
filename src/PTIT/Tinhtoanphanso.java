package PTIT;

import java.util.Scanner;

import static java.lang.Math.pow;

public class Tinhtoanphanso {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            phanso2 p1=new phanso2(sc.nextInt(),sc.nextInt());
            phanso2 p2=new phanso2(sc.nextInt(),sc.nextInt());
            phanso2.tinh(p1,p2);
            System.out.println();
        }
    }
}
class phanso2{
    int a;
    int b;
    public phanso2(int x, int y){
        a=x;
        b=y;
    }
    public static void tinh(phanso2 p1,phanso2 p2){
        long x1= (p1.a*p2.b+p2.a*p1.b)*(p1.a*p2.b+p2.a*p1.b);
        long y1= (p1.b*p2.b)*(p1.b*p2.b);
        rutGon(x1,y1);
        long x2=p1.a*p2.a*x1/_gcd(x1,y1);
        long y2=p1.b*p2.b*y1/_gcd(x1,y1);
        rutGon(x2,y2);
    }

    public static void rutGon(long x,long y) {
        long temp = _gcd(x,y);
        System.out.printf(x/temp+"/"+y/temp+" ");
    }

    public static long _gcd(long a, long b) {
        return b == 0 ? a : _gcd(b, a % b);
    }

}
