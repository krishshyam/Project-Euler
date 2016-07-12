import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {
    
    private static boolean prime(long num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }
    
    private static boolean fromleft(long n)
        {
        while(n>0)
            {
            if(prime(n)==true)
                {
                n=n/10;   
            }
            else
                {
                return false;
            }
        }
        return true;
    }

       
    private static boolean fromright(long n)
        {
        long a,m=n;
        long count=0;
        while(m>0)
            {
            m=m/10;
            count++;
        }
        m=n;
        while(count!=0)
            {
            if(prime(m)==true)
                {
                n=n/10;   
            }
            else
                {
                return false;
            }
            m=m%(long)Math.pow(10,count-1);
            count--;
        }
        return true;
    }

    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan=new Scanner(System.in);
        long n =scan.nextLong();
        BigInteger sum=BigInteger.valueOf(0);
        if(n>10)
            {
            for (long i=11;i<=n;i++)
                {
                if(fromleft(i)&&fromright(i))
                    {
                    sum=sum.add(BigInteger.valueOf(i));
                }
            }
        }
        String str=sum.toString();
        System.out.println(str);
    }
}