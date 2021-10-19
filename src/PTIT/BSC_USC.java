package PTIT;

import java.util.Scanner;

public class BSC_USC {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            long a,b;
            a=sc.nextLong();
            b=sc.nextLong();
            int gcd=1;
            for(int j = 1; j <= a && j <= b; j++)
            {
                if(a% j ==0 && b% j ==0)
                    gcd = j;
            }
            long lcm =(a*b)/gcd;
            System.out.println(lcm+" "+gcd);
        }
    }

}

