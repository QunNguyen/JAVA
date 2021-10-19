package PTIT;

import java.util.Scanner;

public class bondiemdongphang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());

            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
class Point3D{

    int a;
    int b;
    int c;

    public Point3D(int x, int y, int z) {
        a=x;
        b=y;
        c=z;
    }
    public static boolean check(Point3D p1, Point3D p2, Point3D p3, Point3D p4) {
        int xad=p4.a-p1.a;
        int yad=p4.b-p1.b;
        int zad=p4.c-p1.c;

        int m=(p2.b-p1.b)*(p3.c-p1.c)-(p3.b-p1.b)*(p2.c-p1.c);
        int n=(p2.c-p1.c)*(p3.a-p1.a)-(p3.c-p1.c)*(p2.a-p1.a);
        int o=(p2.a-p1.a)*(p3.b-p1.b)-(p3.a-p1.a)*(p2.b-p1.b);

        int tong=m*xad+n*yad+o*zad;
        if(tong==0) {
            return true;
        }
        return false;
    }
}
