package PTIT;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Sochinhphuong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int sqr = (int) sqrt(n);
            if(sqr*sqr == n) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
