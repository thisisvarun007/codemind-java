import java.util.*;
import java.lang.Math;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int a,b,c;
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       double s=(a+b+c)*(0.5);
       double ar=Math.sqrt(s*(s-a)*(s-b)*(s-c));
       System.out.format("%.2f",ar);
    }
}