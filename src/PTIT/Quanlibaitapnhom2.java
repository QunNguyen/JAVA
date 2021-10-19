package PTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Quanlibaitapnhom2 {
    public static void main(String[] args) {
        ArrayList<nhom1> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            nhom1 std = new nhom1();
            std.input(sc);
            a.add(std);
        }
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            String s = sc.nextLine();
            for (int j = 0; j < a.size(); j++) {
                if (a.get(j).sonhom == i) {
                    a.get(j).de(s);
                }
            }
        }

        Collections.sort(a, new Comparator<nhom1>() {
            @Override
            public int compare(nhom1 o1, nhom1 o2) {
                if (o1.msv.compareTo(o2.msv) < 0) {
                    return -1;
                }
                return 1;
            }
        });

        for (int j = 0; j < a.size(); j++) {
            a.get(j).show();
            System.out.print(" " + a.get(j).detai);
            System.out.println();
        }
    }
}
class nhom1{
    String msv;
    String ten;
    String sdt;
    int sonhom;
    String detai;

    public void input(Scanner sc){
        msv=sc.nextLine();
        ten=sc.nextLine();
        sdt=sc.nextLine();
        sonhom=Integer.parseInt(sc.nextLine());
    }

    public void de(String s){
        detai=s;
    }
    public void show(){
        System.out.print(msv+" "+ten+" "+sdt+" "+sonhom);
    }

}
