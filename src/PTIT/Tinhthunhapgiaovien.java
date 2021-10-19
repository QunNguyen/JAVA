package PTIT;

import java.util.Scanner;

public class Tinhthunhapgiaovien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        gv std=new gv();
        std.input(sc);
        std.show();
    }
}
class gv{
    String bac;
    String ten;
    int luong;
    String pc;
    int heso;

    public void input(Scanner sc){
        bac=sc.nextLine();
        ten=sc.nextLine();
        luong=sc.nextInt();
        pc=bac.substring(0,2);
        heso=Integer.parseInt(bac.substring(2,4));
    }

    public void show(){
        System.out.println(bac+" "+ten+" "+heso+" "+phucap(pc)+" "+(luong*heso+phucap(pc)));
    }

    public static int phucap(String s){
        if(s.equalsIgnoreCase("HT")) return 2000000;
        if(s.equalsIgnoreCase("HP")) return 900000;
        return 500000;
    }
}
