import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {
    
    public static int factorial(int n){
        switch(n){
            case 0: return 1;
            case 1: return 1;
            case 2: return 2;
            case 3: return 6;
            case 4: return 24;
            case 5: return 120;
            case 6: return 720;
            case 7: return 5040;
            case 8: return 40320;
            case 9: return 362880;
            default:System.out.println("Error");
        }
        return 0;
    }
    
    public static boolean check(int n)
        {
        BigInteger sum;
        sum=BigInteger.valueOf(0);
        int m=n,a;
        while(m>0)
            {
            a=m%10;
            sum=sum.add(BigInteger.valueOf(factorial(a)));
            m=m/10;
        }
        if(sum.mod(BigInteger.valueOf(n)).intValue()==0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        BigInteger sum;
        sum=BigInteger.valueOf(0);
        if(n<19)
            System.out.println(0);
        else
            {
            for(int i=19;i<=n;i++)
                {
                if(check(i)==true)
                    {
                    sum=sum.add(BigInteger.valueOf(i));
                }
            }
            String str=sum.toString();
            System.out.println(str);
        }
    }
}