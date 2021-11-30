package PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Loppair {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("src/Baitaplon/1.txt"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break;
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}

class Pair<T,T1>{
    int n,n1;
    public Pair(int i, int i1) {
        n=i;
        n1=i1;
    }

    public boolean isPrime() {
        if(check(n)&&check(n1)){
            return true;
        }
        return false;
    }
    public boolean check(int n){
        if(n<2) return false;
        else {
            for (int i = 2; i <=Math.sqrt(n); i++) {
                if(n%i==0) return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        return n+" "+n1;
    }
}


