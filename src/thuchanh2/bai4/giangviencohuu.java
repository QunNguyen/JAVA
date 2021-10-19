package thuchanh2.bai4;


import java.util.Scanner;

public class giangviencohuu extends giangvien{
    private String sogioquydinh;

    @Override
    public void nhap(String s) {
        super.nhap(s);
        Scanner sc=new Scanner(System.in);
        sogioquydinh=sc.nextLine();
    }
}
