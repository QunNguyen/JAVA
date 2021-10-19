package PTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Lietkesinhvientheokhoa {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<sinhvienlop3> sv=new ArrayList<>();
        for (int i = 0; i < t; i++) {
            sinhvienlop3 std=new sinhvienlop3();
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
            System.out.println("DANH SACH SINH VIEN KHOA "+tv.get(i)+":");
            for (int j = 0; j < sv.size(); j++) {
                if(tv.get(i).equalsIgnoreCase(sv.get(j).tmp)){
                    sv.get(j).show();
                    System.out.println();
                }
            }
        }

    }
}
class sinhvienlop3 {
    String lop;
    String ten;
    String msv;
    String email;
    String tmp;

    public void input(Scanner sc) {
        msv = sc.nextLine();
        ten = sc.nextLine();
        lop = sc.nextLine();
        email = sc.nextLine();
        tmp=tach(lop);
    }

    public static String tach(String s){
        StringBuilder sb=new StringBuilder("20");
        sb.append(s.charAt(1));
        sb.append(s.charAt(2));
        return sb.toString();
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

    public String getTmp() {
        return tmp;
    }

    public void setTmp(String tmp) {
        this.tmp = tmp;
    }
}
