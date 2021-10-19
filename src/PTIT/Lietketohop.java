package PTIT;

import java.util.Scanner;

public class Lietketohop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[k];
        for (int i = 0; i < k; i++) {
            a[i] = i + 1;
        }
        in(a, k);
        int h = k-1;
        int dem=0;
        while (h > 0)
        {
            if (a[h] == n - k + h + 1) h--;
            if (a[h] < n - k + h + 1) {
                a[h] += 1;
                int tmp = a[h]+1;
                for (int j = h + 1; j < k; j++) {
                    a[j] = tmp;
                    tmp++;
                }
                in(a, k);
                dem++;
                h = k - 1;
            }
        }
        System.out.println();
        System.out.println("Tong cong co "+(dem+1)+" to hop");
    }
    public static void in(int []a, int n){
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }
}
