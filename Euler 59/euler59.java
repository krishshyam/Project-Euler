import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int i,j,x,y,n=scan.nextInt();
        int a[]=new int[n];
        int k[]=new int[3];
        boolean flag;
        for(i=0;i<n;i++)
            {
            a[i]=scan.nextInt();
        }
        for(i=97;i<123;i++)
            {
            flag=false;
            for(j=0;j<n;j+=3)
                {
                x=i^a[j];
                if(!(((x>=97)&&(x<=122))||((x>=65)&&(x<=90))||((x>=48)&&(x<=59))||(x==32)||((x>=39)&&(x<=41))||((x>=44)&&(x<=46))||(x==33)||(x==63)))
                   {
                       flag=true;
                       break;
                   }
            }
            if(!flag)
                {
                k[0]=i;
                break;
            }
        }
        for(i=97;i<123;i++)
            {
            flag=false;
            for(j=1;j<n;j+=3)
                {
                x=i^a[j];
                if(!(((x>=97)&&(x<=122))||((x>=65)&&(x<=90))||((x>=48)&&(x<=59))||(x==32)||((x>=39)&&(x<=41))||((x>=44)&&(x<=46))||(x==33)||(x==63)))
                   {
                       flag=true;
                       break;
                   }
            }
            if(!flag)
                {
                k[1]=i;
                break;
            }
        }
        for(i=97;i<123;i++)
            {
            flag=false;
            for(j=2;j<n;j+=3)
                {
                x=i^a[j];
                if(!(((x>=97)&&(x<=122))||((x>=65)&&(x<=90))||((x>=48)&&(x<=59))||((x>=39)&&(x<=41))||((x>=44)&&(x<=46))||(x==33)||(x==63)||(x==32)))
                   {
                       flag=true;
                       break;
                   }
            }
            if(!flag)
                {
                k[2]=i;
                break;
            }
        }
        char key[]=new char[3];
        //System.out.println(k[2]);
        /*for(i=2;i<n;i+=3)
            {
            System.out.println(((char)(a[i]^k[i%3]))+"--"+(a[i]^k[i%3]));
        }*/
        key[0]=(char)k[0];
        key[1]=(char)k[1];
        key[2]=(char)k[2];
        System.out.println(key);
        //System.out.println(k[0]+k[1]+k[2]);
    }
}