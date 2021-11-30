package PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ademo {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("src/Baitaplon/1.txt"));
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            System.out.println(sc.nextLine()+" "+chuanhoa(sc.nextLine())+sc.nextLine()+" "+sc.nextLine());
        }
    }
    public static String chuanhoa(String s){
        String a[]=s.split("\\s+");
        StringBuilder sb=new StringBuilder("");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j <a[i].length() ; j++) {
                if(j==0){
                    sb.append(Character.toUpperCase(a[i].charAt(j)));
                }
                else sb.append(Character.toLowerCase(a[i].charAt(j)));
            }
            if(!sb.toString().equals("")) sb.append(" ");
        }
        return sb.toString();
    }
}