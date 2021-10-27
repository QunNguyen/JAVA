package thuchanh.bai5;

import java.util.Scanner;

public class Giaodichvang extends Giaodich {
    private String loaivang;
    private float thanhtien;

    public Giaodichvang() {

    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc=new Scanner(System.in);
        loaivang=sc.nextLine();
        thanhtien=getSoluong()*getDongia();
    }

    @Override
    public String toString() {
        return "Giaodichvang{" +
                "loaivang='" + loaivang + '\'' +
                ", thanhtien=" + thanhtien +
                '}';
    }


    public Giaodichvang(String magiaodich, String ngaygiaodich, float dongia, float soluong, String loaivang, float thanhtien) {
        super(magiaodich, ngaygiaodich, dongia, soluong);
        this.loaivang = loaivang;
        this.thanhtien = thanhtien;
    }

    public float getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(float thanhtien) {
        this.thanhtien = thanhtien;
    }

    public String getLoaivang() {
        return loaivang;
    }

    public void setLoaivang(String loaivang) {
        this.loaivang = loaivang;
    }
}
