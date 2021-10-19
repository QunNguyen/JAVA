package PTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Lietkesinhvientheolop {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<sinhvienlop2> sv=new ArrayList<>();
        for (int i = 0; i < t; i++) {
            sinhvienlop2 std=new sinhvienlop2();
            std.input(sc);
            sv.add(std);
        }
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<String> tv=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s=sc.nextLine();
            tv.add(s);
        }
        for (int i = 0; i < tv.size(); i++) {
            System.out.println("DANH SACH SINH VIEN LOP "+tv.get(i)+":");
            for (int j = 0; j < sv.size(); j++) {
                if(tv.get(i).equalsIgnoreCase(sv.get(j).lop)){
                    sv.get(j).show();
                    System.out.println();
                }
            }
        }

    }
}
class sinhvienlop2 {
    String lop;
    String ten;
    String msv;
    String email;

    public void input(Scanner sc) {
        msv = sc.nextLine();
        ten = sc.nextLine();
        lop = sc.nextLine();
        email = sc.nextLine();
    }

    public void show() {
        System.out.print(msv + " " + ten + " " + lop + " " + email);
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }
}
