import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {
    
    public static boolean prime(int num){
        if ( num > 2 && num%2 == 0 ) {
            //System.out.println(num + " is not prime");
            return false;
        }
        int top = (int)Math.sqrt(num) + 1;
        for(int i = 3; i < top; i+=2){
            if(num % i == 0){
                //System.out.println(num + " is not prime");
                return false;
            }
        }
        //System.out.println(num + " is prime");
        return true; 
    }

    public final static boolean square(int n)
    {
        int h = n & 0xF;
        if (h > 9)
            return false;
        if (h != 2 && h != 3 && h != 5 && h != 6 && h != 7 && h != 8)
        {
            int t = (int) Math.floor( Math.sqrt((double) n) + 0.5 );
            return t*t == n;
        }
        return false;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        int n,i,sum,x;
        while(t!=0)
            {
            sum=0;
            n=scan.nextInt();
            t--;
            for(i=3;i<=n-2;i+=2)
                {
                if(prime(i))
                    {
                    x=n-i;
                    if(square(x/2))
                        sum+=1;
                }
            }
            System.out.println(sum);
        }
        
    }
}