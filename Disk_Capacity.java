import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int a,b,c;
       a=sc.nextInt();
       b=sc.nextInt();
       c=sc.nextInt();
       long res=2*a*b*c*512;
       System.out.print(res);
    }
}