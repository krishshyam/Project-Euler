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
        int t;
        long n,i,high=0;
        Scanner scan = new Scanner(System.in);
        t=scan.nextInt();
        while(t!=0)
            {
            n=scan.nextLong();
            i=2;
            while(i*i<=n)
                {
                while(n%i==0)
                    {
                    n=n/i;
                    high=i;
                }
                i++;
            }
            if(n>1){
                System.out.println(n);
            }
            else
                System.out.println(high);
            t--;
        }
    }
}