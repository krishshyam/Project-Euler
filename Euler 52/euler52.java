import java.io.*;
import java.util.*;

public class Solution {
    public static boolean i=true;
    
    public static void printans(long n,int k)
        {
        if(!i)
            {
            System.out.println();
        }
        System.out.print(n);
        for(int i=2;i<=k;i++)
            {
            System.out.print(" "+n*i);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan=new Scanner(System.in);
        long n;
        n=scan.nextLong();
        int k,l;
        l=scan.nextInt();
        String p,q;
        char[] a,b;
        boolean flag;
        long x;
        for(long j=125874;j<=n;j++)
            {
                p=String.valueOf(j);
                a=p.toCharArray();
                Arrays.sort(a);
                flag=false;
                for(k=2;k<=l;k++)
                    {
                    x=j*k;
                    q=String.valueOf(x);
                    b=q.toCharArray();
                    Arrays.sort(b);
                    if(!(Arrays.equals(a,b)))
                        {
                        flag=true;
                        break;
                    }
            }
            if(!flag)
                {
                printans(j,l);
                i=false;
            }
        }
    }
}