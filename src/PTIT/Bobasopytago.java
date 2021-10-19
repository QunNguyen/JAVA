package PTIT;

import java.util.Arrays;
import java.util.Scanner;


public class Bobasopytago {
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        int t = sr.nextInt();
        for (int k = 0; k < t; k++){
            int n =sr.nextInt();
            int arr[] = new int[n];
            int dem = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sr.nextInt();
            }
            int a, b, c;
            Arrays.sort(arr); //sort the array
            for (int i = 0; i < n; i++)
                arr[i] = (arr[i] * arr[i]); //store the square of each element to directly check the pythagoras theorem
            for (int i = 0; i < n; i++) {
                int left = n - 2, right = n - 1;
                a = arr[i]; // first side of the triangle
                while (left > i) {
                    b = arr[left];
                    c = arr[right];
                    int calculated_side = c - b; //if a*a + b*b = c*c then obviously c*c - b*b = a*a , we utilize this to check the condition
                    if (calculated_side == a) {
                        System.out.println("YES");
                        dem++;
                        left++;
                        right--;
                        break;
                    } else if (calculated_side > a) //if side is larger than expected then decrease  the variable pointing at the larger element
                        right--;
                    else // if side is smaller than expected then decrease the variable pointing at the smaller element
                        left--;
                }
                if (dem != 0) break;
            }
            if (dem == 0) System.out.println("NO");
        }
    }
}