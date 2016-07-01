import java.io.*;
import java.util.*;

public class Solution {
    
    public static long sumup(long n)
        {
        long maxD = (long)Math.sqrt(n);
        long sum=1;
        for(long i = 2; i <= maxD; i++)
        {
            if(n % i == 0)
            {
               sum+=i;
               long d = n/i;
               if(d!=i)
                  sum+=d;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        int i,n;
        boolean flag;
        while(t!=0)
            {
            flag=false;
            n=scan.nextInt();
            if(n<=3)
                {
                System.out.println("NO");
                flag=true;
            }
            else
                {
                for(i=2;i<=n/2;i++)
                    {
                    if((sumup(i)>i)&&(sumup(n-i)>(n-i)))
                        {
                        System.out.println("YES");
                        flag=true;
                        break;
                    }
                }
            }
            if(!flag)
                System.out.println("NO");
            t--;
        }
            
    }
}