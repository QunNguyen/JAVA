package PTIT;


import java.util.Scanner;

public class Sapxepchon {
    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int []a=new int[n];
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        int min,index = 0;
        for (int i = 0; i < n-1; i++)
        {
            min=a[i];
            for (int j = i+1; j <n ; j++) {
                if(a[j]<min)
                {
                    min=a[j];
                    index=j;
                }
            }
            int tmp=a[i];
            a[i]=min;
            a[index]=tmp;
            System.out.printf("Buoc "+(i+1)+": ");
            for (int j = 0; j < n; j++) {
                System.out.printf(a[j]+" ");
            }
            System.out.println();
        }

    }
}

