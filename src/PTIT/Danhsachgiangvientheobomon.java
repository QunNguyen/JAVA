package PTIT;

import java.util.ArrayList;
import java.util.Scanner;

public class Danhsachgiangvientheobomon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<giangvien2> gv=new ArrayList<>();
        for (int i = 1; i <=t; i++) {
            giangvien2 std=new giangvien2();
            std.input(sc,i);
            gv.add(std);
        }
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<String> arr=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s=sc.nextLine();
            arr.add(s);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("DANH SACH GIANG VIEN BO MON "+chuanhoamon(arr.get(i))+":");
            for (int j = 0; j < gv.size(); j++) {
                if(arr.get(i).equalsIgnoreCase(gv.get(j).mon)){
                    gv.get(j).show();
                    System.out.println();
                }
            }
        }
    }
    public static String chuanhoamon(String s){
        String[]a=s.split("\\s");
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < a.length; i++) {
            sb.append(Character.toUpperCase(a[i].charAt(0)));
        }
        return sb.toString();
    }
}


class giangvien2{
    String tendaydu;
    String ten;
    String mon;
    int magv;

    public void input(Scanner sc,int n){
        tendaydu =sc.nextLine().trim();
        mon= sc.nextLine().trim();
        ten=chuyenhoaten(tendaydu);
        magv=n;
    }
    public void show(){
        System.out.printf("GV%02d ",magv);
        System.out.print(tendaydu+" "+chuanhoamon(mon));
    }

    public static String chuyenhoaten(String s){
        String[]a=s.split("\\s");
        return a[a.length-1];
    }
    public static String chuanhoamon(String s){
        String[]a=s.split("\\s");
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < a.length; i++) {
            sb.append(Character.toUpperCase(a[i].charAt(0)));
        }
        return sb.toString();
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getMagv() {
        return magv;
    }

    public void setMagv(int magv) {
        this.magv = magv;
    }
}
