package PTIT;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Xephangvandongvan1 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        List<vandongvien> vdv = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        int t = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= t; i++) {
            vandongvien std = new vandongvien();
            std.input(sc, i);
            vdv.add(std);
            arr.add(i);
        }
        Collections.sort(vdv, new Comparator<vandongvien>() {
            @Override
            public int compare(vandongvien o1, vandongvien o2) {
                if (o1.thanhtichuutien < o2.thanhtichuutien) {
                    return -1;
                }
                return 1;
            }
        });

        int dem = 0;
        vdv.get(0).xephang(1);
        for (int i = 1; i < vdv.size(); i++) {
            if (vdv.get(i).thanhtichuutien == vdv.get(i - 1).thanhtichuutien) {
                vdv.get(i).xephang(vdv.get(i - 1).xephang);
                dem++;
            }
            if (vdv.get(i).thanhtichuutien > vdv.get(i - 1).thanhtichuutien) {
                vdv.get(i).xephang(vdv.get(i - 1).xephang + 1 + dem);
                dem = 0;
            }
        }

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < vdv.size(); j++) {
                if (arr.get(i) == vdv.get(j).ma) {
                    vdv.get(j).show();
                    System.out.println();
                }
            }
        }

//        for (int i = 0; i < vdv.size(); i++) {
//            vdv.get(i).show();
//            System.out.println();
//        }
    }
}

class vandongvien{
    String ten;
    String ngaysinh;
    String xuatphat;
    String vedich;
    long thanhtich;
    long thanhtichuutien;
    int xephang;
    int ma;

    public void input(Scanner sc, int n) throws ParseException {
        SimpleDateFormat fd=new SimpleDateFormat("HH:mm:ss");
        ten=sc.nextLine();
        ngaysinh=sc.nextLine();
        xuatphat=sc.nextLine();
        vedich=sc.nextLine();
        thanhtich=(fd.parse(vedich).getTime()-fd.parse(xuatphat).getTime())/1000;
        thanhtichuutien=thanhtich-check(ngaysinh);
        ma=n;
    }
    public void show(){
        System.out.printf("VDV");
        System.out.printf("%02d ",ma);
        System.out.print(ten+" ");
        chuanhoatime(thanhtich);
        System.out.printf(" "+uutien(ngaysinh)+" ");
        chuanhoatime(thanhtichuutien);
        System.out.printf(" "+xephang);
    }

    public int xephang(int x){
        return xephang=x;
    }

    public static String uutien(String s) {
        int t = 2021 - Integer.parseInt(s.substring(6, 10));
        if (18 <= t && t < 25) return "00:00:01";
        if (25 <= t && t < 32) return "00:00:02";
        if (t >= 32) return "00:00:03";
        return "00:00:00";
    }

    public static int check(String ngaysinh){
        if (uutien(ngaysinh).equalsIgnoreCase("00:00:01")) {
            return  1;
        }
        if (uutien(ngaysinh).equalsIgnoreCase("00:00:02")) {
            return  2;
        }
        if (uutien(ngaysinh).equalsIgnoreCase("00:00:03")) {
            return  3;
        }
        return 0;
    }

    public void chuanhoatime(long thanhtich){
        long gio = thanhtich / 60 / 60;
        long phut = (thanhtich - gio * 60) / 60;
        long giay = (thanhtich - gio * 60 - phut * 60);
        System.out.printf("%02d", gio);
        System.out.printf(":");
        System.out.printf("%02d", phut);
        System.out.printf(":");
        System.out.printf("%02d", giay);
    }
}

