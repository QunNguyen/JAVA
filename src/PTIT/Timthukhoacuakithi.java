package PTIT;

import java.util.*;

public class Timthukhoacuakithi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<thisinh> ts=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=t ; i++) {
            thisinh std=new thisinh();
            std.nhap(sc,i);
            ts.add(std);
        }
        Collections.sort(ts, new Comparator<thisinh>() {
            @Override
            public int compare(thisinh o1, thisinh o2) {
                if(o1.tong>o2.tong){
                    return -1;
                }
                if(o1.tong==o2.tong){
                    if(o1.stt<o2.stt){
                        return -1;
                    }
                }
                return 1;
            }
        });
        ts.get(0).in();
        System.out.println();
        for (int i = 1; i <ts.size(); i++) {
            if(ts.get(i).tong==ts.get(0).tong){
                ts.get(i).in();
                System.out.println();
            }
            else {
                break;
            }
        }
    }
}
class thisinh{
    String ten;
    String ngaysinh;
    float diem1;
    float diem2;
    float diem3;
    float tong;
    int stt;

    public void nhap(Scanner sc,int n){
        stt=n;
        ten= sc.nextLine();
        ngaysinh=sc.nextLine();
        diem1=Float.parseFloat(sc.nextLine());
        diem2=Float.parseFloat(sc.nextLine());
        diem3=Float.parseFloat(sc.nextLine());
        tong=diem1+diem2+diem3;
    }
    public void in(){
        System.out.printf(stt+" "+ten+" "+ngaysinh+" "+tong);
    }

    public float getTong() {
        return tong;
    }

    public void setTong(float tong) {
        this.tong = tong;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }
}