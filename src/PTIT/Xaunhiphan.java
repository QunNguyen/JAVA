package PTIT;

import java.util.ArrayList;
import java.util.Scanner;

public class Xaunhiphan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        while (t-->0){
            int n= sc.nextInt();
            int  k= sc.nextInt();
            String []a=new String[n+1];
            a[0]="";
            a[1]="0";
            a[2]="1";
            for (int i = 3; i <=n ; i++) {
                StringBuilder sb=new StringBuilder("");
                sb.append(a[i-2]);
                sb.append(a[i-1]);
                a[i]= sb.toString();
//                System.out.println(a[i]);
            }
            System.out.println(a[n].charAt(k-1));
        }
    }
}




//package xau_nhi_phan;
//
//import java.util.Scanner;
//
//
//public class Xau_Nhi_Phan {
//
//    public static void main(String[] args) {
//        int t;
//        Scanner sc = new Scanner(System.in);
//        t = Integer.parseInt(sc.nextLine());
//        long a[] = new long[100];
//        a[0] = 0;
//        a[1] = 1;
//        for(int i = 2; i <= 92; i++)
//        {
//            a[i] = a[i-1]+a[i-2];
//        }
//        while(t > 0)
//        {
//            int n = sc.nextInt();
//            long k = sc.nextLong();
//            System.out.println(Fi(n, k, a));
//            t--;
//        }
//    }
//
//    public static String Fi(int n, long k, long a[]){
//        if(n == 1)
//            return "0";
//        if(n == 2)
//            return "1";
//        if(k <= a[n-2])
//            return Fi(n-2, k, a);
//        return Fi(n-1 ,k - a[n-2], a);
//    }
//}
