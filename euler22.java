import java.io.*;
import java.util.*;

public class Solution {
    
    public static int check(String names[],String query,int n)
        {
        for(int i=0;i<n;i++)
            {
            if(names[i].compareTo(query)==0)
                return i;
        }
        return -1;
    }
    
    public static int add(String name)
        {
        char a;
        int sum=0;
        for (int i = 0;i < name.length(); i++)
            {
            a=name.charAt(i);
            sum+=(int)a-64;
        }
        return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i,value;
        String names[]=new String[n];
        for(i=0;i<n;i++)
            names[i]=scan.next();
        int q=scan.nextInt();
        String query[]=new String[q];
        for(i=0;i<q;i++)
            query[i]=scan.next();
        Arrays.sort(names);
        int pos;
        for(i=0;i<q;i++)
            {
            pos=check(names,query[i],n);
            value=add(names[pos]);
            System.out.println(value*(pos+1));
        } 
    }
}