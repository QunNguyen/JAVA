package Baitaplon;

import java.util.Scanner;

public class dayuuthe  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while (t-->0){
            String s=sc.nextLine();
            if (check1(s)==1) {
                if (check(s) == 1) {
                    System.out.println("YES");
                } else System.out.println("NO");
            }
            else System.out.println("INVALID");

        }
    }
    public static int check1(String s){
        char[]a=s.toCharArray();
        for (int i = 0; i <a.length ; i++) {
            int x=(int)(a[i]-'0');
            if(x<0||x>9) return 0;
        }
        return 1;
    }
    public static int check(String s){
        char a[]=s.toCharArray();
        int n=a.length;
        int demle=0;
        int demchan=0;
        for (int i = 0; i < a.length; i++) {
            int x=(int)(a[i]-'0');
            if(x%2==0){
                demchan++;
            }
            else demle++;
        }
        if(demchan>demle&&n%2==0) return 1;
        if(demle>demchan&&n%2!=0) return 1;
        return 0;
    }
}
