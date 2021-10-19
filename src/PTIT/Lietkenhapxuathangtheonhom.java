package PTIT;

import java.util.*;

public class Lietkenhapxuathangtheonhom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<hang2> hangList=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            hang2 std=new hang2();
            std.input(sc);
            hangList.add(std);
        }
        Collections.sort(hangList, new Comparator<hang2>() {
            @Override
            public int compare(hang2 o1, hang2 o2) {
                if(o1.thue>o2.thue){
                    return -1;
                }
                return 1;
            }
        });
        String s=sc.nextLine();
        for (int i = 0; i < hangList.size(); i++) {
            if(s.equalsIgnoreCase(String.valueOf(hangList.get(i).ma.charAt(0)))) {
                hangList.get(i).show();
                System.out.println();
            }
        }
    }
}

class hang2{
    String ma;
    int soluong;
    double soluongxuat;
    int dongia;
    double tien;
    double thue;

    public void input(Scanner sc){
        ma=sc.nextLine();
        soluong=Integer.parseInt(sc.nextLine());
        soluongxuat=Math.round(xuat(ma));
        dongia=dongia(ma);
        tien=soluongxuat*dongia;
        thue=thue(ma)*tien;
    }
    public void show(){
        System.out.printf(ma+" "+soluong+" ");
        System.out.printf("%.0f ",soluongxuat);
        System.out.printf(dongia+" ");
        System.out.printf("%.0f ",tien);
        System.out.printf("%.0f",thue);
    }

    public double xuat(String ma){
        if(ma.charAt(0)=='A'){
            return soluong*0.6;
        }
        return soluong*0.7;
    }
    public static int dongia(String ma){
        if(ma.charAt(ma.length()-1)=='Y') {
            return 110000;
        }
        return 135000;
    }
    public double thue(String ma){
        if(ma.charAt(0)=='A'&&ma.charAt(ma.length()-1)=='Y') return 0.08;
        if(ma.charAt(0)=='A'&&ma.charAt(ma.length()-1)=='N') return 0.11;
        if(ma.charAt(0)=='B'&&ma.charAt(ma.length()-1)=='Y') return 0.17;
        return 0.22;
    }
}
