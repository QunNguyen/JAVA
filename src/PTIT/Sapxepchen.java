package PTIT;

import java.util.*;

public class Sapxepchen {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[]a=new  int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[]b= new int[n];
        int j=0;
        for (int i = 0; i < n; i++) {
            b[j]=a[i];
            Arrays.sort(b);
            System.out.printf("Buoc "+i+": ");
            for (int k = 0; k < n; k++) {
                if(b[k]!=0) System.out.print(b[k]+" ");
            }
            System.out.println();
        }
    }
}

