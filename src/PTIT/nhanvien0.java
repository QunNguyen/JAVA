package PTIT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class nhanvien0{
    String ten;
    String gioitinh;
    String ngaysinh;
    String diachi;
    int mst;
    String ngaykyhd;
    Date date;
    Date date1;
    SimpleDateFormat fd= new SimpleDateFormat("dd/MM/yyyy");

    public nhanvien0() {

    }

    public void input() throws ParseException {
        Scanner sc=new Scanner(System.in);
        ten=sc.nextLine();
        gioitinh=sc.nextLine();
        ngaysinh=sc.nextLine();
        diachi= sc.nextLine();
        mst= sc.nextInt();
        sc.nextLine();
        ngaykyhd=sc.nextLine();
        date=fd.parse(ngaysinh);
        date1=fd.parse(ngaykyhd);
    }
    public void show(){
        System.out.println(ten+" "+fd.format(date)+" "+diachi+" "+mst+" "+fd.format(date1));
    }

    public nhanvien0(String ten, String gioitinh, String ngaysinh, String diachi, int mst, String ngaykyhd, Date date, Date date1, SimpleDateFormat fd) {
        this.ten = ten;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.mst = mst;
        this.ngaykyhd = ngaykyhd;
        this.date = date;
        this.date1 = date1;
        this.fd = fd;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getMst() {
        return mst;
    }

    public void setMst(int mst) {
        this.mst = mst;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate1() {
        return date1;
    }

    public void setDate1(Date date1) {
        this.date1 = date1;
    }
}
