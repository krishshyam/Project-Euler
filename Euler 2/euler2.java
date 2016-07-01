import java.io.*;
import java.util.*;

public class Solution {
    
    public static void fibonacci(long n)
        {
        long a=1;
        long b=2;
        long t=0;
        if(n<2)
            {
            System.out.println(0);
        }
        else{
                t+=2;
                
                while(true){
                    b=a+b;
                    if(b<=n)
                        {
                    a=b-a;
                    if(b%2==0)
                        t+=b;
                    }
                    else
                        break;
                    
                }
                System.out.println(t);
         
            
        }
   
}
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        long n;
        int t;
        Scanner scan = new Scanner ( System.in);
        t=scan.nextInt();
        while(t!=0)
            {
            n=scan.nextLong();
            fibonacci(n);
            t--;
        }
    }
}