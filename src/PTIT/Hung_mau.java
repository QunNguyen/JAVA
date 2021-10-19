package PTIT;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Hung_mau {
    public static String ChuanHoa (String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<s.length();i++)
        {
            if(i==0) sb.append(Character.toUpperCase(s.charAt(i)));
            else sb.append(Character.toLowerCase(s.charAt(i)));
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for(int x=0;x<t ;x++)
//        {
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(s);
        String[] arr = new String[100];
        int cnt = 0;
        while(st.hasMoreTokens())
        {
            arr[cnt++] = st.nextToken();
        }
        for(int i=0;i<cnt;i++)
        {
            sb.append(ChuanHoa(arr[i]));
            if(i != cnt-1) sb.append(" ");
        }
        System.out.println(sb);

//        }

    }
}
