package PTIT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Danhsachsinhvien3{
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        ArrayList <student> Studentlist= new ArrayList<>();
        for (int i = 0; i < t; i++) {
            student std= new student();
            std.input();
            Studentlist.add(std);
        }
        for (int j = Studentlist.size()-1; j >=0; j--) {
            System.out.print("B20DCCN");
            System.out.format("%03d ",j+1);
            Studentlist.get(j).show();
            System.out.println();
        }
    }
}

class student {
    String name;
    String ID;
    String birthday;
    float GPA;

    public void input()  {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        ID = sc.nextLine();
        birthday = sc.nextLine();
        GPA = sc.nextFloat();
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

    public void show() throws ParseException {
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(name);
        String[] arr = new String[100];
        int cnt = 0;
        while(st.hasMoreTokens())
        {
            arr[cnt++] = st.nextToken();
        }
        for(int i=0;i<cnt;i++)
        {
            sb.append(ChuanHoa(arr[i]));
            if(i != cnt-1) sb.append(" ");
        }
        System.out.print(sb+" "+ID+" ");
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/yyyy");
        Date mau = ft.parse(birthday);
        System.out.print(ft.format(mau)+" ");
        System.out.format("%.2f",GPA);
    }

}

