package PTIT;

import java.util.*;

public class Tracudonhang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<donhang> donhangList =new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            donhang std=new donhang();
            std.input(sc);
            donhangList.add(std);
        }

//        Collections.sort(donhangList, new Comparator<donhang>() {
//            @Override
//            public int compare(donhang o1, donhang o2) {
//                if(o1.stt.compareTo(o2.stt)<0){
//                    return -1;
//                }
//                return 1;
//            }
//        });

        for (int i = 0; i < donhangList.size(); i++) {
            donhangList.get(i).show();
            System.out.println();
        }
    }
}

class donhang{
    String ten;
    String madon;
    int dongia;
    int soluong;
    double giamgia;
    String stt;
    double thanhtien;

    public void input(Scanner sc){
        ten=sc.nextLine();
        madon=sc.nextLine();
        dongia=Integer.parseInt(sc.nextLine());
        soluong=Integer.parseInt(sc.nextLine());
        giamgia=giamgia(madon);
        stt=stt(madon);
        thanhtien=dongia*soluong-giamgia;
    }
    public void show(){
        System.out.printf(ten+" "+madon+" "+stt+" ");
        System.out.printf("%.0f ",giamgia);
        System.out.printf("%.0f",thanhtien);
    }

    public double giamgia(String s){
        if(s.charAt(s.length()-1)=='1') return dongia*soluong*0.5;
        return dongia*soluong*0.3;
    }
    public static String stt(String s){
        return s.substring(1,4);
    }
}