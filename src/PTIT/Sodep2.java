package PTIT;

import java.util.Scanner;

public class Sodep2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String a=sc.nextLine();
            if (check(a)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }

    public static int check(String a){
        int n=a.length();
        if(a.charAt(0)!='8'&&a.charAt(n-1)!='8')return 0;
        long tong=0;
        for (int i = 0; i < n; i++) {
            int x=(int)(a.charAt(i)-'0');
            tong+=x;
        }
        if(tong%10==0) return 1;
        else return 0;
    }
}

