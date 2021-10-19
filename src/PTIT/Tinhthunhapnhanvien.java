package PTIT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tinhthunhapnhanvien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<nhanvien4> nv=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for (int i =1; i <=t; i++) {
            nhanvien4 std=new nhanvien4();
            std.intput(sc,i);
            nv.add(std);
        }
        for (int i = 0; i < nv.size(); i++) {
            nv.get(i).show();
            System.out.println();
        }
    }
}
class nhanvien4{
    String ten;
    String chucvu;
    int luongcoban;
    int songaycong;
    int msv;

    public void intput(Scanner sc, int n){
        msv=n;
        ten=sc.nextLine();
        chucvu=sc.nextLine();
        luongcoban=Integer.parseInt(sc.nextLine());
        songaycong=Integer.parseInt(sc.nextLine());
    }

    public void show(){
        System.out.printf("NV");
        System.out.printf("%02d ",msv);
        System.out.printf(ten+" "+phucap(chucvu)+" "+luongcoban*songaycong+" ");
        System.out.printf("%.0f ",tamung());
        System.out.printf("%.0f",luongcoban*songaycong+phucap(chucvu)-tamung());
    }

    public static int phucap(String s){
        if(s.equalsIgnoreCase("gd")) return 500;
        if(s.equalsIgnoreCase("pgd")) return 400;
        if(s.equalsIgnoreCase("tp")) return 300;
        if(s.equalsIgnoreCase("kt"))return 250;
        return 100;
    }
    public double tamung(){
        double tmp=((phucap(chucvu)+luongcoban*songaycong)*2)/3;
        tmp=Math.round(tmp/1000.0)*1000.0;
        if(tmp<25000) {
            return tmp;
        }
        return 25000;
    }
}
