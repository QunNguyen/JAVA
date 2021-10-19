package PTIT;

import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Sophuc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            sophuc1 p1=new sophuc1(sc.nextInt(),sc.nextInt());
            sophuc1 p2=new sophuc1(sc.nextInt(),sc.nextInt());
            sophuc1.tinh(p1,p2);
            System.out.println();
        }
    }
}

class sophuc1{
    int a;
    int b;
    public sophuc1(int x, int y){
        a=x;
        b=y;
    }

    public static void tinh(sophuc1 p1, sophuc1 p2){
        int x1=(p1.a+p2.a)*p1.a+p1.b*(p1.b+p2.b)*(-1);
        int y1=p1.a*(p1.b+p2.b)+p1.b*(p1.a+p2.a);
        System.out.printf(x1+" ");
        if(y1<0){
            System.out.printf("- "+abs(y1)+"i, ");
        }
        else System.out.printf("+ "+y1+"i, ");
        int x2= (int) (pow((p1.a+p2.a),2)+pow((p1.b+p2.b),2)*(-1));
        int y2=2*(p1.a+p2.a)*(p1.b+p2.b);
        System.out.printf(x2+" ");
        if(y2<0){
            System.out.printf("- "+abs(y2)+"i");
        }
        else System.out.printf("+ "+y2+"i");
    }
}
