import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
    
    public static long multiply(int a[],int m,int n)
        {
        long ret=1;
        for(int i=m;i<=n;i++)
            {
            ret*=a[i];
        }
        return ret;
    }
    public static long consec(int a[],int n,int k)
        {
        long temp,per;
        int point=0;
        per=multiply(a,0,k-1);
        temp=multiply(a,0,k-1);
        //System.out.println(per);
        for(int i=1;i<n-k+1;i++)
            {
            if(a[point]==0)
                {
                temp=multiply(a,point+1,point+k);
            }
            else
                {
                //System.out.println(a[point]);
                temp=temp/a[point];
                temp*=a[point+k];
            }
            point++;
            //System.out.println(temp);
            if(temp>per)
                {
                per=temp;            
            }
        }
        return per;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,k,t;
        BigInteger num;
        Scanner scan=new Scanner(System.in);
        t=scan.nextInt();
        while(t!=0)
            {
            n=scan.nextInt();
            k=scan.nextInt();
            num=scan.nextBigInteger();
            int a[]=new int[n];
            int l=n-1;
            BigInteger m=num;
            while(l!=-1)
                {
                a[l]=(m.mod(BigInteger.valueOf(10))).intValue();
                m=m.divide(BigInteger.valueOf(10));
                l--;
            }
            long ans=consec(a,n,k);
            System.out.println(ans);
            t--;
        }
    }
}