import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int t,n;
        long a,b;
        Scanner scan=new Scanner(System.in);
        t=scan.nextInt();
        while(t!=0)
            {
            n=scan.nextInt();
            a=n*(n+1)/2;
            a=a*a;
            b=n*(n+1)/2;
            b=b*((2*n)+1)/3;
            System.out.println(a-b);
            t--;
        }
    }
}