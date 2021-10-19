package thuchanh2.bai2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quanlitailieu implements ChucNang {
    private List<TaiLieu> list;
    private Scanner sc=new Scanner(System.in);

    public Quanlitailieu() {
        list=new ArrayList<>();
    }

    @Override
    public boolean nhap(TaiLieu p) {
        return list.add(p);
    }

    @Override
    public void danhsach(){
        for (TaiLieu i:list) {
            System.out.println(i);
        }
    }

}
