package PTIT;

import java.util.Scanner;

public class Mangdoixung {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t;
        t=Integer.parseInt(sc.nextLine());
        while(t>0)
        {
            int n;
            n= sc.nextInt();
            int []a=new int[n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            int dem=0;
            for (int i = 0; i < n/2; i++) {
                if(a[i]!=a[n-1-i])
                {
                    System.out.println("NO");
                    dem++;
                    break;
                }
            }
            if(dem==0) System.out.println("YES");
            t--;
        }

    }
}

