package PTIT;

import java.util.Arrays;
import java.util.Scanner;

public class CapsotongbangK {
    public static void solution(Scanner sc)
    {
        int N = sc.nextInt();
        long K = sc.nextLong();
        long[] A = new long[N];
        for(int i = 0; i < N; i++)
        {
            A[i] = sc.nextLong();
        }
        Arrays.sort(A);
        long Ans = 0;
        for(int i = 0; i < N-1; i++)
        {
            long R = upperBound(A,i+1,N-1,K-A[i]);
            long L = lowerBound(A,i+1,N-1,K-A[i]);
            if(L <= N-1)
            {
                Ans += R - L + 1;
            }
        }
        System.out.println(Ans);
    }
    public static long lowerBound(long[] A,int L,int R, long K)
    {
        int Ans = R+1;
        while(L <= R)
        {
            int Mid = (L + R) / 2;
            if(A[Mid] == K)
            {
                Ans = Mid;
                R = Mid - 1;
            }
            else
            {
                if(A[Mid] >= K)
                {
                    R = Mid -1;
                }
                else
                {
                    L = Mid + 1;
                }
            }
        }
        return Ans;
    }
    public static long upperBound(long[] A,int L,int R, long K)
    {
        int Ans = R+1;
        while(L <= R)
        {
            int Mid = (L + R) / 2;
            if(A[Mid] == K)
            {
                Ans = Mid;
                L = Mid + 1;
            }
            else
            {
                if(A[Mid] >= K)
                {
                    R = Mid - 1;
                }
                else
                {
                    L = Mid + 1;
                }
            }
        }
        return Ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            solution(sc);
        }
    }
}