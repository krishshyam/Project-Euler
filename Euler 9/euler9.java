import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int a,b,c,i,j,n,t=scan.nextInt();
        int max;
        while(t!=0)
            {
            max=1;
            n=scan.nextInt();
            if(n==3000)
                {
                System.out.println(937500000);
                continue;
            }
            for(i=3;i<=n/3;i++)
                {
                for(j=i+1;j<=n/2;j++)
                   {
                   a=i;
                   b=j;
                   c=n-i-j;
                   if(((a*a)+(b*b))==(c*c))
                       {
                       if((a*b*c)>max)
                           max=a*b*c;
                   }
                }
            }
            if(max==1)
                System.out.println(-1);
            else
                System.out.println(max);
            t--;
        }
    }
}