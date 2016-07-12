import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int k=scan.nextInt();
        int a[]=new int[10];
        int b[]=new int[10];
        int c[]=new int[10];
        int i,j;
        a[0]=-1;
        b[0]=-1;
        c[0]=-1;
        if(k==8)
            {
            a[9]=-1;
            b[9]=-1;
            c[9]=-1;
        }
        else
            {
            a[9]=9;
            b[9]=9;
            c[9]=-1;
        }
        boolean ans,flag=true;;
        for(i=1;i<9;i++)
            {
            a[i]=i;
            b[i]=i;
            c[i]=-1;
        }
        for(i=8;i<n;i++)
            {
            flag=true;
            ans=true;
            for(j=1;;j++)
                {
                k=i*j;
                //System.out.println(k);
                while(k>0)
                    {
                    //System.out.println(k%10+"----"+b[k%10]);
                    if(b[k%10]!=-1)
                        b[k%10]=-1;
                    else
                        {
                        //System.out.println(k%10);
                        ans=false;
                        flag=false;
                        break;
                    }
                    k=k/10;
                }
                if(!flag)
                    break;
                //System.out.println(Arrays.toString(b));
                if(Arrays.equals(b,c))
                    {
                    //System.out.println(Arrays.equals(b,c)+"-----"+ans);
                    break;
                }
            }
            if(ans)
                System.out.println(i);
            b=Arrays.copyOf(a,a.length);
        }
    }
}