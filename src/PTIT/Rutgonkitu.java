package PTIT;

import java.util.Scanner;
import java.util.Stack;

public class Rutgonkitu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.nextLine();
        while (check(a)==0) {
            for (int i = 0; i < a.length() - 1; i++) {
                if (a.charAt(i) == a.charAt(i + 1)) {
                    a = rutgon(a, i);
                }
            }
        }
        if(a.length()<=0){
            System.out.println("Empty String");
        }
        else System.out.println(a);
    }
    public static String rutgon(String s ,int i){
        return s.substring(0,i)+s.substring(i+2);
    }
    public static int check(String s){
        for (int i = 0; i < s.length()-1; i++) {
            if(s.charAt(i)==s.charAt(i+1)){
                return 0;
            }
        }
        return 1;
    }
}
