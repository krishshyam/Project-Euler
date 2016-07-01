import java.io.*;
import java.util.*;

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
        int t,n,x=2;
        long i;
        long a[]=new long[10002];
        a[2]=3;
        a[1]=2;
        a[0]=1;
        Scanner scan=new Scanner(System.in);
        t=scan.nextInt();
        while(t!=0)
            {
            n=scan.nextInt();
            if(x>=n)
                System.out.println(a[n]);
            else
                {
                for(i=a[x]+2;i<=104743;i+=2)
                    {
                    if(prime(i)==1)
                        {
                        x++;
                        a[x]=i;
                    }
                    if(x==n)
                        break;
                }
                System.out.println(a[x]);
            }
            t--;
        }
    }
}