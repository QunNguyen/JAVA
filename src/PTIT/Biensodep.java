package PTIT;

import java.util.Scanner;

public class Biensodep {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while (t-->0){
            String s= sc.nextLine();
            char a[]=new char[s.length()];
            for (int i = 0; i < a.length; i++) {
                a[i]=s.charAt(i);
            }
            if(asc(a)||eq(a)||pr(a)){
                System.out.println("YES");
            }
            else System.out.println("NO");

        }
    }

    static boolean asc(char a[])
    {
        if(a[5] < a[6] && a[6] < a[7] && a[7] < a[9] && a[9] < a[10])
        {
            return true;
        }
        return false;
    }
    static boolean eq(char a[])
    {
        boolean check1 = false, check2 = false;
        if(a[5] == a[6] && a[6] == a[7])
        {
            check1 = true;
        }
        if(a[9] == a[10])
        {
            check2 = true;
        }
        if(check1 && check2) return true;

        return false;
    }
    static boolean pr(char a[])
    {
        if(a[5] != '6' && a[5] != '8') return false;
        if(a[6] != '6' && a[6] != '8') return false;
        if(a[7] != '6' && a[7] != '8') return false;
        if(a[9] != '6' && a[6] != '8') return false;
        if(a[10] != '6' && a[10] != '8') return false;
        return true;
    }
}
