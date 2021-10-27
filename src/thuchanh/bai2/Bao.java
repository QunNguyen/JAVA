package thuchanh.bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bao extends TaiLieu{
    private String ngayphathanh;
    private Date ngay;
    SimpleDateFormat fd=new SimpleDateFormat("dd/MM/yyyy");


    @Override
    public void nhap() throws ParseException {
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.printf("Nhap ngay thang (dd/MM/yyyy):");
        ngayphathanh=sc.nextLine();
        ngay=fd.parse(ngayphathanh);
    }

    @Override
    public String toString() {
        return "Bao{" +
                "ngayphathanh='" + fd.format(ngayphathanh) + '\'' +
                '}';
    }

    public Bao() {
    }

    public Bao(String ngayphathanh, Date ngay, SimpleDateFormat fd) {
        this.ngayphathanh = ngayphathanh;
        this.ngay = ngay;
        this.fd = fd;
    }

    public String getNgayphathanh() {
        return ngayphathanh;
    }

    public void setNgayphathanh(String ngayphathanh) {
        this.ngayphathanh = ngayphathanh;
    }

    public Date getNgay() {
        return ngay;
    }

    public void setNgay(Date ngay) {
        this.ngay = ngay;
    }

    public SimpleDateFormat getFd() {
        return fd;
    }

    public void setFd(SimpleDateFormat fd) {
        this.fd = fd;
    }
}
