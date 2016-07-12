import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {
    
    public static BigInteger big=BigInteger.valueOf(1000000007);
    public static long count(BigInteger table[], int S[], int m, int n )
    {
        table[0] = BigInteger.ONE;
        for(int i=1;i<n+1;i++)
            table[i]=BigInteger.ZERO;
        for(int i=0; i<m; i++)
            for(int j=S[i]; j<=n; j++)
                table[j] = table[j].add(table[j-S[i]]);
        return (table[n].mod(big)).longValue();
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,t;
        int a[]=new int[8];
        a[0]=1;
        a[1]=2;
        a[2]=5;
        a[3]=10;
        a[4]=20;
        a[5]=50;
        a[6]=100;
        a[7]=200;
        Scanner scan=new Scanner(System.in);
        t=scan.nextInt();
        BigInteger table[]=new BigInteger[100002];
        count(table,a,8,100001);
        while(t!=0)
            {
            n=scan.nextInt();
            /*if(n==100000)
                {
                System.out.println("836633026");
                continue;
            }*/
            BigInteger ans=table[n].mod(big);
            System.out.println(ans);
            t--;
        }
    }
}