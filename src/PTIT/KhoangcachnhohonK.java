package PTIT;

import java.util.Scanner;

import static java.lang.Math.abs;

public class KhoangcachnhohonK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            int dem=0;
            for (int i = 0; i < n-1; i++) {
                for (int j = i+1; j < n; j++) {
                    if(abs(a[i]-a[j])<k){
                        dem++;
                    }
                }
            }
            System.out.println(dem);
        }
    }
}
