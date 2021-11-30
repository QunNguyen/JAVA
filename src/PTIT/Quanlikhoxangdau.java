package PTIT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quanlikhoxangdau {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<xangdau> list=new ArrayList<>();
        int t=sc.nextInt();
        for (int i = 0; i < t; i++) {
            sc.nextLine();
            xangdau std=new xangdau();
            std.nhap(sc);
            list.add(std);
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).in();
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
        ma=madonhang.charAt(0)+"";
        hangsx=madonhang.substring(3);
    }
    public void in(){
        System.out.println(madonhang+" "+tensx(hangsx)+" "+donggia(ma)+" "+thue(ma,hangsx)+" "+(soluong*donggia(ma)+thue(ma,hangsx)));
    }

    public long donggia(String ma){
        if(ma.equals("X")) return 128000;
        if(ma.equals("D")) return 11200;
        return 9700;
    }
    public long thue(String ma, String hangsx){
        if(tensx(hangsx).equals("Trong Nuoc")) return 0;
        if(ma.equals("X")) return (long) (soluong*donggia(ma)*3/100);
        if(ma.equals("D")) return (long) (soluong*donggia(ma)*35/1000);
        return (long) (soluong*donggia(ma)*2/100);
    }

    public String tensx(String hangsx){
        if(hangsx.equals("BP")) return "British Petro";
        if(hangsx.equals("ES")) return "Esso";
        if(hangsx.equals("SH")) return "Shell";
        if(hangsx.equals("CA")) return "Castrol";
        if(hangsx.equals("MO")) return "Mobil";
        return "Trong Nuoc";
    }
}