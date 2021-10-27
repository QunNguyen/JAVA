package thuchanh.bai5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quanligiaodich q=new Quanligiaodich();
        Scanner sc=new Scanner(System.in);
        while (true){
            Menu();
            int chon=Integer.parseInt(sc.nextLine());
            switch (chon){
                case 0:
                    System.out.println("BYE");
                    break;
                case 1:
                    Giaodichtiente t=new Giaodichtiente();
                    t.nhap();
                    q.nhap(t);
                    break;
                case 2:
                    Giaodichvang v=new Giaodichvang();
                    v.nhap();
                    q.nhap(v);
                    break;
                case 3:
                    q.danhsach();
                    break;
            }
        }
    }

    public static void Menu(){
        System.out.println("------MENU-------");
        System.out.println("1. nhap giang vien co huu");
        System.out.println("2. Nhap giang vien thinh giang");
        System.out.println("3. Viet ra ds");
        System.out.println("4.Xóa,sửa giảng viên (nhập vào mã giảng viên)");
        System.out.println("0. Thoat");
        System.out.println("-----------------");
        System.out.printf("Ban chon (0->10): ");
    }
}
