package PTIT;

import java.util.Scanner;

public class Sotmaphan {
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
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!='0'&&s.charAt(i)!='1'&&s.charAt(i)!='2'){
                return 0;
            }
        }
        return 1;
    }
}
