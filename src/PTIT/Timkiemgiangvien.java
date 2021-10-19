package PTIT;

import java.util.ArrayList;
import java.util.Scanner;

public class Timkiemgiangvien {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<giangvien3> gv=new ArrayList<>();
        for (int i = 1; i <=t; i++) {
            giangvien3 std=new giangvien3();
            std.input(sc,i);
            gv.add(std);
        }
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<String> arr=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s=sc.nextLine();
            arr.add(s);
        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println("DANH SACH GIANG VIEN THEO TU KHOA "+arr.get(i)+":");
            for (int j = 0; j < gv.size(); j++) {
                String s=chuanhoaten(gv.get(j).tendaydu).replaceAll(chuanhoaten(arr.get(i)),"");
                if(!s.equalsIgnoreCase(gv.get(j).tendaydu))
                {
                    gv.get(j).show();
                    System.out.println();
                }
            }
        }
    }
    public static String chuanhoaten(String s){
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' ') {
                sb.append(Character.toLowerCase(s.charAt(i)));
            }
            else sb.append(" ");
        }
        return sb.toString();
    }
}


class giangvien3{
    String tendaydu;
    String mon;
    int magv;

    public void input(Scanner sc,int n){
        tendaydu =sc.nextLine().trim();
        mon= sc.nextLine().trim();
        magv=n;
    }
    public void show(){
        System.out.printf("GV%02d ",magv);
        System.out.print(tendaydu+" "+chuanhoamon(mon));
    }

    public static String chuyenhoaten(String s){
        String[]a=s.split("\\s");
        return a[a.length-1];
    }
    public static String chuanhoamon(String s){
        String[]a=s.split("\\s");
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < a.length; i++) {
            sb.append(Character.toUpperCase(a[i].charAt(0)));
        }
        return sb.toString();
    }

    public String getTendaydu() {
        return tendaydu;
    }

    public void setTendaydu(String tendaydu) {
        this.tendaydu = tendaydu;
    }
}
