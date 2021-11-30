package PTIT;

import java.util.Scanner;
import java.util.Stack;

public class Kiemtradayngoacdung {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while (t-->0){
            String s= sc.nextLine();
            int index=0;
            for (int i = 0; i < s.length(); i++) {
               if(s.charAt(i)=='['||s.charAt(i)=='{'||s.charAt(i)=='('){
                   index++;
               }
               if(s.charAt(i)==']'||s.charAt(i)=='}'||s.charAt(i)==')'){
                   index--;
               }
            }
            if(index==0){
                System.out.println("YES");
            }else System.out.println("NO");
        }
    }
}
