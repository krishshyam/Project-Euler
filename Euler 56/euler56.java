import java.io.*;
import java.util.*;
import java.math.*;
public class Solution {
    
    public static int counting(String str)
        {
         int sum = 0;
         for (char c : str.toCharArray()) {
             sum += c - '0';
         }
         return sum;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int i,j;
        int pcount,count=0;
        String ans;
        BigInteger big;
        for(i=1;i<n;i++)
            {
            for(j=1;j<n;j++)
                {
                big=BigInteger.valueOf(i).pow(j);
                ans=big.toString();
                pcount=counting(ans);
                if(pcount>count)
                    count=pcount;
            }
        }
        System.out.println(count);
    }
}