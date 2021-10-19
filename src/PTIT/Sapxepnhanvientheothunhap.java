package PTIT;

import java.util.*;

public class Sapxepnhanvientheothunhap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<nhanvien6> nv=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for (int i =1; i <=t; i++) {
            nhanvien6 std=new nhanvien6();
            std.intput(sc,i);
            nv.add(std);
        }
        Collections.sort(nv, new Comparator<nhanvien6>() {
            @Override
            public int compare(nhanvien6 o1, nhanvien6 o2) {
                if(o1.tmp1>o2.tmp1){
                    return -1;
                }
                if(o1.tmp1==o2.tmp1){
                    if(o1.msv<o2.msv){
                        return -1;
                    }
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
class nhanvien6{
    String ten;
    String chucvu;
    int luongcoban;
    int songaycong;
    int msv;
    double tmp1;

    public void intput(Scanner sc, int n){
        msv=n;
        ten=sc.nextLine();
        chucvu=sc.nextLine();
        luongcoban=Integer.parseInt(sc.nextLine());
        songaycong=Integer.parseInt(sc.nextLine());
        tmp1=luongcoban*songaycong+phucap(chucvu);
    }

    public void show(){
        System.out.printf("NV");
        System.out.printf("%02d ",msv);
        System.out.printf(ten+" "+phucap(chucvu)+" "+luongcoban*songaycong+" ");
        System.out.printf("%.0f ",tamung());
        System.out.printf("%.0f",luongcoban*songaycong+phucap(chucvu)-tamung());
    }

    public static int phucap(String s){
        if(s.equalsIgnoreCase("gd")) return 500;
        if(s.equalsIgnoreCase("pgd")) return 400;
        if(s.equalsIgnoreCase("tp")) return 300;
        if(s.equalsIgnoreCase("kt"))return 250;
        return 100;
    }
    public double tamung(){
        double tmp=((phucap(chucvu)+luongcoban*songaycong)*2)/3;
        tmp=Math.round(tmp/1000.0)*1000.0;
        if(tmp<25000) {
            return tmp;
        }
        return 25000;
    }

    public double getTmp() {
        return tmp1;
    }

    public void setTmp(double tmp) {
        this.tmp1= tmp;
    }
}


