package thuchanh.bai1;

import java.util.Scanner;

public class PhoneNumber {
    private int mavung;
    private int noivung;
    private String mavung0;
    public String noivung0;

    public void input(Scanner sc){
        System.out.printf("Nhap ma vung: ");
        mavung0=sc.next();
        mavung=Integer.parseInt(mavung0);
        System.out.printf("Nhap noi vung: ");
        noivung0=sc.next();
        noivung=Integer.parseInt(noivung0);
    }

    public void show(){
        System.out.printf("-"+mavung0+"-"+noivung0+" ");
    }

    public int getMavung() {
        return mavung;
    }

    public void setMavung(int mavung) {
        this.mavung = mavung;
    }

    public int getNoivung() {
        return noivung;
    }

    public void setNoivung(int noivung) {
        this.noivung = noivung;
    }
}
