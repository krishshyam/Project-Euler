import java.io.*;
import java.util.*;

public class Solution {
    
    public static void alter(char a[],int x)
        {
        int i;
        if(x>11)
            return;
        for(i=x;i<=11;i++)
            {
            a[i]=a[i+1];
        }
        a[i]='\0';
    }
    
    

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        long m,n,x;
        int pos=0;
        char[] b = new char[13];
        long f[]=new long[13];
        while(t!=0)
            {
            b="abcdefghijklm".toCharArray();
            f[0] = 1;
            f[2] = 2;
            f[3] = 6;
            f[4]= 24;
            f[5] = 120;
            f[6]= 720;
            f[7] = 5040;
            f[8] = 40320;
            f[9]= 362880;
            f[10] = 3628800;
            f[11]= 39916800;
            f[12]= 479001600;
            f[1]= 1;
            n=scan.nextLong();
            m=n;
            if(n==1)
                System.out.println("abcdefghijklm");
            else
                {
                for(int i=13;i>=1;i--)
                    {
                    pos=(int)(m/f[i-1]);
                    x=m-(pos*f[i-1]);
                    if(x==0)
                        {
                        pos--;
                        m-=(pos*f[i-1]);
                    }
                    else
                        m=x;
                    System.out.print(b[pos]);
                    alter(b,pos);
                }
                System.out.println();
            }
            t--;
        }
    }
}