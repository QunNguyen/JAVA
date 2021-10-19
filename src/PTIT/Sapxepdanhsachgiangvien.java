package PTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Sapxepdanhsachgiangvien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<giangvien> gv=new ArrayList<>();
        for (int i = 1; i <=t; i++) {
            giangvien std=new giangvien();
            std.input(sc,i);
            gv.add(std);
        }

        Collections.sort(gv, new Comparator<giangvien>() {
            @Override
            public int compare(giangvien o1, giangvien o2) {
                if(o1.ten.compareTo(o2.ten)<0){
                    return -1;
                }
                if (o1.ten.compareTo(o2.ten)==0){
                    if(o1.magv<o2.magv){
                        return -1;
                    }
                }
                return 1;
            }
        });

        for (int i = 0; i < gv.size(); i++) {
            gv.get(i).show();
            System.out.println();
        }
    }
}
class giangvien{
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
