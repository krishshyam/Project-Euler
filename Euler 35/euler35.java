import java.io.*;
import java.util.*;
import java.math.*;
public class Solution {
    public static boolean prime(int num){
        if ( num > 2 && num%2 == 0 ) {
            return false;
        }
        int top = (int)Math.sqrt(num) + 1;
        for(int i = 3; i < top; i+=2){
            if(num % i == 0){
                return false;
            }
        }
        return true; 
    }
    
    public static boolean check(int m,int n)
        {
        int i;
        if(!prime(m))
            return false;
        int x=m;
        int length=0;
        while(x!=0)
            {
            x=x/10;
            length++;
        }
        //System.out.println(length);
        x=m;
        int p=(int)Math.pow(10,(length-1));
        for(i=0;i<length;i++)
            {
            //System.out.println(x);
            x=((x%10)*p)+(x/10);
            if(x>n)
                return false;
            if(!prime(x))
                return false;            
        }
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        long sum=17;
        if(n>=9)
            {
            for(int i=9;i<n;i++)
                {
                if(check(i,n))
                    {
                    //System.out.println(i);
                    sum+=i;
                }
            }
        }
        System.out.println(sum);
    }
}