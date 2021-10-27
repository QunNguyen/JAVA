package thuchanh2.quanth;

import java.util.*;

public class QLGV implements Chucnang{
    private List<giangvien> list;
    private Scanner sc=new Scanner(System.in);

    public QLGV() {
        list=new ArrayList<>();
    }
    @Override
    public boolean nhap(giangvien q){
        return list.add(q);
    }

    @Override
    public int checkmagiangvien(String s){
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getMagiangvien().equalsIgnoreCase(s)){
                return 0;
            }
        }
        return 1;
    }

    @Override
    public void danhsach(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString()+" "+(i+1));
        }
    }

    @Override
    public void sapxep(){
        Collections.sort(list, new Comparator<giangvien>() {
            @Override
            public int compare(giangvien o1, giangvien o2) {
                if(o1.getLuong()>o2.getLuong()){
                    return -1;
                }
                return 1;
            }
        });
        danhsach();
    }

    @Override
    public void xoa(){
        System.out.printf("Nhap vao ma giang vien thinh giang can xoa: ");
        String s= sc.nextLine();
        boolean tmp=false;
        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i).getMagiangvien().equalsIgnoreCase(s)){
                list.remove(i);
                System.out.println("Da xoa");
                tmp=true;
                break;
            }
        }
        danhsach();
        if(tmp==false){
            System.out.println("Ko co");
        }
    }
}
