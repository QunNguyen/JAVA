package PTIT;

import java.util.Scanner;

public class Diemcanbang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int[]a= new int[n];
            for (int j = 0; j < n; j++) {
                a[j]=sc.nextInt();
            }
            int tongtrai=a[0];
            int tongphai=0;
            for (int j = 2; j < n ; j++) {
                tongphai+=a[j];
            }
            int dem=0;
            for (int j = 1; j <n-1 ; j++) {
                if (tongphai==tongtrai) {
                    dem++;
                    System.out.println(j+1);
                    break;
                }
                tongtrai+=a[j];
                tongphai-=a[j+1];
            }
            if (dem==0) System.out.println(-1);
        }
    }

}


