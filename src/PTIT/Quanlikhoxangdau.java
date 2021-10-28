package PTIT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quanlikhoxangdau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<xangdau> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            xangdau std=new xangdau();
            std.nhap(sc);
            list.add(std);
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).in();
            System.out.println();
        }
    }
}

class xangdau{
    String madonhang;
    int soluong;
    String ma;
    String hangsx;
    public void nhap(Scanner sc){
        madonhang=sc.next();
        soluong=sc.nextInt();
        ma=madonhang.substring(0,1);
        hangsx=madonhang.substring(3);
    }
    public void in(){
        System.out.printf(madonhang+" "+tensx(hangsx)+" "+donggia(ma)+" "+thue(ma,hangsx)+" "+(soluong*donggia(ma)+thue(ma,hangsx)));
    }

    public int donggia(String ma){
        if(ma.equalsIgnoreCase("X")) return 128000;
        if(ma.equalsIgnoreCase("D")) return 11200;
        return 9700;
    }
    public long thue(String ma, String hangsx){
        if(tensx(hangsx).equalsIgnoreCase("Trong Nuoc")) return 0;
        if(ma.equalsIgnoreCase("X")) return (long) (soluong*0.03*donggia(ma));
        if(ma.equalsIgnoreCase("D")) return (long) (soluong*0.035*donggia(ma));
        return (long) (soluong*0.02*donggia(ma));
    }

    public String tensx(String hangsx){
        if(hangsx.equalsIgnoreCase("BP")) return "British Petro";
        if(hangsx.equalsIgnoreCase("ES")) return "Esso";
        if(hangsx.equalsIgnoreCase("SH")) return "Shell";
        if(hangsx.equalsIgnoreCase("CA")) return "Castrol";
        if(hangsx.equalsIgnoreCase("MO")) return "Mobil";
        return "Trong Nuoc";
    }
}