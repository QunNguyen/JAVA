package PTIT;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Solienke {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String s=sc.nextLine();
            if (check(s)==1){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
    public static int check(String s){
        for (int i = 0; i < s.length()-1; i++) {
            int x=(int) (s.charAt(i)-'0');
            int y=(int) (s.charAt(i+1)-'0');
            if(abs(x-y)!=1) return 0;
        }
        return 1;
    }
}
