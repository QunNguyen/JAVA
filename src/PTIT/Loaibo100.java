package PTIT;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Loaibo100 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        while(t-->0) {
            String s = sc.nextLine();
            int sum=0;
            for (int i = 0; i < s.length()-2; i++) {
                if(s=="") break;
                if(s.charAt(i)=='1'&&s.charAt(i+1)=='0'&&s.charAt(i+2)=='0'){
                    sum+=3;
                    s=removeCharAt(s,i);
                    s=removeCharAt(s,i+1);
                    s=removeCharAt(s,i+2);
                    i=-1;
                }
            }
            if(sum>0) System.out.println(sum);
        }
    }
    public static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}