package PTIT;

import java.util.Queue;
import java.util.Scanner;

public class So0va9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            System.out.println(slo(n));
        }
    }
    public static String slo(int n)
    {
        Queue<String> a=null;
        a.add("9");
        while (a.size() > 0)
        {
            String res = a.poll();
            a.remove();
            long tmp = 0;
            for (int i = 0; i < res.length(); i++)
            {
                tmp = 10 * tmp + (int)(res.charAt(i) - '0');
                tmp %= n;
            }
            if (tmp == 0)
            {
                return res;
            }
            a.add(res + "0");
            a.add(res + "9");
        }
        return "a";
    }
}
