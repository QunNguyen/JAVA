package PTIT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Khaibaolopnhanvien {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        String ten= sc.nextLine();
        String gioitinh=sc.nextLine();
        String ngaysinh= sc.nextLine();
        String diacchi=sc.nextLine();
        String ma=sc.nextLine();
        String ngaykhd= sc.nextLine();
        SimpleDateFormat fd=new SimpleDateFormat("dd/MM/yyyy");
//        Date date=fd.parse(ngaysinh);
//        Date date1=fd.parse(ngaykhd);
        System.out.printf("00001"+" "+ten+" "+gioitinh+" "+ngaysinh+" "+diacchi+" "+ma+" "+fd.format(fd.parse(ngaykhd)));
    }
}
