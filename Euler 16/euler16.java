import java.io.*;
import java.util.*;
import java.math.*;
public class Solution {
    
    public static int add(BigInteger big)
        {
        int sum=0,b,a;
        while(big.equals(BigInteger.valueOf(0))==false)
            {
            a=(big.mod(BigInteger.valueOf(10))).intValue();
            sum+=a;
            big=big.divide(BigInteger.valueOf(10));
        }
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        int n,sum;
        BigInteger a;
        a=BigInteger.valueOf(2);
        while(t!=0)
            {
            n=scan.nextInt();
            a=a.pow(n);
            sum=add(a);
            a=BigInteger.valueOf(2);
            System.out.println(sum);
            t--;
        }
    }
}