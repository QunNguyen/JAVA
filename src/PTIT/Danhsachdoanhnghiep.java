package PTIT;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Danhsachdoanhnghiep {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc=new Scanner(new File("DN.in"));
        List<thuctap3> list=new ArrayList<>();
        int t=Integer.parseInt(sc.nextLine());
        for (int i = 0; i <t; i++) {
            thuctap3 std=new thuctap3(sc.nextLine(), sc.nextLine(),Integer.parseInt(sc.nextLine()) );
            list.add(std);
        }
        Collections.sort(list, new Comparator<thuctap3>() {
            @Override
            public int compare(thuctap3 o1, thuctap3 o2) {
                if(o1.madn.compareTo(o2.madn)<0){
                    return -1;
                }
                return 1;
            }
        });
        for (thuctap3 i:list) {
            i.show();
            System.out.println();
        }
    }
}

class thuctap3{
    String madn;
    String tendn;
    int sl;

    public thuctap3(String madn, String tendn, int sl) {
        this.madn = madn;
        this.tendn = tendn;
        this.sl = sl;
    }

    public void show(){
        System.out.print(madn+" "+tendn+" "+sl);
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public String getMadn() {
        return madn;
    }

    public void setMadn(String madn) {
        this.madn = madn;
    }
}
