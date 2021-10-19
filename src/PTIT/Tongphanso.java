package PTIT;

import java.util.Scanner;

public class Tongphanso {
    //main
    public static void main(String[] args) {
        PhanSo p = new PhanSo(1,1);
        p.nhap();
        p.rutGon();
        System.out.println(p);
    }
    public static void main1484149(String[] args) {
        PhanSo p = new PhanSo(1,1);
        p.nhap();
        p.rutGon();
        System.out.println(p);
    }
    public static void main6743412(String[] args) {
        PhanSo p = new PhanSo(1,1);
        p.nhap();
        p.rutGon();
        System.out.println(p);
    }
}

class PhanSo {
    private long tuso;
    private long mauso;

    public PhanSo() {}

    public PhanSo(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        this.tuso = scanner.nextLong();
        this.mauso = scanner.nextLong();
        scanner.close();
    }

    public void rutGon() {
        long temp = _gcd(this.tuso, this.mauso);
        this.tuso = this.tuso / temp;
        this.mauso = this.mauso / temp;
    }

    private long _gcd(long a, long b) {
        return b == 0 ? a : _gcd(b, a % b);
    }

    @Override
    public String toString() {
        return this.tuso + "/" + this.mauso;
    }
}
