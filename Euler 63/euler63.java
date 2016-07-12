import java.io.*;
import java.util.*;
import java.math.*;
public class Solution {
    public static int check(BigInteger a)
        {
        BigInteger b,x;
        b=BigInteger.ZERO;
        int sum=0;
        while(!(a.equals(b)))
            {
            x=a.mod(BigInteger.TEN);
            a=a.divide(BigInteger.TEN);
            sum++;
        }
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scan=new Scanner(System.in);
        int x,n=scan.nextInt();
        BigInteger a,b;
        String str;
        for(int i=1;;i++)
            {
            a=BigInteger.valueOf(i);
            a=a.pow(n);
            x=check(a);
            if(x==n)
                {
                str=a.toString();
                System.out.println(str);
            }
            if(x>n)
                break;
        }
    }
}