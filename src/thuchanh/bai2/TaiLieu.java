package thuchanh.bai2;

import java.text.ParseException;
import java.util.Scanner;

public class TaiLieu {
    private String matailieu;
    private String tenNXB;
    private int soBPH;

    public void nhap() throws ParseException {
        Scanner sc=new Scanner(System.in);
        System.out.printf("Nhap ma tai lieu:");
        matailieu=sc.nextLine();
        System.out.printf("Nhap ten nxb:");
        tenNXB=sc.nextLine();
        System.out.printf("Nhap so bph:");
        soBPH=Integer.parseInt(sc.nextLine());
    }

    public TaiLieu() {
    }

    public TaiLieu(String matailieu, String tenNXB, int soBPH) {
        this.matailieu = matailieu;
        this.tenNXB = tenNXB;
        this.soBPH = soBPH;
    }

    public String getMatailieu() {
        return matailieu;
    }

    public void setMatailieu(String matailieu) {
        this.matailieu = matailieu;
    }

    public String getTenNXB() {
        return tenNXB;
    }

    public void setTenNXB(String tenNXB) {
        this.tenNXB = tenNXB;
    }

    public int getSoBPH() {
        return soBPH;
    }

    public void setSoBPH(int soBPH) {
        this.soBPH = soBPH;
    }
}
