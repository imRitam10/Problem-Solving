package hackerRank;
import java.util.Arrays;
import java.util.Scanner;

public class breakingTheRecords {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);

        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++){
           a[i] = s.nextInt();
        }

        int max = a[0];
        int min = a[0];
        int maxResult = 0 , minResult = 0 ;

        for(int i = 1 ; i < n ; i++){
            if(a[i] > max){
                maxResult++;
                max = a[i];
            }if(a[i] < min){
                minResult++;
                min = a[i];
            }
        }
        System.out.print(maxResult + " " + minResult);
    }
}
