package PTIT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Danhsachdoituongsinhvien2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; i++) {
            String ten =sc.nextLine();
            String msv=sc.nextLine();
            String ngay=sc.nextLine();
            SimpleDateFormat fd= new SimpleDateFormat("dd/MM/yyyy");
            Date date =fd.parse(ngay);
            Float GPA= sc.nextFloat();
            sc.nextLine();
            System.out.print("B20DCCN");
            System.out.printf("%03d ",i+1);
            StringTokenizer c= new StringTokenizer(ten);
            while (c.hasMoreTokens())
            {
                System.out.print(ChuanHoa(c.nextToken())+" ");
            }
            System.out.print(msv+" "+fd.format(date)+" ");
            System.out.printf("%.2f",GPA);
            System.out.println();
        }
    }

    public static String ChuanHoa (String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length();i++)
        {
            if(i==0) sb.append(Character.toUpperCase(s.charAt(i)));
            else sb.append(Character.toLowerCase(s.charAt(i)));
        }
        return sb.toString();
    }
}


