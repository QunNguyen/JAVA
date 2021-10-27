package thuchanh2.bai4;

import java.util.Scanner;

public class giangviencohuu extends giangvien{
    private int sogioquymuc;

    @Override
    public void nhap(String s) {
        super.nhap(s);
        Scanner sc=new Scanner(System.in);
        System.out.printf("Nhap so gio quy muc: ");
        sogioquymuc=Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "giangviencohuu{" +
                "sogioquymuc=" + sogioquymuc +
                '}';
    }
    public giangviencohuu() {

    }

    public int getSogioquymuc() {
        return sogioquymuc;
    }

    public void setSogioquymuc(int sogioquymuc) {
        this.sogioquymuc = sogioquymuc;
    }
}
