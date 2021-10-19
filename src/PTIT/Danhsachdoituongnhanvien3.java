package PTIT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Danhsachdoituongnhanvien3 {
    public static void main(String[] args) throws ParseException {
        Scanner sc= new Scanner(System.in);
        ArrayList<nhanvien3> nv=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=t; i++) {
            nhanvien3 std=new nhanvien3();
            std.nhap(i,sc);
            nv.add(std);
        }
        Collections.sort(nv, new Comparator<nhanvien3>() {
            @Override
            public int compare(nhanvien3 o1, nhanvien3 o2) {
                if(o1.gpa>o2.gpa) {
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

class nhanvien3 {
    String ten;
    String lop;
    String ngaysinh;
    float gpa;
    int stt;

    public void nhap(int n,Scanner sc){
        stt=n;
        ten= sc.nextLine().trim();
        lop=sc.nextLine();
        ngaysinh=sc.nextLine();
        gpa=Float.parseFloat(sc.nextLine());
    }

    public void show() throws ParseException {
        System.out.printf("B20DCCN");
        System.out.printf("%03d",stt);
        System.out.printf(chuanhoa(ten)+" "+lop+" "+chuanhoangay(ngaysinh)+" ");
        System.out.printf("%.2f",gpa);
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

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
