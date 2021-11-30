package PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Danhsachluutru {
    public static void main(String[] args) throws FileNotFoundException, ParseException {
        ArrayList<khachhang> ds = new ArrayList<>();
        Scanner in = new Scanner(new File("KHACH.in"));
        int n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <=n; i++) {
            ds.add(new khachhang(i,in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine()));
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

        public khachhang(int n,String s,String s1, String s2, String s3) throws ParseException {
            makh=n;
            ten = s;
            maphong=s1;
            SimpleDateFormat fd=new SimpleDateFormat("dd/MM/yyyy");
            date1=fd.parse(s2);
            date2=fd.parse(s3);
            time=(date2.getTime()-date1.getTime())/1000;
            time=time/(60*60*24);
        }
        public void in(){
            System.out.printf("KH");
            System.out.printf("%02d",makh);
            System.out.printf(" "+ten+" "+maphong+" "+time);
        }
    }
}