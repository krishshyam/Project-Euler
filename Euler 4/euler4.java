import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {
    
    public static int getrev(int y)
    {
        int x=0;
        while(y>0)
            {
            x=(x*10)+y%10;
            y=y/10;
        }
        return x;
    }

    public static int mult(int n)
        {
        for(int i=101;i<=999;i++)
            {
            if(n%i==0)
                {
                if(((n/i)>=101)&&((n/i)<=999))
                    {
                    return 1;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int a,b,a1,result=0,n,t,length;
        t=scan.nextInt();
        while(t!=0)
            {
            n=scan.nextInt();
            a=n;
            length=0;
            while(a>0)
                {
            a=a/10;
            length++;
            }
            int x=(int)Math.pow(10,(length/2));
            if(length%2==0)
               {
                b=n;
                a=b/x;
                for(int i=0;i<n;i++)
                    {
                        b=(a*x)+getrev(a);
                        if(b<n)
                            {
                            if(mult(b)==1)
                                {
                                result=b;
                                break;
                            }
                            a--;
                        }
                        else 
                            {
                            a--;
                        }
                }
           }
            else
                {
                b=n;
                a=b/x;
                for(int i=0;i<n;i++)
                    {
                        a1=a/10;
                        b=(a*x)+getrev(a1);
                        if(b<n)
                            {
                            if(mult(b)==1)
                                {
                                result=b;
                                break;
                            }
                            a--;
                        }
                        else
                            {
                            a--;
                        }
                }
            }
            System.out.println(result);
            t--;
        }
        
    }
}