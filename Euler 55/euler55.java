import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int ans=1,i,counter,count=0,great=0;
        BigInteger bigp,biggestp=BigInteger.ZERO;
        int bigint=0;
        HashMap<BigInteger,Integer> big= new HashMap<>();
        String s,revs;
        BigInteger p,revp;
        for(i=1;i<=n;i++)
            {
            p=BigInteger.valueOf(i);
            counter=0;
            s=p.toString();
            while((!(s.equals(new StringBuilder(s).reverse().toString())))&&(counter<60)){
            s=p.toString();
            revs=new StringBuilder(s).reverse().toString();
            revp=new BigInteger(revs);
            p=p.add(revp);
            s=p.toString();
            counter++;    
            }
            if((counter<60))
                {
                bigp=p;
                if(big.containsKey(bigp))
                    {
                    if(bigint<big.get(bigp))
                        {
                        bigint=big.get(bigp);
                        biggestp=bigp;
                    }
                    big.put(bigp,(big.get(bigp)+1));
                }
                else
                    {
                    big.put(bigp,1);
                }
            }
        }
        System.out.println(biggestp.toString()+" "+big.get(biggestp));
    }
}