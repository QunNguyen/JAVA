package PTIT;

import java.util.Scanner;

public class Kiemtrasofibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n= sc.nextLong();
            long f0=0,f1=1,fn = 0;
            while(f0+f1<=n){
                fn=f0+f1;
                f0=f1;
                f1=fn;
            }
            if(fn==n||n==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }

}
