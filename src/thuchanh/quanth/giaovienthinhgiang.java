package thuchanh.quanth;

import java.util.Scanner;

class giaovienthinhgiang extends giangvien implements Tinhluong {
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
    public double getLuong() {
        return getTinh();
    }

    @Override
    public String toString() {
        return super.toString()+" giaovienthinhgiang{" +
                "sogiodaytrongthang=" + sogiodaytrongthang +
                " luong"+ getTinh()+
                '}';
    }
}
