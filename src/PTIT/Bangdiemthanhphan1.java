package PTIT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Bangdiemthanhphan1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<thanhphan1> tp=new ArrayList<>();
        for (int i = 1; i <=t; i++) {
            thanhphan1 std=new thanhphan1();
            std.input(sc,i);
            tp.add(std);
        }
        Collections.sort(tp, new Comparator<thanhphan1>() {
            @Override
            public int compare(thanhphan1 o1, thanhphan1 o2) {
                if(o1.msv.compareTo(o2.msv)<0){
                    return -1;
                }
                return 1;
            }
        });
        for (int i = 0; i < tp.size(); i++) {
            System.out.printf(i+1+" ");
            tp.get(i).show();
            System.out.println();
        }
    }
}

class thanhphan1{
    String msv;
    String ten;
    String lop;
    Float a,b,c;

    public void input(Scanner sc ,int n){
        msv=sc.nextLine();
        ten=sc.nextLine();
        lop=sc.nextLine();
        a=Float.parseFloat(sc.nextLine());
        b=Float.parseFloat(sc.nextLine());
        c=Float.parseFloat(sc.nextLine());
    }
    public void show(){
        System.out.print(msv+" "+ten+" "+lop+" "+a+" "+b+" "+c);
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }
}

