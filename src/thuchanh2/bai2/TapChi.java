package thuchanh2.bai2;

import java.text.ParseException;
import java.util.Scanner;

public class TapChi extends TaiLieu implements Tinhthang{
    private int soPH;
    private int thangPH;

    @Override
    public void nhap() throws ParseException {
        super.nhap();
        Scanner sc=new Scanner(System.in);
        System.out.printf("Nhap so phat hanh:");
        soPH=Integer.parseInt(sc.nextLine());
        System.out.printf("Nhap thang phat hanh:");
        thangPH=Integer.parseInt(sc.nextLine());
    }



    @Override
    public String toString() {
        return "TapChi{" +
                "soPH=" + soPH +
                ", thangPH=" + layThang() +
                '}';
    }

    public TapChi() {
    }

    public TapChi(int soPH, int thangPH) {
        this.soPH = soPH;
        this.thangPH = thangPH;
    }

    public int getSoPH() {
        return soPH;
    }

    public void setSoPH(int soPH) {
        this.soPH = soPH;
    }

    public int getThangPH() {
        return thangPH;
    }

    public void setThangPH(int thangPH) {
        this.thangPH = thangPH;
    }

    @Override
    public int layThang() {
        return thangPH;
    }
}
