package Baitaplon;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;

public class Giao2mangr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m= sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        Vector c=new Vector<>();
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]){
                    c.add(a[i]);
                }
            }
        }
        Arrays.sort(new Vector[]{c});
        for (int i = 0; i < c.size(); i++) {
            System.out.print(c.get(i)+" ");
        }
    }

}