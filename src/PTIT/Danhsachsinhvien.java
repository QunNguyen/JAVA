package PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Danhsachsinhvien {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("src/baitaplon/1.txt"));
        List<sinhvien> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            sinhvien std=new sinhvien(sc.nextLine(),sc.nextLine(),sc.nextLine(), sc.nextLine());
            list.add(std);
        }
        Collections.sort(list, new Comparator<sinhvien>() {
            @Override
            public int compare(sinhvien o1, sinhvien o2) {
                if(o1.msv.compareTo(o2.msv)<0){
                    return -1;
                }
                return 1;
            }
        });
        for (int i = 0; i < list.size(); i++) {
            list.get(i).show();
        }

    }
}

class sinhvien{
    String msv;
    String ten;
    String lop;
    String email;

    public sinhvien(String msv, String ten, String lop, String email) {
        this.msv = msv;
        this.ten = chuanhoa(ten);
        this.lop = lop;
        this.email = email;
    }
    public void show(){
        System.out.println(msv+" "+ten+lop+" "+email);
    }

    public static String chuanhoa(String s){
        String a[]=s.split("\\s+");
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length(); j++) {
                if(j==0) sb.append(Character.toUpperCase(a[i].charAt(j)));
                else sb.append(Character.toLowerCase(a[i].charAt(j)));
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
