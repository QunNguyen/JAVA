package PTIT;

import java.util.Scanner;

import static java.lang.Math.*;

public class Chiatamgiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int h=sc.nextInt();
            for (int j = 1; j <=n-1; j++) {
                double x=sqrt((double) j / n) * h;
                System.out.format("%.6f ",x);
            }
            System.out.println();
        }
    }
}
