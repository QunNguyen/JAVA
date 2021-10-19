package PTIT;

import java.util.Scanner;

public class Phantichthuasonguyento {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n= sc.nextInt();
            System.out.print("Test "+(i+1)+": ");
            for (int j = 2; j <=n; j++) {
                int dem=0;
                while(n%j==0){
                    dem++;
                    n/=j;
                }
                if(dem!=0)System.out.print(j+"("+dem+")"+" ");
            }
            System.out.println();
        }
    }
}
