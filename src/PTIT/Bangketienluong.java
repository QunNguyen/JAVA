package PTIT;

import java.util.*;

public class Bangketienluong {
    public static void main(String[] args) {
        List<nhanvien7> nhanvien=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=t; i++) {
            nhanvien7 std=new nhanvien7();
            std.input(sc,i);
            nhanvien.add(std);
        }

//        Collections.sort(nhanvien, new Comparator<nhanvien7>() {
//            @Override
//            public int compare(nhanvien7 o1, nhanvien7 o2) {
//                if(o1.thuclinh>o2.thuclinh){
//                    return -1;
//                }
//                return 1;
//            }
//        });

        long sum=0;
        for (int i = 0; i < nhanvien.size(); i++) {
            sum+=nhanvien.get(i).thuclinh;
            nhanvien.get(i).show();
            System.out.println();
        }
        System.out.printf("Tong chi phi tien luong: "+sum);
    }
}
class nhanvien7{
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
