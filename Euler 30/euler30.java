import java.io.*;
import java.util.*;
import java.math.*;
public class Solution {
    
    public static long add(long a,int n)
        {
        int b;
        long sum=0;
        while(a>0){
            b=(int)a%10;
            b=(int)Math.pow(b,n);
            sum+=b;
            a=a/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        long sum=0;
        for(long i=2;i<1000000;i++)
            {
            long ans=add(i,n);
            if(ans==i)
                sum+=i;
        }
        System.out.println(sum);
    }
}