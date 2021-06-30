package hackerRank;
import java.io.*;
import java.math.*;
import java.util.*;

public class nonDivisibleSubset{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] s = new int[n];
            int[] t = new int[n + 1];
            int[] ss = new int[n + 1];
            for(int i = 0 ; i < n ; i++){
                s[i] = sc.nextInt();
                for(i = 0 ; i < n ; i++){
                    t[i] = s[i] + s[i+1];
                }
            }for(int i = 0; i<n ; i++){
                if(t[i]%k != 0){
                    ss[i]++ ;
                }
            } System.out.println(ss.length);
        }
    }
