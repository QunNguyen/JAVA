package PTIT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Baitoantuyensinh {
    public static void main(String[] args) {
        List<hocsinh0> hs=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            hocsinh0 std=new hocsinh0();
            std.input(sc);
            hs.add(std);
        }
        for (int i = 0; i < hs.size(); i++) {
            hs.get(i).show();
            System.out.println();
        }
    }
}

class hocsinh0{
    String ten;
    String msv;
    String kv;
    float toan;
    float ly;
    float hoa;
    double tong;

    public void input(Scanner sc){
        msv=sc.nextLine();
        ten=sc.nextLine();
        toan=Float.parseFloat(sc.nextLine());
        ly=Float.parseFloat(sc.nextLine());
        hoa=Float.parseFloat(sc.nextLine());
        tong=toan*2+ly+hoa;
    }
    public void show(){
        System.out.printf(msv+" "+ten+" ");
        if(diemcong(msv)==1){
            System.out.printf("1");
        } else System.out.print(diemcong(msv));
        System.out.printf(" ");

       in(tong);

        System.out.printf(" ");
        if(tong+diemcong(msv)>=24){
            System.out.printf("TRUNG TUYEN");
        }
        else System.out.printf("TRUOT");
    }

    public static double diemcong(String s){
        String a=s.substring(0,3);
        if(a.equalsIgnoreCase("KV1")) return 0.5;
        if(a.equalsIgnoreCase("KV2")) return 1;
        return 2.5;
    }

    public void in(double s){
        s=s*10;
        double x=s%10;
        if(x==0){
            System.out.printf("%.0f",(s/10));
        }
        else System.out.print(s/10);
    }
}
