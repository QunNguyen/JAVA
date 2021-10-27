package thuchanh.bai2;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Quanlitailieu q=new Quanlitailieu();
        Scanner sc=new Scanner(System.in);
        while (true){
            Menu();
            int chon=Integer.parseInt(sc.nextLine());
            switch (chon){
                case 0:
                    System.out.println("BYE !");
                    System.exit(0);
                case 1:
                    Sach s=new Sach();
                    s.nhap();
                    q.nhap(s);
                    break;
                case 2:
                    TapChi t=new TapChi();
                    t.nhap();
                    q.nhap(t);
                    break;
                case 3:
                    Bao b=new Bao();
                    b.nhap();
                    q.nhap(b);
                    break;
                case 4:
                    q.danhsach();
                    break;
            }
        }
    }

    public static void Menu(){
        System.out.println("------MENU-------");
        System.out.println("1. nhap sach ");
        System.out.println("2. Nhap tap chi");
        System.out.println("3. Nhap bao");
        System.out.println("4. Viet ra ds");
        System.out.println("0. Thoat");
        System.out.println("-----------------");
        System.out.print("Ban chon (0->10):");
    }
}
