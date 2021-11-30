package PTIT;

import java.util.Scanner;

public class Daotu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while (t-->0){
            String s=sc.nextLine();
            String a[]=s.split("\\s");
            for (int i = 0; i < a.length; i++) {
                for (int j = a[i].length()-1; j >=0 ; j--) {
                    System.out.print(a[i].charAt(j));
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
