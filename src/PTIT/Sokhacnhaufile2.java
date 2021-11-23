package PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Sokhacnhaufile2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("src/Baitaplon/1.txt"));
        while (sc.hasNextLine()){
            String x=sc.nextLine();
            if(x.equalsIgnoreCase("END")) return;
            System.out.println(chuanhoa(x));
        }
        sc.close();
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
