package PTIT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Sapxepdanhsachdoituongnhanvien {
    public static void main(String[] args) throws ParseException {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<nhanvien> nv=new ArrayList<>();
        for (int i = 1; i <=t; i++) {
            nhanvien std=new nhanvien();
            std.input(i,sc);
            nv.add(std);
        }
        Collections.sort(nv, new Comparator<nhanvien>() {
            @Override
            public int compare(nhanvien o1, nhanvien o2) {
                if(o1.date.before(o2.date)){
                    return -1;
                }
                return 1;
            }
        });
        for (int i = 0; i < nv.size(); i++) {
            nv.get(i).show();
            System.out.println();
        }
    }
}
class nhanvien {
    String ten;
    String gioitinh;
    String ngaysinh;
    String diachi;
    String masothue;
    String ngaykihd;
    Date date;
    int stt;

    public void input(int n, Scanner sc) throws ParseException {
        stt = n;
        ten = sc.nextLine();
        gioitinh = sc.nextLine();
        ngaysinh = sc.nextLine();
        SimpleDateFormat fd= new SimpleDateFormat("dd/MM/yyyy");
        date=fd.parse(ngaysinh);
        diachi = sc.nextLine();
        masothue = sc.nextLine();
        ngaykihd = sc.nextLine();
    }
    public void show() throws ParseException {
        System.out.printf("%05d",stt);
        System.out.printf(chuanhoa(ten)+" "+gioitinh+" "+chuanhoangay(ngaysinh)+" "+diachi+" "+masothue+" "+chuanhoangay(ngaykihd));
    }
    public static String chuanhoa(String s){
        StringBuilder sb = new StringBuilder();
        String[]a=s.split("\\s");
        for (int i = 0; i < a.length; i++) {
            sb.append(" ");
            for (int j = 0; j < a[i].length(); j++) {
                if(j==0) sb.append(Character.toUpperCase(a[i].charAt(j)));
                else sb.append(Character.toLowerCase(a[i].charAt(j)));
            }

        }
        return sb.toString();
    }
    public static Comparable<String> chuanhoangay(String s) throws ParseException {
        SimpleDateFormat fd= new SimpleDateFormat("dd/MM/yyyy");
        Date date =fd.parse(s);
        return fd.format(date);
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
