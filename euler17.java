import java.io.*;
import java.util.*;

public class Solution {
    
    public static String str="";
    
    public static void sendme(int n)
        {
        HashMap<Integer,String> ones=new HashMap<>();
        ones.put(1,"One");
        ones.put(2,"Two");
        ones.put(3,"Three");
        ones.put(4,"Four");
        ones.put(5,"Five");
        ones.put(6,"Six");
        ones.put(7,"Seven");
        ones.put(8,"Eight");
        ones.put(9,"Nine");
        ones.put(0,"Zero");
        ones.put(10,"Ten");
        ones.put(11,"Eleven");
        ones.put(12,"Twelve");
        ones.put(13,"Thirteen");
        ones.put(14,"Fourteen");
        ones.put(15,"Fifteen");
        ones.put(16,"Sixteen");
        ones.put(17,"Seventeen");
        ones.put(18,"Eighteen");
        ones.put(19,"Nineteen");
        ones.put(20,"Twenty");
        ones.put(30,"Thirty");
        ones.put(40,"Forty");
        ones.put(50,"Fifty");
        ones.put(60,"Sixty");
        ones.put(70,"Seventy");
        ones.put(80,"Eighty");
        ones.put(90,"Ninety");
        //System.out.println(n);
        if(n!=0)
            {
            if(n/100!=0)
                {
                str=str.concat(ones.get(n/100) + " Hundred ");
            }
            n=n%100;
            if(n!=0)
                {
                if(n<=19)
                    {
                    str=str.concat(ones.get(n));
                }
                else{
                    //System.out.println((n/10)+
                    if(n%10!=0)
                        str=str.concat(ones.get((n/10)*10)+" "+ones.get(n%10));
                    else
                        str=str.concat(ones.get((n/10)*10));
                }
            }
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
        int t=scan.nextInt();
        long n;
        int i;
        ArrayList<String> denom=new ArrayList<String>();
        denom.add(0,"");
        denom.add(1,"Thousand");
        denom.add(2,"Million");
        denom.add(3,"Billion");
        ArrayList<Long> tenpow=new ArrayList<Long>();
        tenpow.add(0,0L);
        tenpow.add(1,1000L);
        tenpow.add(2,1000000L);
        tenpow.add(3,1000000000L);
        while(t!=0)
            {
            n=scan.nextLong();
            if(n==1000000000000L)
                System.out.println("One Trillion");
            else
                {
                for(i=3;i>=1;i--)
                    {
                    //System.out.println(n);
                    if(n/tenpow.get(i)!=0)
                        {
                        sendme((int)(n/tenpow.get(i)));
                        str=str.concat(" "+denom.get(i)+" ");
                        n=(long)(n%tenpow.get(i));
                        //System.out.println(n);
                    }
                }
                sendme((int)(n));
            }
            t--;
            str=str.trim();
            str.replaceAll("  "," ");
            System.out.println(str);
            str="";
        }       
    }
}