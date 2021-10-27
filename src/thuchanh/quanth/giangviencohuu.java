package thuchanh2.quanth;

import java.util.Scanner;

public class giangviencohuu extends giangvien implements Tingluong{
    private int sogioquymuc;

    @Override
    public void nhap(String s) {
        super.nhap(s);
        Scanner sc=new Scanner(System.in);
        System.out.printf("Nhap so gio quy muc: ");
        sogioquymuc=Integer.parseInt(sc.nextLine());
    }

    @Override
    public double getTinh(){
        return sogioquymuc*super.getHocvi()*140;
    }



    @Override
    public String toString() {
        return super.toString()+" giangviencohuu{" +
                "sogioquymuc=" + sogioquymuc + " luong"+ getTinh()+
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
