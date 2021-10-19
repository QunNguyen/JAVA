package PTIT;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Chuvitamgiac {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        while (t-->0){
            double x=sc.nextDouble();
            double y=sc.nextDouble();
            double x0=sc.nextDouble();
            double y0=sc.nextDouble();
            double x1=sc.nextDouble();
            double y1=sc.nextDouble();
            double a=sqrt(pow((x0-x),2)+pow((y0-y),2));
            double b=sqrt(pow((x1-x),2)+pow((y1-y),2));
            double c=sqrt(pow((x1-x0),2)+pow((y1-y0),2));
            if ((a + b) > c && (b + c) > a && (c + a) > b) {
                double s=a+b+c;
                System.out.printf("%.3f",s);
                System.out.println();
            }
            else System.out.println("INVALID");
        }
    }
}
