package PTIT;

import java.util.ArrayList;
import java.util.Scanner;


public class Diachiemail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
        ArrayList<String> ds= new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String str="";
            String s= sc.nextLine();
            s=chuanhoathuong(s).trim();
            String[] a=s.split("\\s+");
            str=a[a.length-1];
            for (int j = 0; j < a.length-1; j++) {
                str+=a[j].charAt(0);
            }
            ds.add(str);
        }
        for (int i = 0; i < ds.size()-1; i++) {
            int dem=2;
            for (int j = i+1; j <ds.size() ; j++) {
                if(ds.get(i).equalsIgnoreCase(ds.get(j))){
                    ds.set(j,ds.get(j)+dem);
                    dem++;
                }
            }
        }
        for (int i = 0; i < ds.size(); i++) {
            System.out.println(ds.get(i)+"@ptit.edu.vn");
        }
    }

    public static String in(String b){
        String a="";
        a+=b.charAt(0);
        return a.toString();
    }

    public static String chuanhoathuong(String s){
        String a="";
        for (int i = 0; i < s.length(); i++) {
            a+=Character.toLowerCase(s.charAt(i));
        }
        return a.toString();
    }
}

