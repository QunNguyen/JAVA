package PTIT;

import java.util.*;

public class Bangdiemhocsinh {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        ArrayList<hocsinh> hs=new ArrayList<>();
        for (int i = 1; i <=t ; i++) {
            hocsinh std=new hocsinh();
            sc.nextLine();
            std.input(sc,i);
            hs.add(std);
        }
        Collections.sort(hs, new Comparator<hocsinh>() {
            @Override
            public int compare(hocsinh o1, hocsinh o2) {
                if(o1.dtb>o2.dtb) {
                    return -1;
                }
                else {
                    if (o1.dtb == o2.dtb) {
                        if (o1.msv > o2.msv) {
                            return -1;
                        }
                    }
                }
                return 1;
            }
        });
        for (int i = 0; i < hs.size(); i++) {
            hs.get(i).show();
        }
    }
}
class hocsinh{
    String ten;
    int msv;
    float dtb1=0f;
    float dtb;

    public void input(Scanner sc,int n){
        msv=n;
        ten=sc.nextLine();
        for (int i = 0; i < 10; i++) {
            float x=sc.nextFloat();
            if(i<2){
                dtb1+=x*2;
            }
            else dtb1+=x;
        }
        dtb1/=12;
        dtb= (float) (Math.round(dtb1*10.0)/10.0);
    }
    public void show(){
        System.out.printf("HS");
        System.out.printf("%02d ",msv);
        System.out.print(ten+" ");
        System.out.printf("%.1f ",dtb);
        if(dtb >= 9)
        {
            System.out.println("XUAT SAC");
            return;
        }
        if(dtb >= 8)
        {
            System.out.println("GIOI");
            return;
        }
        if(dtb >= 7)
        {
            System.out.println("KHA");
            return;
        }
        if(dtb >= 5)
        {
            System.out.println("TB");
            return;
        }
        System.out.println("YEU");
    }
    public float getDtb() {
        return dtb;
    }

    public void setDtb(float dtb) {
        this.dtb = dtb;
    }
    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }
}
