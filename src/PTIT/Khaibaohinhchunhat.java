package PTIT;

import java.util.Scanner;

public class Khaibaohinhchunhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();
        if(n<=0||m<=0)
        {
            System.out.println("INVALID");
        }
        else System.out.println(2*(m+n)+" "+(m*n)+" "+ChuanHoa(s));
    }
    public static String ChuanHoa (String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length();i++)
        {
            if(i==0) sb.append(Character.toUpperCase(s.charAt(i)));
            else sb.append(Character.toLowerCase(s.charAt(i)));
        }
        return sb.toString();
    }
}