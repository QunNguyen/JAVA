package PTIT;

import java.util.Scanner;

public class Xulivanban {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean check=false;
        while (sc.hasNext()){
           String s=sc.next();
           if(check==false){
               System.out.print(chuanhoa(s)+" ");
               check=true;
           } else System.out.print(chuanhoa1(s)+" ");
           if(s.charAt(s.length()-1)=='!'||s.charAt(s.length()-1)=='?'||s.charAt(s.length()-1)=='.')
            {
                System.out.println();
                check=false;
            }
        }
    }
    public static String chuanhoa(String s ){
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if(i==0){
                sb.append(Character.toUpperCase(s.charAt(i)));
            }
            else sb.append(Character.toLowerCase(s.charAt(i)));
        }
        return sb.toString();
    }

    public static String chuanhoa1(String s){
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
             if(s.charAt(i)!='!'&&s.charAt(i)!='?'&&s.charAt(i)!='.') {
                 sb.append(Character.toLowerCase(s.charAt(i)));
             }
        }
        return sb.toString();
    }
}
