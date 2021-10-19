package thuchanh2.bai2;

import java.text.ParseException;
import java.util.Scanner;

public class Sach extends TaiLieu{
    private String tentacgia;
    private String tensach;
    private int sotrang;

    @Override
    public void nhap() throws ParseException {
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.printf("Nhap ten tac gia:");
        tentacgia=sc.nextLine();
        System.out.printf("Nhap ten sach:");
        tensach=sc.nextLine();
        System.out.printf("Nhap so trang:");
        sotrang=Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Sach{" +
                "tentacgia='" + tentacgia + '\'' +
                ", tensach='" + tensach + '\'' +
                ", sotrang=" + sotrang +
                '}';
    }

    public Sach() {
    }

    public Sach(String matailieu, String tenNXB, int soBPH, String tentacgia, String tensach, int sotrang) {
        super(matailieu, tenNXB, soBPH);
        this.tentacgia = tentacgia;
        this.tensach = tensach;
        this.sotrang = sotrang;
    }

    public String getTentacgia() {
        return tentacgia;
    }

    public void setTentacgia(String tentacgia) {
        this.tentacgia = tentacgia;
    }

    public String getTensach() {
        return tensach;
    }

    public void setTensach(String tensach) {
        this.tensach = tensach;
    }

    public int getSotrang() {
        return sotrang;
    }

    public void setSotrang(int sotrang) {
        this.sotrang = sotrang;
    }
}
