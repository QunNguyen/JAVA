package PTIT;

import java.util.Scanner;

public class Luachonthamlam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = sc.nextInt();
        solve(s, n);
    }

    public static void solve(int s, int m){
        int s1 = s;
        int[] small = new int[m];
        int[] big = new int[m];

        if((s == 0 && m != 1) || (s > 9 * m)){
            System.out.println("-1 -1");
            return;
        }

        for(int i = 0; i < m; i++){
            if(s1 >= 9){
                big[i] = 9; s1 -=9;
            }
            else{
                big[i] = s1; s1 = 0;
            }
        }
        --s;
        for(int i = m - 1; i > 0; i--){
            if(s >= 9){
                small[i] = 9; s -= 9;
            }
            else{
                small[i] = s; s = 0;
            }
        }
        small[0] = 1 + s;
        for(int x : small)
            System.out.print(x);
        System.out.print(" ");
        for(int x : big)
            System.out.print(x);
    }
}
