package PTIT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Danhsachdoituongnhanvien extends nhanvien0{
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        sc.nextLine();
        ArrayList<nhanvien0> nv=new ArrayList<>();
        for (int i = 0; i <t; i++) {
            nhanvien0 std=new nhanvien0();
            std.input();
            nv.add(std);
        }
        for (int i =0; i <t ; i++) {
            System.out.printf("%05d ",i+1);
            nv.get(i).show();
        }
    }
}


