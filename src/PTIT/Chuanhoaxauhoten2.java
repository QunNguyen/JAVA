package PTIT;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Chuanhoaxauhoten2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String s=sc.nextLine();
            StringTokenizer c= new StringTokenizer(s);
            String[] arr =new String[100];
            int k=0;
            while (c.hasMoreTokens())
            {
                arr[k]=chuanhoa(c.nextToken());
                k++;
            }
            int dem=0;
            for (int j = 1; j < k; j++) {
                System.out.print(arr[j]);
                dem++;
                if(dem<k-1) System.out.print(" ");
            }
            System.out.println(", "+chuanhoachuHOA(arr[0]));
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
    public static String chuanhoachuHOA(String s){
        String a="";
        for (int i = 0; i < s.length(); i++) {
            a+=Character.toUpperCase(s.charAt(i));
        }
        return a.toString();
    }
}

