package PTIT;

import java.util.ArrayList;
import java.util.Scanner;

public class Sapxepnoibot_nguoc {
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
            int dem = 1;
            for (int i = 0; i < n - 1; i++) {
                int check = 0;
                for (int j = 1; j < n; j++) {
                    if (a[j] < a[j - 1]) {
                        check = 1;
                        int tmp = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = tmp;
                    }
                }
                if (check == 0) continue;
                String ass = "";
                ass = "Buoc " + dem + ": ";
                for (int k = 0; k < n; k++) {
                    ass += a[k] + " ";
                }
                arr.add(ass);
                dem++;
            }
            for (int i = arr.size() - 1; i >= 0; i--) {
                System.out.println(arr.get(i));
            }
        }
    }
}
