import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {
    
    
    public static BigInteger fact(int n)
        {
        BigInteger big;
        big=BigInteger.valueOf(1);
        for(int i=2;i<=n;i++)
            {
            big=big.multiply(BigInteger.valueOf(i));
            if(i%5==0)
                big=big.divide(BigInteger.valueOf(10));
        }
        return big;
    }
    
    
    public static BigInteger sum(BigInteger x)
        {
        BigInteger sum;
        sum=BigInteger.valueOf(0);
        while (!(x.equals(BigInteger.valueOf(0)))) {
            sum = sum.add(x.mod(BigInteger.valueOf(10)));
            x=x.divide(BigInteger.valueOf(10));
        }
        return sum;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t;
        int m,n;
        Scanner scan=new Scanner(System.in);
        t=scan.nextInt();
        while(t!=0)
            {
            BigInteger big,sums;
            n=scan.nextInt();
            if(n<=1)
                big=BigInteger.valueOf(1);
            else
                big=fact(n);
            sums=sum(big);
            String ans=sums.toString();
            System.out.println(ans);
            t--;
        }
    }
}