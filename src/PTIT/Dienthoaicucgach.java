package PTIT;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Dienthoaicucgach {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String s=sc.nextLine();
            String tmp=chuyen(chuthuong(s));
//            System.out.println(tmp);
            if(check(tmp)==1){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }

    public static int check(String s){
        int n=s.length();
        for (int i = 0; i <=n/2 ; i++) {
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return 0;
            }
        }
        return 1;
    }

    public static String chuthuong(String s){
        StringBuilder a=new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            a.append(Character.toLowerCase(s.charAt(i)));
        }
        return a.toString();
    }

    public static String chuyen(String s){
        Map<Character,String> num=new HashMap<>();
        num.put('a',"2");
        num.put('b',"2");
        num.put('c',"2");
        num.put('d',"3");
        num.put('e',"3");
        num.put('f',"3");
        num.put('g',"4");
        num.put('h',"4");
        num.put('i',"4");
        num.put('j',"5");
        num.put('k',"5");
        num.put('l',"5");
        num.put('m',"6");
        num.put('n',"6");
        num.put('o',"6");
        num.put('p',"7");
        num.put('q',"7");
        num.put('r',"7");
        num.put('s',"7");
        num.put('t',"8");
        num.put('u',"8");
        num.put('v',"8");
        num.put('w',"9");
        num.put('x',"9");
        num.put('y',"9");
        num.put('z',"9");
        String a="";
        for (int i = 0; i <s.length(); i++) {
            a+=num.get(s.charAt(i));
        }
        return a.toString();
    }
}
