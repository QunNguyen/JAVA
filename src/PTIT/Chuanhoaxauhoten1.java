package PTIT;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Chuanhoaxauhoten1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s=sc.nextLine();
            StringTokenizer c= new StringTokenizer(s);
            while (c.hasMoreTokens())
            {
                System.out.print(chuanhoa(c.nextToken())+" ");
            }
            System.out.println();
        }
    }

    public static String chuanhoa(String s){
        String a="";
        for (int i = 0; i < s.length(); i++) {
            if(i==0) a+=Character.toUpperCase(s.charAt(i));
            else a+=Character.toLowerCase(s.charAt(i));
        }
        return a.toString();
    }
}
