package PTIT;

import java.util.Scanner;

public class Sodep3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s=sc.nextLine();
            if (check(s)==1&&check1(s)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static int check(String s){
        int n= s.length()-1;
        for (int i = 0; i <n/2; i++) {
            if(s.charAt(i)!=s.charAt(n-i)) return 0;
        }
        return 1;
    }
    public static int check1(String s){
        for (int i = 0; i < s.length(); i++) {
            int x =(int)(s.charAt(i)-'0');
            if (x==1 || x==0 || x==4 || x ==6||x==8||x==9) return 0;
        }
        return 1;
    }
}

