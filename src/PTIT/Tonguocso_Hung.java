/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PTIT;

import java.util.Scanner;

/**
 *
 * @author hoang
 */
public class Tonguocso_Hung {
    private static void Sang(int ...pre){
        for(int i = 1; i <= 2000000; i++){
            pre[i] = i;
        }
        for(int i = 2; i <= Math.sqrt(20000000); i++){
            for(int j = i*i; j <= 2000000; j+=i){
                if(pre[j] == j){
                    pre[j] = i;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] pre = new int[2000001];
        Sang(pre);
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        long sum = 0;
        while(test >= 1){
            int n = sc.nextInt();
            while(n != 1){
                long tmp = pre[n];
                while(n% tmp == 0){
                    n /= tmp;
                    sum += (long)tmp;
                }
            }
            test--;
        }
        System.out.println(sum);
    }
}