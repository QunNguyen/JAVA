package PTIT;

import java.util.Scanner;

import static java.lang.Math.abs;

public class Chuso4va7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=1;
        for (int i = 0; i < t; i++) {
            String s=sc.nextLine();
            if (check(s)==1){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
    public static int check(String s){
        int dem4=0;
        int dem7=0;
        for (int i = 0; i < s.length(); i++) {
            int x=(int) (s.charAt(i)-'0');
            if(x==4){
                dem4++;
            }
            if (x==7){
                dem7++;
            }
        }
        if (dem4+dem7==4||dem4+dem7==7){
            return 1;
        }
        return 0;
    }
}
