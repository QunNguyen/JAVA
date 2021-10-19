package Baitaplon;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        for (int i = 1; i <= n; i++) {
            x += i;
        }
        System.out.println("tổng 1+2+3+...+n: " + x);
        int y = 1;
        for (int i = 1; i <= n; i++) {
            y *= i;
        }
        System.out.println("tích 1.2.3...n: " + y);
        int z = 0;
        int v = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                z += i;
            } else v += i;
        }
        System.out.println("tong cac so chan: " + z);
        System.out.println("tong cac so le: " + v);
        System.out.print("Cac so nguyen to: ");
        for (int i = 1; i <= n; i++) {
            if (checksnt(i) == 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Uoc so nguyen to: ");
        int tmp = n;
        for (int i = 2; i <= tmp; i++) {
            int dem = 0;
            while (tmp % i == 0) {
                if (dem == 0) System.out.print(i + " ");
                dem++;
                tmp /= i;
            }
        }
        System.out.println();
        long[] f = new long[(n + 1)];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        System.out.println("So Fibonacci thu " + n + ": " + f[n]);
        System.out.print("Liet ke cac so Fibonacci nho hon " + n + ": ");
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
            System.out.print(f[i] + " ");
        }
        System.out.println();
        System.out.println("Xau nhi phan do dai " + n + ": ");
        xaunhiphan(n);
    }

    public static int checksnt(int n) {
        if (n < 2) return 0;
        else {
            for (int i = 2; i <= sqrt(n); i++) {
                if (n % i == 0) return 0;
            }
        }
        return 1;
    }

    public static void xaunhiphan(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i]);
        }
        System.out.println();
        int i = n - 1;
        while (i > 0) {
            if (a[i] == 1) i--;
            if (a[i] == 0) {
                a[i] = 1;
                for (int j = i + 1; j < n; j++) {
                    a[j] = 0;
                }
                for (int k = 0; k < n; k++) {
                    System.out.print(a[k]);
                }
                i = n - 1;
                System.out.println();
            }
        }
    }
}
