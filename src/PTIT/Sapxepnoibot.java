package PTIT;

import java.util.Scanner;

public class Sapxepnoibot {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]= sc.nextInt();
        }
        int dem=1;
        for (int i = 0; i < n-1; i++) {
            int check=0;
            for (int j = 1; j <n ; j++) {
                if(a[j]<a[j-1]){
                    check=1;
                    int tmp=a[j];
                    a[j]=a[j-1];
                    a[j-1]=tmp;
                }
            }
            if(check==0) continue;
            System.out.print("Buoc "+dem+": ");
            for (int k = 0; k < n; k++) {
                System.out.print(a[k]+" ");
            }
            dem++;
            System.out.println();
        }
    }
}
