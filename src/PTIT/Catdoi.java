package PTIT;

import java.util.Scanner;

public class Catdoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String s=sc.nextLine();
            catdoi(s);
            System.out.println();
        }
    }
    public static void catdoi(String s){
        char[]c=s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(c[i]=='1'){
                c[i]='1';
            }
            if(c[i]=='0'){
                c[i]='0';
            }
            if(c[i]=='8'){
                c[i]='0';
            }
            if(c[i]=='9'){
                c[i]='0';
            }
        }
        if (check(c)==1){
            int i=0;
            int dem=0;
            while (i<c.length){
                if(c[i]=='0'&&dem==0){
                    i++;
                }
                else dem++;
                if(dem>0){
                    System.out.print(c[i]);
                    i++;
                }
            }
        }
        else System.out.printf("INVALID");
    }
    public static int check(char[] c){
        for (int i = 0; i < c.length; i++) {
            if(c[i]!='0'&&c[i]!='1')
                return 0;
        }
        int dem=0;
        for (int i = 0; i < c.length; i++) {
            if(c[i]=='0') dem++;
        }
        if(dem==c.length) return 0;
        return 1;
    }
}
