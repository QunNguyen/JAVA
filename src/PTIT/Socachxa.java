package PTIT;

import java.util.Arrays;
import java.util.Scanner;

/**
 * SoCachXa
 */
public class Socachxa {
    public static int x[]= new int[11],n;
    public static boolean ok[] = new boolean[11];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            n = scanner.nextInt();
            Arrays.fill(ok,false);
            Try(1);
        }
    }
    public static void Try(int i){
        for(int j= 1; j<= n; j++){
            if(!ok[j]){
                x[i] = j;
                ok[j] = true;
                if(i==n){
                    if(check()){
                        out();
                        System.out.print('\n');
                    }
                } else Try(i+1);
                ok[j] = false;
            }

        }
    }
    public static void out(){
        for(int i=1; i<= n; i++){
            System.out.print(x[i]);
        }
    }
    public static boolean check(){
        for(int i=2; i<=n; i++){
            if(Math.abs(x[i]-x[i-1])==1){
                return false;
            }
        }
        return true;
    }
}