package PTIT;

import java.util.Scanner;

public class DayconlientiepcotongbangK {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0) {
            long n = sc.nextLong();
            long k=sc.nextLong();
            long a[]=new long[(int) n];
            for (int i = 0; i < n; i++) {
                a[i]=sc.nextInt();
            }
            int j=0;
            int dem=1;
            boolean check=false;
            long sum=k;
            while (j<n){
                sum-=a[j];
                j++;
                if(sum==0){
                    check=true;
                    System.out.println("YES");
                    break;
                }
                if (sum<0){
                    j=dem;
                    dem++;
                    sum=k;
                }
            }
            if (check==false) System.out.println("NO");
        }
    }
}
