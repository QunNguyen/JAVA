package PTIT;

import java.util.Scanner;
import java.lang.String;

public class Sodep1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s;
            s= sc.nextLine();
            if(check(s)==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static int check(String s){
        int n=s.length()-1;
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i)!=s.charAt(n-i)||s.charAt(i)%2!=0){
                return 0;
            }
        }
        return 1;
    }
}

