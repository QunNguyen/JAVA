package PTIT;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Solama {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Map<String,Integer>map=new LinkedHashMap<>();
        map.put("I",1);
        map.put("V",5);
        map.put("X",10);
        map.put("C",100);
        map.put("D",500);
        map.put("M",1000);
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 0; i < t; i++) {
            String s=sc.nextLine();
            int a[]=new int[s.length()];
            for (int j = 0; j < a.length; j++) {
                a[j]=1;
            }
            int sum=0;
            for (int j = 0; j < s.length()-1; j++) {
                if(s.charAt(j)=='I'&&s.charAt(j+1)=='V'&&a[j]!=0&&a[j+1]!=0){
                    sum+=4;
                    a[j]=0;
                    a[j+1]=0;
                }
            }
            System.out.println(sum);
        }

    }
}
