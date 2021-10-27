package thuchanh.bai1;

import java.util.Scanner;

public class IntlPhoneNumber extends PhoneNumber{
     int maqg;

    @Override
    public void input(Scanner sc) {
        System.out.printf("Nhap ma quoc gia: ");
        maqg= sc.nextInt();
        super.input(sc);
    }

    @Override
    public void show() {
        System.out.print(maqg);
        super.show();
    }

    public int getMaqg() {
        return maqg;
    }

    public void setMaqg(int maqg) {
        this.maqg = maqg;
    }
}
