package PTIT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bangthunhapgiaovien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<giaovien> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        int demht=0;
        int demhp=0;
        for (int i = 0; i < t; i++) {
            giaovien std=new giaovien();
            std.nhap(sc);
            if(std.chucvu.substring(0,2).equalsIgnoreCase("HT")){
                demht++;
                if(demht>1){
                    continue;
                }
            }
            if(std.chucvu.substring(0,2).equalsIgnoreCase("HP")){
                demhp++;
                if(demhp>2){
                    continue;
                }
            }
            list.add(std);
        }
        for (int i = 0; i < list.size(); i++) {
            list.get(i).in();
            System.out.println();
        }
    }
}
class giaovien{
    String chucvu;
    String ten;
    int luong;

    public void nhap(Scanner sc){
        chucvu=sc.nextLine();
        ten=sc.nextLine();
        luong=Integer.parseInt(sc.nextLine());
    }
    public void in(){
        System.out.printf(chucvu+" "+ten+" ");
        System.out.printf("%d",Integer.parseInt(chucvu.substring(chucvu.length()-2)));
        System.out.printf(" "+phucap(chucvu)+" "+(luong*Integer.parseInt(chucvu.substring(chucvu.length()-2))+phucap(chucvu)));
    }
    public int phucap(String chucvu){
        String s= chucvu.substring(0,2);
        if(s.equalsIgnoreCase("HT")) return 2000000;
        if(s.equalsIgnoreCase("HP")) return 900000;
        return 500000;
    }
}
