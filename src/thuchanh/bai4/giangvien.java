package thuchanh2.bai4;

import java.util.Scanner;
class giangvien {
    String magiangvien;
    String tengiangvien;
    String email;
    String hocham;
    String hocvi;
    String diachi;
    String dienthoai;
    String sogiogiangdaythang;
    int luongcung;
    float hesoluong;
    public void nhap(String s){
        Scanner sc=new Scanner(System.in);
        magiangvien=s;
        System.out.printf("Ten giang vien: ");
        tengiangvien=sc.nextLine();
        System.out.printf("Email: ");
        email=sc.nextLine();
        System.out.printf("học hàm (không, giáo sư, phó giáo sư): ");
        hocham=sc.nextLine().toLowerCase().trim();
        System.out.printf("học vị (đại học, thạc sĩ, tiến sĩ): ");
        hocvi=sc.nextLine().toLowerCase().trim();
        System.out.printf("Dia chi: ");
        diachi=sc.nextLine();
        System.out.printf("So dien thoai: ");
        dienthoai=sc.nextLine();
        System.out.printf("So gio giang day trong thang(form: HH:mm): ");
        sogiogiangdaythang=sc.nextLine();
        System.out.printf("luong cung: ");
        luongcung=Integer.parseInt(sc.nextLine());
        System.out.printf("hệ số lương (đại học: 1, thạc sĩ 1.1 tiến sĩ 1.2, giáo sư thêm 0.2, phó giáo sư 0.1): ");
        hesoluong=Float.parseFloat(sc.nextLine());
    }

    @Override
    public String toString() {
        return "giangvien{" +
                "magiangvien='" + magiangvien + '\'' +
                ", tengiangvien='" + tengiangvien + '\'' +
                ", email='" + email + '\'' +
                ", hocham='" + hocham + '\'' +
                ", hocvi='" + hocvi + '\'' +
                ", diachi='" + diachi + '\'' +
                ", dienthoai='" + dienthoai + '\'' +
                ", sogiogiangdaythang='" + sogiogiangdaythang + '\'' +
                ", luongcung=" + luongcung +
                ", hesoluong=" + hesoluong +
                '}';
    }

    public giangvien() {
    }

    public giangvien(String magiangvien, String tengiangvien, String email, String hocham, String hocvi, String diachi, String dienthoai, String sogiogiangdaythang,int luongcung, float hesoluong) {
        this.magiangvien = magiangvien;
        this.tengiangvien = tengiangvien;
        this.email = email;
        this.hocham = hocham;
        this.hocvi = hocvi;
        this.diachi = diachi;
        this.dienthoai = dienthoai;
        this.sogiogiangdaythang = sogiogiangdaythang;
        this.luongcung = luongcung;
        this.hesoluong = hesoluong;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHocham() {
        return hocham;
    }

    public void setHocham(String hocham) {
        this.hocham = hocham;
    }

    public String getHocvi() {
        return hocvi;
    }

    public void setHocvi(String hocvi) {
        this.hocvi = hocvi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getDienthoai() {
        return dienthoai;
    }

    public void setDienthoai(String dienthoai) {
        this.dienthoai = dienthoai;
    }

    public String getSogiogiangdaythang() {
        return sogiogiangdaythang;
    }

    public void setSogiogiangdaythang(String sogiogiangdaythang) {
        this.sogiogiangdaythang = sogiogiangdaythang;
    }

    public int getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(int luongcung) {
        this.luongcung = luongcung;
    }

    public float getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(float hesoluong) {
        this.hesoluong = hesoluong;
    }

}
