package PTIT;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Uocsochiahetcho2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n= sc.nextLong();
            long count=0,j;


            for ( j = 1; j <= sqrt(n); j++)
            {

                if (n % j == 0)
                {
                    if (j % 2 == 0)
                    {
                        count++;
                    }

                    if ((n / j) % 2 == 0)
                    {
                        count++;
                    }
                }
            }

            j--;

            if ((j * j == n) && (j % 2 == 0))
            {
                count--;
            }
            System.out.println(count);
        }
    }
}

