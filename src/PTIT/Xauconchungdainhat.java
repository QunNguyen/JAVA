package PTIT;

import java.util.Scanner;

import static java.lang.Math.max;

public class Xauconchungdainhat {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while(t-->0){
            String a=sc.nextLine();
            String b=sc.nextLine();
            if(a.equalsIgnoreCase(b)){
                System.out.println("-1");
            }
            else {
                System.out.println(max(a.length(),b.length()));
            }
        }

    }
}
