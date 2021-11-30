package PTIT;

import java.io.*;
public class Sokhacnhautrongfile2 {
    public static void main(String [] args)throws IOException {
        DataInputStream dis = new DataInputStream(new FileInputStream("DATA.IN"));
        int check[] = new int [1005];
        for(int i=0;i<1005;i++) check[i] = 0;
        for(int i=0;i<100000;i++){
            check[dis.readInt()]++;
        }
        for(int i=0;i<1000;i++)
            if(check[i]>0)
                System.out.println(i+" "+check[i]);
    }
}