package PTIT;

import java.util.Scanner;

public class Phantubenphaidautienlonhonon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n=sc.nextInt();
            int a[]=new int[n];
            for (int j = 0; j <n; j++) {
                a[j]=sc.nextInt();
            }
            boolean tmp=false;
            for (int j = 0; j < n; j++) {
                for (int k = j+1; k <n; k++) {
                    if(a[j]<a[k]) {
                        System.out.print(a[k] + " ");
                        tmp = true;
                        break;
                    }
                }
                if(tmp==false){
                    System.out.printf(-1+" ");
                }
                tmp=false;
            }
            System.out.println();
        }
    }
}
