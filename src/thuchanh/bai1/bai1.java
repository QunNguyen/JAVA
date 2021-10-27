package thuchanh2.bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Phonebook> p=new ArrayList<>();
        int choose;
        do{
            showMenu();
            System.out.println("Choose:");
            choose= sc.nextInt();
            switch (choose){
                case 1:
                    Phonebook std=new Phonebook();
                    std.input(sc);
                    p.add(std);
                    break;
                case 2:
                    for (int i = 0; i < p.size(); i++) {
                        p.get(i).show();
                        System.out.println();
                    }
                    break;
            }
        }  while (choose!=9);
    }
    public static void showMenu(){
        System.out.println("------Menu-----");
        System.out.println("1.Them 1 so dien thoai");
        System.out.println("2.Liet ke so dien thoai");
        System.out.println("3.Liet ke so dien thoai quoc te");
        System.out.println("4.Liet ke dien thoai trong nuoc");
    }
}
