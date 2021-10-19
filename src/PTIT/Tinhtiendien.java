package PTIT;

import java.util.*;

public class Tinhtiendien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        List<tiendien> tiendienList=new ArrayList<>();
        for (int i = 1; i <=t ; i++) {
            tiendien std=new tiendien();
            std.input(sc,i);
            tiendienList.add(std);
        }
//        Collections.sort(tiendienList, new Comparator<tiendien>() {
//            @Override
//            public int compare(tiendien o1, tiendien o2) {
//                if(o1.tong>o2.tong){
//                    return -1;
//                }
//                return 1;
//            }
//        });
        for (int i = 0; i < tiendienList.size(); i++) {
            tiendienList.get(i).show();
            System.out.println();
        }
    }
}
class tiendien{
    String loai;
    int chisocu;
    int chisomoi;
    int heso;
    long thanhtien;
    double phutroi;
    double tong;
    int stt;

    public void input(Scanner sc, int n){
        stt=n;
        loai=sc.nextLine();
        chisocu=Integer.parseInt(sc.nextLine());
        chisomoi= Integer.parseInt(sc.nextLine());
        heso=heso(loai);
        thanhtien=(chisomoi-chisocu)*heso*550;
        phutroi=Math.round(phutro());
        tong=tong();
    }
    public void show(){
        System.out.printf("KH");
        System.out.printf("%02d ",stt);
        System.out.printf(heso+" "+thanhtien+" ");
        System.out.printf("%.0f ",phutroi);
        System.out.printf("%.0f",tong);
    }
    public static int heso(String s){
        if(s.equalsIgnoreCase("KD")) return 3;
        if(s.equalsIgnoreCase("NN"))return 5;
        if(s.equalsIgnoreCase("TT")) return 4;
        return 2;
    }
    public double phutro(){
        int x=chisomoi-chisocu;
        if(50<=x&&x<=100) return (thanhtien/100.0)*35;
        if(x<50) return 0;
        return thanhtien;
    }
    public double tong(){
        return phutroi+thanhtien;
    }
}
