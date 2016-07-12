import java.io.*;
import java.util.*;
import java.math.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        int i,n;
        String str;
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        int a[][]=new int[n][2];
        for(i=0;i<n;i++)
            {
            a[i][0]=scan.nextInt();
            a[i][1]=scan.nextInt();
        }
        int k=scan.nextInt();
        double x,y;
        double array[]=new double[n];
        for(i=0;i<n;i++)
            {
            array[i]=a[i][1]*(Math.log(a[i][0]));
        }
        Arrays.sort(array);
        x=array[k-1];
        //str=x.toString();
        //System.out.println(str);
        for(i=0;i<n;i++)
            {
            y=a[i][1]*(Math.log(a[i][0]));
            //str=y.toString();
            //System.out.println(str);
            if(x==y){
                System.out.println(a[i][0]+" "+a[i][1]);
                break;
            }
        }
    }
}