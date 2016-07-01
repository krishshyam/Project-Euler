import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {
    
    public static BigInteger ncr(int n, int r) {
    if(r > n / 2) 
        r = n - r; 
    BigInteger ans;
    ans=BigInteger.valueOf(1);
    int i;

    for(i = 1; i <= r; i++) {
        ans=ans.multiply(BigInteger.valueOf(n - r + i));
        ans=ans.divide(BigInteger.valueOf(i));
    }

    return ans;
}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        int m,n;
        Scanner scan=new Scanner(System.in);
        t=scan.nextInt();
        while(t!=0)
            {
            m=scan.nextInt();
            n=scan.nextInt();
            BigInteger ans;
            if(n<m)
                ans=ncr(m+n,n);
            else
                ans=ncr(m+n,m);
            ans=ans.mod(BigInteger.valueOf(1000000007));
            String a=ans.toString();
            System.out.println(a);
            t--;
        }
    }
}