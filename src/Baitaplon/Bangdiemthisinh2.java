//package Baitaplon;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Scanner;
//
//public class Bangdiemthisinh2 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        ArrayList<sinhvien> sv=new ArrayList<>();
//        int t=Integer.parseInt(sc.nextLine());
//        for (int i = 0; i < t; i++) {
//            sinhvien std=new sinhvien();
//            std.input(sc);
//            sv.add(std);
//        }
//        Collections.sort(sv, new Comparator<sinhvien>() {
//            @Override
//            public int compare(sinhvien o1, sinhvien o2) {
//                return 0;
//            }
//        });
//        for (int i = 0; i < sv.size(); i++) {
//            sv.get(i).show();
//            System.out.println();
//        }
//    }
//}
//
//class sinhvien{
//    String msv;
//    String hvt;
//    Float toan;
//    Float ly;
//    Float hoa;
//    Float diem;
//
//    public void input(Scanner sc){
//        msv=sc.nextLine();
//        hvt=sc.nextLine();
//        toan=Float.parseFloat(sc.nextLine());
//        ly=Float.parseFloat(sc.nextLine());
//        hoa=Float.parseFloat(sc.nextLine());
//    }
//
//    public void show(){
//        diem=hoa+ly+toan*2;
//        System.out.print(msv+" "+hvt+" "+congkv(msv)+" "+diem+" ");
//        if(diem +congkv(msv)>=24){
//            System.out.printf("TRUNG TUYEN");
//        }
//        else System.out.printf("TRUOT");
//    }
//
//    public static double congkv(String s){
//        char[]a=s.toCharArray();
//        int x=(int)(a[2]-'0');
//        if(x==1) return 0.5;
//        if(x==2) return 1;
//        return 2.5;
//    }
//}
