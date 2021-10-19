package PTIT;

import java.util.Scanner;

public class Hopcuahaidayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] A = new int[1001];
        for(int i = 0; i < N; i++)
        {
            int tmp = sc.nextInt();
            A[tmp] = 1;
        }
        for(int i = 0; i < M; i++)
        {
            int tmp = sc.nextInt();
            A[tmp] = 1;
        }
        for(int i = 0; i < A.length; i++)
        {
            if(A[i] == 1)
            {
                System.out.print(i +" ");
            }
        }
    }
}
