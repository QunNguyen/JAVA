package PTIT;

import java.util.Scanner;

public class Bosungdayso {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int max=0;
        for (int i = 0; i <n; i++) {
           a[i]=sc.nextInt();
           if(a[i]>max) max=a[i];
        }
        boolean tmp=false;
        int dem=0;
        for (int i = 1; i <=max; i++) {
            for (int j = 0; j < n; j++) {
                if(a[j]==i){
                    dem++;
                    tmp=true;
                    break;
                }
            }
            if(tmp==false) System.out.println(i);
            tmp=false;
        }
        if(dem==max) System.out.println("Excellent!");
    }
}
