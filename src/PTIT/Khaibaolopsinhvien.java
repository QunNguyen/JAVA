package PTIT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Khaibaolopsinhvien {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
//        int t=sc.nextInt();
//        sc.nextLine();
        ArrayList <student1> Studentlist= new ArrayList<>();
        //  for (int i = 0; i < t; i++) {
        student1 std= new student1();
        std.input();
        Studentlist.add(std);
        // }
        for (int j = 0; j < Studentlist.size(); j++) {
            System.out.print("B20DCCN");
            System.out.format("%03d ",(j+1));
            Studentlist.get(j).show();
            System.out.println();
        }
    }
}

class student1 {
    String name;
    String ID;
    String birthday;
    float GPA;

    public void input() throws ParseException {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        ID = sc.nextLine();
        birthday = sc.nextLine();
        GPA = sc.nextFloat();
    }

    public void show() throws ParseException {
        System.out.print("Nguyen Van A"+" "+ID+" ");
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
        Date mau = ft.parse(birthday);
        System.out.print(ft.format(mau)+" ");
        System.out.format("%.2f",GPA);
    }

}