package PTIT;

import java.util.ArrayList;
import java.util.Scanner;

public class Lietkesinhvientheonganh {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<sinhvienlop4> sv=new ArrayList<>();
        for (int i = 0; i < t; i++) {
            sinhvienlop4 std=new sinhvienlop4();
            std.input(sc);
            sv.add(std);
        }
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<String> tv=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s=sc.nextLine();
            tv.add(s);
        }
        for (int i = 0; i < tv.size(); i++) {
            System.out.println("DANH SACH SINH VIEN NGANH "+chuanhoa(tv.get(i))+":");
            for (int j = 0; j < sv.size(); j++) {
                if(chuyen(tv.get(i)).equalsIgnoreCase(sv.get(j).tmp)){
                    if(sv.get(j).tmp.equalsIgnoreCase("DCCN")||sv.get(j).tmp.equalsIgnoreCase("DCAT")){
                        if(!(sv.get(j).tmp1.equalsIgnoreCase("E"))) {
                            sv.get(j).show();
                            System.out.println();
                        }
                    }
                    else {
                        sv.get(j).show();
                        System.out.println();
                    }
                }
            }
        }
    }
    public static String chuanhoa(String s){
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            sb.append(Character.toUpperCase(s.charAt(i)));
        }
        return sb.toString();
    }
    public static String chuyen(String s){
        if(s.equalsIgnoreCase("Ke toan")) return "DCKT";
        if(s.equalsIgnoreCase("Cong nghe thong tin")) return "DCCN";
        if(s.equalsIgnoreCase("An toan thong tin")) return "DCAT";
        if(s.equalsIgnoreCase("Vien thong")) return "DCVT";
        return "DCDT";
    }
}
class sinhvienlop4 {
    String lop;
    String ten;
    String msv;
    String email;
    String tmp;
    String tmp1="";

    public void input(Scanner sc) {
        msv = sc.nextLine();
        ten = sc.nextLine();
        lop = sc.nextLine();
        email = sc.nextLine();
        tmp=chuyen(msv);
        tmp1+=lop.charAt(0);
    }
    public static String chuyen(String s){
        StringBuilder sb= new StringBuilder("");
        sb.append(s.charAt(3));
        sb.append(s.charAt(4));
        sb.append(s.charAt(5));
        sb.append(s.charAt(6));
        return sb.toString();
    }

    public void show() {
        System.out.print(msv + " " + ten + " " + lop + " " + email);
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getTmp() {
        return tmp;
    }

    public void setTmp(String tmp) {
        this.tmp = tmp;
    }

    public String getTmp1() {
        return tmp1;
    }

    public void setTmp1(String tmp1) {
        this.tmp1 = tmp1;
    }
}
