package hackerRank;
import java.io.*;
import java.util.*;


public class migratoryBirds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        int[] count = new int[n];
        int max=0;
        for(int types_i=0; types_i < n; types_i++){
            types[types_i] = in.nextInt();
            count[types[types_i]]++;
            if(count[types[types_i]]>max)
                max=count[types[types_i]];
        }
        for(int i=0;i<count.length;i++)
        {
            if(max==count[i])
            {
                System.out.println(i);
                break;
            }
        }
    }
}