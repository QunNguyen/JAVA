package PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Danhsachsinhvientrongfile {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        Scanner in = new Scanner(new File("src/PTIT/test.txt"));
        int n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <=n; i++){
            System.out.printf("B20DCCN");
            System.out.printf("%03d ",i);
            System.out.print(in.nextLine()+" ");
            System.out.print(in.nextLine()+" ");
            SimpleDateFormat fd=new SimpleDateFormat("dd/MM/yyyy");
            System.out.printf(fd.format(fd.parse(in.nextLine()))+" ");
            System.out.printf("%.2f ",Float.parseFloat(in.nextLine()));
            System.out.println();
        }
    }
}
