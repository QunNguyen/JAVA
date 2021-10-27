package thuchanh.bai5;

import java.util.Scanner;

public class Giaodich {
    private String magiaodich;
    private String ngaygiaodich;
    private float dongia;
    private float soluong;

    public void nhap(){
        Scanner sc=new Scanner(System.in);
        magiaodich=sc.nextLine();
        ngaygiaodich=sc.nextLine();
        dongia=Integer.parseInt(sc.nextLine());
        soluong=Float.parseFloat(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Giaodich{" +
                "magiaodich='" + magiaodich + '\'' +
                ", ngaygiaodich='" + ngaygiaodich + '\'' +
                ", dongia=" + dongia +
                ", soluong=" + soluong +
                '}';
    }

    public Giaodich(String magiaodich, String ngaygiaodich, float dongia, float soluong) {
        this.magiaodich = magiaodich;
        this.ngaygiaodich = ngaygiaodich;
        this.dongia = dongia;
        this.soluong = soluong;
    }

    public Giaodich() {
    }

    public String getMagiaodich() {
        return magiaodich;
    }

    public void setMagiaodich(String magiaodich) {
        this.magiaodich = magiaodich;
    }

    public String getNgaygiaodich() {
        return ngaygiaodich;
    }

    public void setNgaygiaodich(String ngaygiaodich) {
        this.ngaygiaodich = ngaygiaodich;
    }

    public float getDongia() {
        return dongia;
    }

    public void setDongia(int dongia) {
        this.dongia = dongia;
    }

    public float getSoluong() {
        return soluong;
    }

    public void setSoluong(float soluong) {
        this.soluong = soluong;
    }
}
