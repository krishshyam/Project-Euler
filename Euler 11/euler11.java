import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int a[][] = new int[20][20];
        long ans=0;
        int i,j;
        Scanner scan=new Scanner(System.in);
        for(i=0;i<20;i++)
            {
            for(j=0;j<20;j++)
                {
                a[i][j]=scan.nextInt();
            }
        }
            for(i=0;i<20;i++)
                {
                for(j=0;j<20;j++)
                    {
                    if(i+3<20)
                        {
                        if((a[i][j]*a[i+1][j]*a[i+2][j]*a[i+3][j])>ans)
                        ans=a[i][j]*a[i+1][j]*a[i+2][j]*a[i+3][j];
                    }
                    if(j+3<20)
                        {
                        if((a[i][j]*a[i][j+1]*a[i][j+2]*a[i][j+3])>ans)
                            ans=a[i][j]*a[i][j+1]*a[i][j+2]*a[i][j+3];
                    }
                    if((i+3<20)&&(j+3<20))
                        {
                        if((a[i][j]*a[i+1][j+1]*a[i+2][j+2]*a[i+3][j+3])>ans)
                            ans=a[i][j]*a[i+1][j+1]*a[i+2][j+2]*a[i+3][j+3];
                    }
                    if((i-3>=0)&&(j+3<20))
                        {
                        if((a[i][j]*a[i-1][j+1]*a[i-2][j+2]*a[i-3][j+3])>ans)
                            ans=a[i][j]*a[i-1][j+1]*a[i-2][j+2]*a[i-3][j+3];
                    }
                }
            }
            System.out.println(ans);
            
        }
}