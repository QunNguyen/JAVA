package PTIT;

import java.util.Scanner;
import java.util.Stack;

public class Thudondayso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.nextLine());
        Stack<Integer> a = new Stack<>();
        int dem = 0;
        while (dem < n) {
            int x = sc.nextInt();
            if (a.empty()) {
                a.push(x);
                dem++;
                continue;
            }
            int y = x + a.peek();
            if (y % 2 == 0) {
                a.pop();
                dem++;
            }
            if (y % 2 != 0) {
                a.push(x);
                dem++;
            }
        }
        System.out.println(a.size());
    }
}