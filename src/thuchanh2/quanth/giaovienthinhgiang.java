package thuchanh2.quanth;

import java.util.Scanner;

class giaovienthinhgiang extends giangvien {
    private int sogiodaytrongthang;

    @Override
    public void nhap(String s) {
        super.nhap(s);
        Scanner sc=new Scanner(System.in);
        System.out.printf("Nhap so gio day trong thang: ");
        sogiodaytrongthang=Integer.parseInt(sc.nextLine());
    }


    @Override
    public double getTinh() {
       return sogiodaytrongthang*super.getHocvi()*160;
    }

    @Override
    public String toString() {
        return super.toString()+" giaovienthinhgiang{" +
                "sogiodaytrongthang=" + sogiodaytrongthang +
                " luong"+ getTinh()+
                '}';
    }
}