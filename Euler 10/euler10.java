import java.io.*;
import java.util.*;
import java.math.*;
public class Solution {

    public static int prime(long n)
        {
        long i;
        if (n==2)
            return 1;

        if (n%2==0)
            return 0;

        for (i=3;i<=Math.sqrt(n);i+=2)
            if (n%i==0)
                return 0;

        return 1;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t,n,x=3,i;
        BigInteger cp;
        String str;
        Scanner scan=new Scanner(System.in);
        BigInteger a[]=new BigInteger[1000001];
        a[1]=BigInteger.valueOf(0);
        a[2]=BigInteger.valueOf(2);
        a[3]=BigInteger.valueOf(5);
        t=scan.nextInt();
        while(t!=0)
            {
            n=scan.nextInt();
            if(x>=n)
                {
                str=a[n].toString();
                System.out.println(str);
            } 
            else
                {
                i=x+1;
                cp=a[x];
                for(;i<=n;i++)
                    {
                    if(prime(i)==1)
                        {
                        cp=cp.add(BigInteger.valueOf(i));
                        a[i]=cp;
                        cp=a[i];
                    }
                    else
                        {
                        a[i]=cp;
                    }
                }
                x=n;
                str=a[n].toString();
                System.out.println(str);
            }
            t--;
        }
    }
}