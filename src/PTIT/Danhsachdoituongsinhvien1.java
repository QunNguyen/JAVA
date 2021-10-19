package PTIT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Danhsachdoituongsinhvien1 {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String ten =sc.nextLine();
            String msv=sc.nextLine();
            String ngay=sc.nextLine();
            SimpleDateFormat fd= new SimpleDateFormat("dd/mm/yyyy");
            Date date =fd.parse(ngay);
            Float GPA= sc.nextFloat();
            sc.nextLine();
            System.out.print("B20DCCN");
            System.out.printf("%03d ",i+1);
            System.out.printf(ten+" "+msv+" "+fd.format(date)+" ");
            System.out.printf("%.2f",GPA);
            System.out.println();
        }
    }
}


