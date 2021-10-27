package thuchanh.quanth;

import java.util.Scanner;
abstract class giangvien {
    private String magiangvien;
    private String tengiangvien;
    private int hocvi;
    private double luong;


    public void nhap(String s){
        Scanner sc=new Scanner(System.in);
        magiangvien=s;
        System.out.printf("Ten giang vien: ");
        tengiangvien=sc.nextLine();
        System.out.printf("học vị (đại học, thạc sĩ, tiến sĩ – 1,2,3): ");
        hocvi=Integer.parseInt(sc.nextLine());

    }


    public abstract double getTinh();

    @Override
    public String toString() {
        return "giangvien{" +
                "magiangvien='" + magiangvien + '\'' +
                ", tengiangvien='" + tengiangvien + '\'' +
                ", hocvi=" + check(hocvi) +
                '}';

    }
    
    public String check(int n){
        if(n==1) {
            return ("dai hoc");
        }
        if(n==2){
            return ("thac si");
        }
        return ("Tien si");
    }

    public String getMagiangvien() {
        return magiangvien;
    }

    public void setMagiangvien(String magiangvien) {
        this.magiangvien = magiangvien;
    }

    public String getTengiangvien() {
        return tengiangvien;
    }

    public void setTengiangvien(String tengiangvien) {
        this.tengiangvien = tengiangvien;
    }

    public void setLuong(int luongcung) {
        this.luong = luongcung;
    }

    public int getHocvi() {
        return hocvi;
    }

    public void setHocvi(int hocvi) {
        this.hocvi = hocvi;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public double getLuong() {
        return luong;
    }
}
