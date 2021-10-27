package PTIT;

import java.util.*;

import static java.lang.Math.round;

public class Ketquaxettuyen {
    public static void main(String[] args) {
        List<phuho> list=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=t; i++) {
            phuho std=new phuho();
            std.nhap(sc,i);
            list.add(std);
        }
//        Collections.sort(list, new Comparator<phuho>() {
//            @Override
//            public int compare(phuho o1, phuho o2) {
//                if(o1.tong>o2.tong){
//                    return -1;
//                }
//                if(o1.tong==o2.tong){
//                    if(o1.stt<o2.stt){
//                        return -1;
//                    }
//                }
//                return 1;
//            }
//        });
        for (int i = 0; i < list.size(); i++) {
            list.get(i).in();
            System.out.println();
        }
    }
}

class phuho{
    int stt;
    String ten;
    String nam;
    float diemth;
    float diemlt;
    float tbc;
    int tong;

    public void nhap(Scanner sc,int n){
        stt=n;
        ten=sc.nextLine();
        nam=sc.nextLine();
        diemth=Float.parseFloat(sc.nextLine());
        diemlt=Float.parseFloat(sc.nextLine());
        tbc=(diemlt+diemth)/2;
       // System.out.println(thuong(diemlt,diemth));
        if(tbc+thuong(diemlt,diemth)>10){
            tong=10;
        }
        else {
            tong=Math.round(tbc+thuong(diemlt,diemth));
        }
    }
    public void in(){
        System.out.print("PH");
        System.out.printf("%02d ",stt);
        System.out.printf(ten+" "+(2021-tinh(nam))+" "+" "+tong+" "+check(tong));
    }
    public int tinh(String s){
        String s1=s.substring(6,s.length());
        return Integer.parseInt(s1);
    }
    public float thuong(float a, float b){
        if(a>=8&&b>=8) return 1;
        if(a>=7.5&&b>=7.5) return 0.5F;
        return 0;
    }
    public String check(int n){
        if(n<5){
            return "Truot";
        }
        if(n==5||n==6){
            return "Trung binh";
        }
        if(n==7){
            return "Kha";
        }
        if(n==8){
            return "Gioi";
        }
        return "Xuat sac";
    }
}
