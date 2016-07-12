import java.io.*;
import java.util.*;
import java.math.*;
public class Solution {
 
        public static int maxValue(int[][] field,int n) {
            int[][] maxValues = new int[n][n];
            int i,j;
            for (i = 0; i < n; i++) {
                for (j = 0; j <n; j++) {
                    if (i == 0 && j == 0) {
                        maxValues[i][j] = field[i][j];
                    } else if (i == 0) {
                        maxValues[i][j] = field[i][j];
                    } else if (j == 0) {
                        maxValues[i][j] = maxValues[i-1][j] + field[i][j];
                    } else {
                        maxValues[i][j] = Math.max(maxValues[i-1][j-1], maxValues[i-1][j]) + field[i][j];
                    }
                }
            }
            /*for(i=0;i<n;i++)
                {
                for(j=0;j<=i;j++)
                    System.out.print(maxValues[i][j]+" ");
                System.out.println();
            }*/
            int max=0;
            for(i=0;i<n;i++)
                if(maxValues[n-1][i]>max)
                    max=maxValues[n-1][i];
            return max;
        }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        while(t!=0)
            {
            int n=scan.nextInt();
            int a[][]=new int[n][n];
            for(int i=0;i<n;i++)
                {
                for(int j=0;j<n;j++)
                    {
                    if(j<=i)
                        a[i][j]=scan.nextInt();
                    else
                        a[i][j]=-200;
                }
            }
            System.out.println(maxValue(a,n));
            t--;
        }
    }
}