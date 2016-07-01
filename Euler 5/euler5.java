import java.io.*;
import java.util.*;

public class Solution {
    
    public static int GCD(int number1, int number2) {
        if(number2 == 0){
            return number1;
        }
        return GCD(number2, number1%number2);
    }
    
    public static int LCM(int a, int b)
    {
        return a * (b / GCD(a, b));
    }


    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t,s=1,i,n;
        Scanner scan=new Scanner(System.in);
        t=scan.nextInt();
        while(t!=0)
            {
            n=scan.nextInt();
            for (i=n;i>1;i--)
                {
                if(s%i==0)
                    {
                    
                }
                else
                    {
                    int x=LCM(s,i);
                    x=x/s;
                    s*=x;
                }
                    
            }
            System.out.println(s);
            s=1;
            t--;
        }
    }
}