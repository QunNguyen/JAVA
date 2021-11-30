package PTIT;


import java.util.Scanner;

public class matrannhiphan {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [][]a=new int[n][3];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j]=sc.nextInt();
            }
        }

        int dem=0;
        for (int i = 0; i < n; i++) {
            int dem1=0;
            int dem0=0;
            for (int j = 0; j < 3; j++) {
                if(a[i][j]==0){
                    dem0++;
                }
                else dem1++;
            }
            if(dem1>dem0) dem++;
        }
        System.out.println(dem);
    }
}
