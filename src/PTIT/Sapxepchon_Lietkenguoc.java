package PTIT;

import java.util.ArrayList;
import java.util.Scanner;

public class Sapxepchon_Lietkenguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int min, index = 0;
        for (int i = 0; i < n - 1; i++) {
            min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int tmp = a[i];
            a[i] = a[min];
            a[min] = tmp;
            String ass = "";
            ass = "Buoc " + (i + 1) + ": ";
            for (int j = 0; j < n; j++) {
                ass += a[j] + " ";
            }
            arr.add(ass);
        }
        for (int i = arr.size() - 1; i >= 0; i--) {
            System.out.println(arr.get(i));
        }
    }
}
