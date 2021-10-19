package PTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Sapxeptheomasinhvien {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        ArrayList<sinhvienlop1>sv=new ArrayList<>();
        while(sc.hasNext()) {
            sinhvienlop1 std=new sinhvienlop1();
            std.input(sc);
            sv.add(std);
        }
        Collections.sort(sv, new Comparator<sinhvienlop1>() {
            @Override
            public int compare(sinhvienlop1 o1, sinhvienlop1 o2) {
                    if(o1.msv.compareTo(o2.msv)<0) {
                        return -1;
                    }
                return 1;
            }
        });
        for (int i = 0; i < sv.size(); i++) {
            sv.get(i).show();
            System.out.println();
        }
    }
}
class sinhvienlop1 {
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
