package PTIT;

import java.util.Scanner;
import java.util.Vector;

public class Danhsachcanh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int[][]a=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]= sc.nextInt();
            }
        }
        int[][]c=new int[n][n];
        for (int i = 0; i < n; i++) {
            int x=0;
            for (int j = 0; j < n; j++) {
                if(a[i][j]==1)
                {
                    c[i][x]=j+1;
                    x++;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < c[i].length; j++) {
                if(c[i][j]!=0&&c[i][j]>i)
                    System.out.println("("+(i+1)+","+c[i][j]+")");
            }
        }
    }
}
