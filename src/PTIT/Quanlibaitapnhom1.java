package PTIT;

import java.util.ArrayList;
import java.util.Scanner;

public class Quanlibaitapnhom1 {
    public static void main(String[] args) {
        ArrayList<nhom> a=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=Integer.parseInt(sc.next());
        int m=Integer.parseInt(sc.next());
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            nhom std=new nhom();
            std.input(sc);
            a.add(std);
        }
        ArrayList<String>arr=new ArrayList<>();
        for (int i = 1; i <=m; i++) {
            String s=sc.nextLine();
            arr.add(s);
        }
        int q=Integer.parseInt(sc.nextLine());
        ArrayList<Integer> detai=new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int tmp= sc.nextInt();
            detai.add(tmp);
        }

        for (int i = 0; i < detai.size(); i++) {
            System.out.println("DANH SACH NHOM "+detai.get(i)+":");
            for (int j = 0; j < a.size(); j++) {
                if(a.get(j).sonhom==detai.get(i)){
                    a.get(j).show();
                    System.out.println();
                }
            }
            System.out.println("Bai tap dang ky: "+arr.get(detai.get(i)-1));
        }
    }
}
class nhom{
    String msv;
    String ten;
    String sdt;
    int sonhom;
    String detai;

    public void input(Scanner sc){
        msv=sc.nextLine();
        ten=sc.nextLine();
        sdt=sc.nextLine();
        sonhom=Integer.parseInt(sc.nextLine());
    }

    public void de(String s){
        detai=s;
    }
    public void show(){
        System.out.print(msv+" "+ten+" "+sdt);
    }
}
