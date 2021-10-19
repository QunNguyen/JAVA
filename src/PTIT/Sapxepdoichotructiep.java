package PTIT;

import java.util.Scanner;

public class Sapxepdoichotructiep {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int k = 0; k < n - 1; k++) {
            for (int j = k + 1; j < n; j++) {
                if (a[k] > a[j]) {
                    int tmp = a[k];
                    a[k] = a[j];
                    a[j] = tmp;
                }
            }
            System.out.print("Buoc " + (k + 1) + ": ");
            for (int j = 0; j < n; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
        }
    }
}

