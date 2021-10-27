package thuchanh2.bai5;

import java.util.Scanner;

public class Giaodichtiente extends Giaodich{
    private float tigia;
    private int loaitiente;
    private float thanhtien;

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc=new Scanner(System.in);
        tigia=Float.parseFloat(sc.nextLine());
        System.out.printf("tiền Việt Nam 1, tiền USD 2, tiền Euro 3: ");
        loaitiente=Integer.parseInt(sc.nextLine());
        tigia=kttigia(loaitiente);
        thanhtien=getSoluong()*getDongia()*tigia;
    }

    public static float kttigia(int loaitiente){
        if(loaitiente==2) return 22;
        if(loaitiente==3) return 32;
        return 1;
    }

    @Override
    public String toString() {
        return "Giaodichtiente{" +
                "tigia=" + tigia +
                ", loaitiente=" + loaitiente +
                ", thanhtien=" + thanhtien +
                '}';
    }

    public float getTigia() {
        return tigia;
    }

    public void setTigia(float tigia) {
        this.tigia = tigia;
    }

    public int getLoaitiente() {
        return loaitiente;
    }

    public void setLoaitiente(int loaitiente) {
        this.loaitiente = loaitiente;
    }

    public float getThanhtien() {
        return thanhtien;
    }

    public void setThanhtien(float thanhtien) {
        this.thanhtien = thanhtien;
    }
}
