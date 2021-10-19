package PTIT;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Songuyento {

    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        n=Integer.parseInt(sc.nextLine());
        while(n>0)
        {
            int s;
            s=Integer.parseInt(sc.nextLine());
            if(s<2) System.out.println("NO");
            else
            {
                int dem=0;
                for (int i = 2; i < sqrt(s); i++) {
                    if(s%i==0)
                    {
                        System.out.println("NO");
                        dem++;
                        break;
                    }
                }
                if(dem==0) System.out.println("YES");
            }
            n--;
        }
    }
}


