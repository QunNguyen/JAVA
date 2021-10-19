package PTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Danhsachthuctap1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<thuctap2> tt=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=t; i++) {
            thuctap2 std=new thuctap2();
            std.input(sc,i);
            tt.add(std);
        }
        Collections.sort(tt, new Comparator<thuctap2>() {
            @Override
            public int compare(thuctap2 o1, thuctap2 o2) {
                if(o1.tenlien.compareTo(o2.tenlien)<0){
                    return -1;
                }
                return 1;
            }
        });
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<String> arr=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s=sc.nextLine();
            arr.add(s);
        }
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < tt.size(); j++) {
                if(arr.get(i).equalsIgnoreCase(tt.get(j).congty)){
                    tt.get(j).show();
                    System.out.println();
                }
            }
        }
    }
}

class thuctap2{
    String msv;
    String ten;
    String lop;
    String email;
    String congty;
    String tenlien;
    int stt;

    public void input(Scanner sc, int n){
        stt=n;
        msv=sc.nextLine();
        ten=sc.nextLine();
        lop= sc.nextLine();
        email=sc.nextLine();
        congty=sc.nextLine();
        tenlien=chuanhoa(ten);
    }
    public void show(){
        System.out.print(stt+" "+msv+" "+ten+" "+lop+" "+email+" "+congty);
    }

    public static String chuanhoa(String s){
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' '){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }


    public String getTenlien() {
        return tenlien;
    }

    public void setTenlien(String tenlien) {
        this.tenlien = tenlien;
    }
}