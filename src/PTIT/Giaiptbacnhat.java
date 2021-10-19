package PTIT;

import java.util.Scanner;


public class Giaiptbacnhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float a= sc.nextFloat();
        float b=sc.nextFloat();
        if(a==0){
            if(b==0){
                System.out.printf("VSN");
            }
            else System.out.printf("VN");
        }
        else{
            float x= (float)-b/a;
            System.out.printf("%.2f",x);
        }
    }

}
