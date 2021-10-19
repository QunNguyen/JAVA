package PTIT;

import java.util.Scanner;

public class Xaudoixung {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String s= sc.nextLine();
            if(s.length()%2==0) {
                if (check(s) == 1) System.out.println("YES");
                else System.out.println("NO");
            }
            else {
                if (check(s) == 1||check(s)==0) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
    public static int check(String s){
        int dem=0;
        int n=s.length();
        for (int i = 0; i < n/2; i++) {
            if(s.charAt(i)!=s.charAt(n-1-i)) dem++;
        }
       return dem;
    }
}
