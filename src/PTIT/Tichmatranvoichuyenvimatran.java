package PTIT;

import java.util.Scanner;

public class Tichmatranvoichuyenvimatran {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for (int k=1;k<=t;k++){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int [][] a= new int[50][50];
            int [][] b= new int[50][50];
            int [][] c= new int[50][50];
            for(int i = 1;i <= n;i++)
            {
                for(int j = 1;j <= m;j++)
                {
                    a[i][j]= sc.nextInt();
                }
            }
            for(int i = 1;i <= n;i++)
            {
                for(int j = 1;j <= n;j++)
                {
                    c[i][j] = 0;
                }
            }
            for(int i = 1;i <= n;i++)
            {
                for(int j = 1;j <= m;j++)
                    b[j][i] = a[i][j];
            }
            for(int i = 1;i <= n;i++)
            {
                for(int j = 1;j <= n;j++)
                {
                    for(int h = 1; h <= m; h++)
                        c[i][j] += a[i][h] * b[h][j];
                }
            }
            System.out.println("Test "+k+": ");
            for(int i = 1;i <= n;i++)
            {
                for(int j = 1;j <= n;j++)
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}

