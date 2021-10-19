package PTIT;

import java.util.Scanner;



public class Demsolanxuathien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        for(int k=1;k<=t;k++) {
            int n;
            n=sc.nextInt();
            int[]a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]= sc.nextInt();
            }
            int []b=new int[n];
            for (int i = 0; i < n; i++) {
                b[i]=1;
            }
            System.out.println("Test "+k+":");
            for (int i = 0; i < n; i++) {
                int dem=1;
                if(b[i]!=0){
                    b[i]=0;
                    for (int j = i+1; j < n; j++) {
                        if(a[i]==a[j]){
                            dem++;
                            b[j]=0;
                        }
                    }
                    System.out.println(a[i]+" xuat hien "+dem+" lan");
                }
            }
        }
    }
}

