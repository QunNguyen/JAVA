package PTIT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baitoantinhcong {
    public static void main(String[] args) {
        List<nhanvien8> nhanvien=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int t= 1;
        for (int i = 1; i <=t; i++) {
            nhanvien8 std=new nhanvien8();
            std.input(sc,i);
            nhanvien.add(std);
        }
        for (int i = 0; i < nhanvien.size(); i++) {
            nhanvien.get(i).show();
            System.out.println();
        }
    }
}
class nhanvien8{
    String ten;
    int luongngay;
    int songaycong;
    String chucvu;
    int ma;
    int luongthang;
    double thuong;
    double thuclinh;

    public void input(Scanner sc, int n){
        ma=n;
        ten=sc.nextLine();
        luongngay=Integer.parseInt(sc.nextLine());
        songaycong= Integer.parseInt(sc.nextLine());
        chucvu=sc.nextLine();
        luongthang=luongthang();
        thuong=thuong();
        thuclinh=luongthang+thuong+phucap(chucvu);
    }

    public void show(){
        System.out.printf("NV");
        System.out.printf("%02d ",ma);
        System.out.printf(ten+" "+luongthang+" ");
        System.out.printf("%.0f ",thuong);
        System.out.printf(phucap(chucvu)+" ");
        System.out.printf("%.0f",thuclinh);
    }

    public int luongthang(){
        return luongngay*songaycong;
    }
    public double thuong(){
        if(songaycong>=25) return 0.2*luongthang;
        if(22<=songaycong&&songaycong<25) return 0.1*luongthang;
        return 0;
    }
    public int phucap(String s){
        if(s.equalsIgnoreCase("GD")) return 250000;
        if(s.equalsIgnoreCase("PGD")) return 200000;
        if(s.equalsIgnoreCase("TP")) return 180000;
        return 150000;
    }
}
