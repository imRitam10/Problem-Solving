package hackerRank;
import java.util.Arrays;
import java.util.Scanner;

public class subarrayDivision {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i < n ; i++){
           a[i] = in.nextInt();
        }
        int m = in.nextInt();
        int d = in.nextInt();
        int res = 0 ;
        for(int i=0;i+m-1<n;i++){
            int sum=0;
            for(int j=i;j<i+m;j++){
                sum+=a[j];
            }if(sum==d){
                res++;
            }
        }
        System.out.print(res);
    }
}
