package PTIT;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class KhaibaolopPoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double s = sqrt(mu(x, x1) + mu(y, y1));
            System.out.format("%.4f",s);
            System.out.println();
        }
    }
    public static double mu(double x, double y){
        double s=x-y;
        return s*s;
    }
}
