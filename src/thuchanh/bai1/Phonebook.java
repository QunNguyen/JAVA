package thuchanh.bai1;

import java.util.Scanner;

public class Phonebook extends IntlPhoneNumber{
    String tmp;

    @Override
    public void input(Scanner sc) {
        super.input(sc);
        if(getMaqg()==84){
            tmp="trong nuoc";
        }
        else tmp="quoc te";
    }

    @Override
    public void show() {
        super.show();
        System.out.print(tmp);
    }
}
