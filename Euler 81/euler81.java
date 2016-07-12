import java.io.*;
import java.util.*;
import java.math.*;
public class Solution {
 
        public static long minpath(long[][] array,int n) {
            long[][] minvalues = new long[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == 0 && j == 0) {
                        minvalues[i][j] = array[i][j];
                    } else if (i == 0) {
                        minvalues[i][j] = minvalues[i][j-1] + array[i][j];
                    } else if (j == 0) {
                        minvalues[i][j] = minvalues[i-1][j] + array[i][j];
                    } else {
                        minvalues[i][j] = Math.min(minvalues[i][j-1], minvalues[i-1][j]) + array[i][j];
                    }
                }
            }
            return minvalues[n-1][n-1];
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        long a[][]=new long[n][n];
        for(int i=0;i<n;i++)
            {
            for(int j=0;j<n;j++)
                {
                a[i][j]=scan.nextLong();
            }
        }
        System.out.println(minpath(a,n));     
    }
}