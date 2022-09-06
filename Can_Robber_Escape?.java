import java.util.*;
import java.lang.Math;
class Solution
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       int a,i;
       a=sc.nextInt();
       int[] arr=new int[a+1];
       for (i=1; i<a+1; i++){
           arr[i]=sc.nextInt();
       }
       int f=1;
       for (i=1; i<a+1; i++)
       {
           if (arr[i]>=a)
           {
               f=0;
               break;
           }
       }
       if (f==1){
           System.out.print("YES");
       }
       else{
           System.out.print("NO");
       }
    }
}