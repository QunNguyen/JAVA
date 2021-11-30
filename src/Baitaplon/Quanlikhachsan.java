package Baitaplon;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Quanlikhachsan {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        ArrayList<khachhang> ds = new ArrayList<>();
        ArrayList<LoaiPhong> dsp=new ArrayList<>();
        Scanner sc = new Scanner(new File("src/Baitaplon/1.txt"));
        int m=Integer.parseInt(sc.nextLine());
        for (int i = 0; i <m; i++) {
            dsp.add(new LoaiPhong(sc.nextLine()));
        }
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <=n; i++) {
            ds.add(new khachhang(i,sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine()));
        }
        for (int i = 0; i <ds.size(); i++) {
            double tmp=0;
            double tong=0;
            for (int j = 0; j < dsp.size(); j++) {
                if(ds.get(i).loai.equalsIgnoreCase(dsp.get(j).loai)){
                    if(ds.get(i).time==0) ds.get(i).setTime(1);
                    tmp=ds.get(i).time*dsp.get(j).ngay;
                    tong=tmp+tmp*dsp.get(j).phi;
                }
                if(10<=ds.get(i).time&&ds.get(i).time<20) tong=tong*0.02;
                if(20<=ds.get(i).time&&ds.get(i).time<30)tong=tong*0.04;
                if(30<=ds.get(i).time) tong=tong*0.06;
            }
//            System.out.println(tmp);
            tong=(double) Math.round(tong*100)/100;
            ds.get(i).setSotien(tong);
        }
        Collections.sort(ds, new Comparator<khachhang>() {
            @Override
            public int compare(khachhang o1, khachhang o2) {
                if(o1.time>o2.time){
                    return -1;
                }
                return 1;
            }
        });
        for (int i = 0; i < ds.size(); i++) {
            ds.get(i).in();
            System.out.println();
        }
    }

    static class khachhang{
        int makh;
        String ten;
        String ngayden;
        String ngaydi;
        String maphong;
        Date date1;
        Date date2;
        long time;
        double sotien;
        String loai;

        public khachhang(int n,String s,String s1, String s2, String s3) throws ParseException {
            makh=n;
            ten = s;
            maphong=s1;
            loai= String.valueOf(maphong.charAt(2));
            SimpleDateFormat fd=new SimpleDateFormat("dd/MM/yyyy");
            date1=fd.parse(s2);
            date2=fd.parse(s3);
            time=(date2.getTime()-date1.getTime())/1000;
            time=time/(60*60*24);
        }

        public void setTime(long time) {
            this.time = time;
        }

        public void in(){
            System.out.printf("KH");
            System.out.printf("%02d",makh);
            System.out.printf(" "+ten+" "+maphong+" "+time+" ");
            System.out.printf("%.2f",sotien);
        }

        public void setSotien(double sotien) {
            this.sotien = sotien;
        }
    }
    static class LoaiPhong {
        String loai;
        String ten;
        int ngay;
        float phi;

        public LoaiPhong(String nextLine) {
            String a[] = nextLine.split("\\s");
            loai = a[0];
            ten = a[1];
            ngay = Integer.parseInt(a[2]);
            phi = Float.parseFloat(a[3]);
        }
    }
}