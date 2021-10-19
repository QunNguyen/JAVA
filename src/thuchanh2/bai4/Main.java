package thuchanh2.bai4;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QLGV q=new QLGV();
        Scanner sc=new Scanner(System.in);
        while (true){
            Menu();
            int chon=Integer.parseInt(sc.nextLine());
            switch (chon){
                case 0:
                    System.out.println("BYE !");
                    System.exit(0);
                case 1:
                    giangvien g=new giangvien();
                    System.out.printf("Nhap ma giang vien:");
                    while (true){
                        String s=sc.nextLine();
                        if(q.checkmagiangvien(s)==1){
                            g.nhap(s);
                            break;
                        }
                        System.err.printf("Nhap sai->Nhap lai: ");
                    }
                    q.nhap(g);
                case 2:
                    break;
                case 3:
                    q.danhsach();
                    break;
                case 4:
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
        System.out.print("Ban chon (0->10):");
    }
}
