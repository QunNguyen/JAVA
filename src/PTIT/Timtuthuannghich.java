package PTIT;

import java.util.ArrayList;
import java.util.Scanner;

public class Timtuthuannghich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine().trim();
        String[]a=s.split("\\s");
        ArrayList<String> arr=new ArrayList<>();
        int size=0;
        for (int i = 0; i < a.length; i++) {
            if(checktn(a[i])==1)
            {
                if(a[i].length()>size){
                    size=a[i].length();
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            if(checktn(a[i])==1&&a[i].length()==size)
            {
                if(check(arr,a[i])==1){
                    arr.add(a[i]);
                }
            }
        }
        for (int i = 0; i <arr.size(); i++) {
            int dem=0;
            for (int j = 0; j < a.length; j++) {
                if(a[j].equalsIgnoreCase(arr.get(i))){
                    dem++;
                }
            }
            System.out.print(arr.get(i)+" "+dem+" ");
        }
    }

    public static int check(ArrayList<String> arr, String s){
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i).equalsIgnoreCase(s)){
                return 0;
            }
        }
        return 1;
    }

    public static int checktn(String s){
        int n=s.length();
        for (int i = 0; i <=n/2 ; i++) {
            if(s.charAt(i)!=s.charAt(n-1-i)){
                return 0;
            }
        }
        return 1;
    }
}
//    AAA BAABA HDHDH ACBSD SRGTDH DDDDS DUAHD AAA AD DA HDHDH AAA AAA AAA AAA DDDAS HDHDH HDH AAA AAA AAA AAA AAA AAA AAA AAA DHKFKH DHDHDD HDHDHD DDDHHH HHHDDD TDTD