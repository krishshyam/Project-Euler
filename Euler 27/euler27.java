import java.io.*;
import java.util.*;

public class Solution {
    
    private static boolean prime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }
    
    public static int primes(int a,int b,int n)
        {
        int p;
        int sum=0;
        for(int i=0;i<=n;i++)
            {
            p=(i*i)+(a*i)+b;
            if(prime(p)==true)
                sum++;
            else
                break;
        }
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n =scan.nextInt();
        int a,b;
        int p;
        int i,j;
        a=-n;
        b=-n;
        int sum=0;
        int psum;
        for(i=-n;i<=n;i++)
            {
            for(j=-n;j<=n;j++)
                {
                psum=primes(i,j,n);
                if(psum>sum)
                    {
                    sum=psum;
                    a=i;
                    b=j;
                }
            }
        }
        System.out.println(a+" "+b);
    }
}