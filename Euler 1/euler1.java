import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        long m,n,t;
        BigInteger s;
        Scanner scan = new Scanner(System.in);
        t=scan.nextInt();
        while(t!=0)
        {
            m=scan.nextInt();
            m--;
            s=BigInteger.valueOf(0);
            n=m;
            while(n%3!=0)
                n--;
            if(n!=0)
                {
                n=n/3;
                n=n*(n+1)/2;
                n*=3;
                s=s.add(BigInteger.valueOf(n));
            }
            n=m;
            while(n%5!=0)
                n--;
            if(n!=0)
                {
                n=n/5;
                n=n*(n+1)/2;
                n*=5;
                s=s.add(BigInteger.valueOf(n));
            }
            n=m;
            while(n%15!=0)
                n--;
            if(n!=0)
                {
                n=n/15;
                n=n*(n+1)/2;
                n*=15;
                s=s.subtract(BigInteger.valueOf(n));
            }
            String str=s.toString();
            System.out.println(str);
            t--;
        }
    }
}