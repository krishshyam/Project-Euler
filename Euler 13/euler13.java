import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        BigInteger x;
        int n;
        Scanner scan = new Scanner( System.in );
        n=scan.nextInt();
        int m=n;
        x=BigInteger.valueOf(0);
        BigInteger a[]=new BigInteger[n];
        while(n!=0)
            {
            a[m-n]=scan.nextBigInteger();
            x=x.add(a[m-n]);
            n--;
        }
        
        System.out.println(x.toString().substring(0, 10));
    }
}