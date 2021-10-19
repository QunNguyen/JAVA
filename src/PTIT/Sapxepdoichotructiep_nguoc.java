package PTIT;

import java.util.ArrayList;
import java.util.Scanner;



public class Sapxepdoichotructiep_nguoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            ArrayList<String> arr = new ArrayList<>();
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
                String ass = "";
                ass = "Buoc " + (k + 1) + ": ";
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
}

