package PTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class sapxepsinhvientheolop {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<sinhvienlop>sv=new ArrayList<>();
        for (int i = 0; i < t; i++) {
            sinhvienlop std=new sinhvienlop();
            std.input(sc);
            sv.add(std);
        }
        Collections.sort(sv, new Comparator<sinhvienlop>() {
            @Override
            public int compare(sinhvienlop o1, sinhvienlop o2) {
                if(o1.lop.compareTo(o2.lop)<0){
                    return -1;
                }
                if(o1.lop.compareTo(o2.lop)==0){
                    if(o1.msv.compareTo(o2.msv)<0){
                        return -1;
                    }
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
class sinhvienlop {
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
