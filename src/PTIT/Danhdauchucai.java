package PTIT;

import java.util.Scanner;
import java.util.Vector;

public class Danhdauchucai {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Vector<Character> a=new Vector<>();
        for (int i = 0; i < s.length(); i++) {
            if(check(a,s.charAt(i))==1){
                a.add(s.charAt(i));
            }
        }
        System.out.println(a.size());

    }
    public static int check(Vector a, char s){
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).equals(s)){
                return 0;
            }
        }
        return 1;
    }
}
